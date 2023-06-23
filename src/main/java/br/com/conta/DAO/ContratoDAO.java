package br.com.conta.DAO;

import br.com.conta.model.*;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class ContratoDAO extends ConexaoDB{
    private static final String INSERT_CONTRATO_SQL = "INSERT INTO contrato (descricao, data_inicio, data_criacao, medidor_id, class_id, cliente_id) VALUES (?, ?, ?, ?, ?, ?) ;";
    private static final String SELECT_CONTRATO_BY_ID = "SELECT id, descricao, data_inicio, data_criacao,  medidor_id,  class_id, cliente_id FROM contrato WHERE id = ?";
    private static final String SELECT_ALL_CONTRATO = "SELECT * FROM contrato;";
    private static final String DELETE_CONTRATO_SQL = "DELETE FROM contrato WHERE id = ?;";
    private static final String UPDATE_CONTRATO_SQL = "UPDATE poste SET , descricao = ?, data_inicio = ?, data_criacao = ?, medidor_id = ?, class_id = ?, cliente_id = ? WHERE id = ?;";
    private static final ClasseDAO classeDAO = new ClasseDAO();
    private static final MedidorDAO medidorDAO = new MedidorDAO();
    private static final ClienteDAO clienteDAO = new ClienteDAO();
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
    public Contrato selectContratoById(int id) {
        Contrato entidade = null;
        try (PreparedStatement preparedStatement = prepararSQL(SELECT_CONTRATO_BY_ID)) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String descricao = rs.getString("descricao");
                Timestamp dataInicio = rs.getTimestamp("data_inicio");
                Timestamp dataCriacao = rs.getTimestamp("data_criacao");
                Integer medidorId = rs.getInt("medidor_id");
                Integer classeId = rs.getInt("class_id");
                Integer clienteId = rs.getInt("cliente_id");

                Medidor medidor = medidorDAO.selectMedidorById(medidorId);
                Classe classe = classeDAO.selectClasseById(classeId);
                Cliente cliente = clienteDAO.selectCliente(clienteId);

                entidade = new Contrato(id, descricao, dataInicio, dataCriacao, medidor, classe, cliente);

            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return entidade;
    }
    public List<Contrato> selectAllContrato() {
        List<Contrato> entidades = new ArrayList<>();
        try (PreparedStatement preparedStatement = prepararSQL(SELECT_ALL_CONTRATO)) {
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String descricao = rs.getString("descricao");
                Timestamp dataInicio = rs.getTimestamp("data_inicio");
                Timestamp dataCriacao = rs.getTimestamp("data_criacao");
                Integer medidorId = rs.getInt("medidor_id");
                Integer classeId = rs.getInt("class_id");
                Integer clienteId = rs.getInt("cliente_id");

                Medidor medidor = medidorDAO.selectMedidorById(medidorId);
                Classe classe = classeDAO.selectClasseById(classeId);
                Cliente cliente = clienteDAO.selectCliente(clienteId);

                entidades.add(new Contrato(id, descricao, dataInicio, dataCriacao, medidor, classe, cliente));
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidades;
    }

    public boolean deleteContrato(int id) throws SQLException {
        try (PreparedStatement statement = prepararSQL(DELETE_CONTRATO_SQL)) {
            statement.setInt(1, id);
            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean updateContrato(Contrato entidade) throws SQLException {
        try (PreparedStatement statement = prepararSQL(UPDATE_CONTRATO_SQL)) {
            statement.setString(1, entidade.getDescricao());
            statement.setTimestamp(2, entidade.getData_inicio());
            statement.setTimestamp(3, entidade.getData_criacao());
            statement.setInt(4, entidade.getMedidorId());
            statement.setInt(5, entidade.getClasseId());
            statement.setInt(6, entidade.getClienteId());

            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
