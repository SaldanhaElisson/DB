package br.com.conta.DAO;

import br.com.conta.model.Cobranca;
import br.com.conta.model.Tarifa;
import br.com.conta.model.Medicao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class CobrancaDAO extends ConexaoDB {
    private static final String INSERT_COBRANCA_SQL = "INSERT INTO cobranca (id, mes_referencia, ano_referencia, tarifa_id, medicao_id) VALUES (?, ?, ?, ?, ?) ;";
    private static final String SELECT_COBRANCA_BY_ID = "SELECT id, mes_referencia, ano_referencia, tarifa_id, medicao_id FROM cobranca WHERE id = ?";
    private static final String SELECT_ALL_COBRANCA= "SELECT * FROM cobranca;";
    private static final String DELETE_COBRANCA_SQL = "DELETE FROM cobranca WHERE id = ?;";
    private static final String UPDATE_COBRANCA_SQL = "UPDATE cobranca SET mes_referencia = ?, ano_referencia = ?, tarifa_id = ?, medicao_id = ?, WHERE id = ?;";

    private static TarifaDAO tarifaDAO = new TarifaDAO();
    private static MedicaoDAO medicaoDAO = new MedicaoDAO();
    public void insertCobranca(Cobranca entidade) {
        try (PreparedStatement preparedStatement = prepararSQL(INSERT_COBRANCA_SQL)) {
            preparedStatement.setString(1, entidade.getMes_referencia());
            preparedStatement.setString(2, entidade.getAno_referencia());
            preparedStatement.setInt(3, entidade.getTarifaModel());
            preparedStatement.setInt(4, entidade.getMedicaoModel());


        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public Cobranca selectCobrancaById(int id) {
        Cobranca entidade = null;
        try (PreparedStatement preparedStatement = prepararSQL(SELECT_COBRANCA_BY_ID)) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String mes_referencia = rs.getString("mes_referencia");
                String ano_referencia = rs.getString("ano_referencia");
                int tarifa_id = rs.getInt("tarifa_id");
                Tarifa tarifa = tarifaDAO.selectTarifaById(tarifa_id);
                int medicao_id = rs.getInt("medicao_id");
                Medicao medicao = medicaoDAO.selectMedicaoById(medicao_id);
                entidade = new Cobranca(id, mes_referencia, ano_referencia, tarifa, medicao);
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return entidade;
    }

    public List<Cobranca> selectAllCobranca() {
        List<Cobranca> entidades = new ArrayList<>();
        try (PreparedStatement preparedStatement = prepararSQL(SELECT_ALL_COBRANCA)) {
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String mes_referencia = rs.getString("mes_referencia");
                String ano_referencia = rs.getString("ano_referencia");
                int tarifa_id = rs.getInt("tarifa_id");
                Tarifa tarifa = tarifaDAO.selectTarifaById(tarifa_id);
                int medicao_id = rs.getInt("medicao_id");
                Medicao medicao = medicaoDAO.selectMedicaoById(medicao_id);
                entidades.add(new Cobranca(id, mes_referencia, ano_referencia, tarifa, medicao));
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return entidades;
    }

    public boolean deleteCobranca(int id) throws SQLException {
        try (PreparedStatement statement = prepararSQL(DELETE_COBRANCA_SQL)) {
            statement.setInt(1, id);
            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean updateCobranca(Cobranca entidade) throws SQLException {
        try (PreparedStatement statement = prepararSQL(UPDATE_COBRANCA_SQL)) {
            statement.setString(1, entidade.getMes_referencia());
            statement.setString(2, entidade.getAno_referencia());
            statement.setInt(3, entidade.getTarifaModel());
            statement.setInt(4, entidade.getMedicaoModel());
            statement.setInt(5, entidade.getId());

            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}