package br.com.conta.DAO;

import br.com.conta.model.Cobranca;
import br.com.conta.model.Contrato;
import br.com.conta.model.Medicao;
import br.com.conta.model.Tarifa;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ContratoDAO extends ConexaoDB{

    private static final String INSERT_CONTRATO_SQL = "INSERT INTO contrato (descricao, data_inicio, data_criacao, medidor_id, class_id, cliente_id) VALUES (?, ?, ?, ?, ?, ?) ;";
    private static final String SELECT_POSTE_BY_ID = "SELECT id, latitude, longitude, codigo, observacao FROM poste WHERE id = ?";
    private static final String SELECT_ALL_POSTE= "SELECT * FROM poste;";
    private static final String DELETE_POSTE_SQL = "DELETE FROM poste WHERE id = ?;";
    private static final String UPDATE_POSTE_SQL = "UPDATE poste SET , latitude = ?, longitude = ?, codigo = ?, observacao = ? WHERE id = ?;";


    public void insertContrato(Contrato entidade) {
        try (PreparedStatement preparedStatement = prepararSQL(INSERT_CONTRATO_SQL)) {
            preparedStatement.setString(1, entidade.getDescricao());
            preparedStatement.setTimestamp(2, entidade.getData_inicio());
            preparedStatement.setTimestamp(3, entidade.getData_criacao());
            preparedStatement.setInt(4, entidade.getMedidorId());
            preparedStatement.setInt(5, entidade.getClasseId());
            preparedStatement.setInt(6, entidade.getClienteId());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


//    public ContratoDAO selectContratoById(int id) {
//        Cobranca entidade = null;
//        try (PreparedStatement preparedStatement = prepararSQL(SELECT_COBRANCA_BY_ID)) {
//            preparedStatement.setInt(1, id);
//            ResultSet rs = preparedStatement.executeQuery();
//
//            while (rs.next()) {
//                String mes_referencia = rs.getString("mes_referencia");
//                String ano_referencia = rs.getString("ano_referencia");
//                int tarifa_id = rs.getInt("tarifa_id");
//                Tarifa tarifa = tarifaDAO.selectTarifaById(tarifa_id);
//                int medicao_id = rs.getInt("medicao_id");
//                Medicao medicao = medicaoDAO.selectMedicaoById(medicao_id);
//                entidade = new Cobranca(id, mes_referencia, ano_referencia, tarifa, medicao);
//            }
//        } catch (SQLException e) {
//            printSQLException(e);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//        return entidade;
//    }
}
