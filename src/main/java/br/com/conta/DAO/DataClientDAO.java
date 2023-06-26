package br.com.conta.DAO;

import br.com.conta.model.Cliente;
import br.com.conta.model.Pessoa;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class DataClientDAO extends ConexaoDB{

    private static final String SELECT_DATA_CLIENT_BY_ID ="SELECT  tipo_fase.descricao AS tipo_fase, rota.descricao AS rota,  medidor.descricao AS medidor," +
    "poste.codigo AS poste, " +
    "pessoa.nome AS nome," +
    "pessoa.cpf AS cpf, " +
    "pessoa.cnpj AS cnpj, " +
    "classe.descricao AS classe " +
    "FROM tipo_fase " +
    "INNER JOIN classe ON classe.id_tipo_fase = tipo_fase.id " +
    "INNER JOIN contrato ON contrato.class_id = classe.id " +
    "INNER JOIN medidor ON medidor.id = contrato.medidor_id " +
    "INNER JOIN rota ON rota.id = medidor.roda_id " +
    "INNER JOIN poste ON poste.id = medidor.poste_id " +
    "INNER JOIN cliente ON cliente.id = contrato.cliente_id " +
    "INNER JOIN pessoa ON pessoa.id = cliente.pessoa_id " +
    "WHERE pessoa.cpf = ?; ";



    public String  selectDataClinet( String cpf) {
        Cliente entidade = null;
        String nomeResponse = null;
        try (PreparedStatement preparedStatement = prepararSQL(SELECT_DATA_CLIENT_BY_ID)) {
            preparedStatement.setString(1, cpf);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String poste = rs.getString("poste");
                String nome = rs.getString("nome");
                String cpfResponse = rs.getString("cpf");


                nomeResponse = poste + " "+  nome + " " + cpfResponse;

            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return nomeResponse;
    }
}
