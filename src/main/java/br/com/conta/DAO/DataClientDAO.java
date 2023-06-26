package br.com.conta.DAO;

import br.com.conta.model.Cliente;
import br.com.conta.model.Pessoa;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


//SELECT
//        rota.descricao AS rota,
//        medidor.descricao AS medidor,
//        poste.codigo AS poste,
//        pessoa.nome AS nome,
//        pessoa.cpf AS cpf,
//        pessoa.cnpj AS cnpj,
//        classe.descricao AS classe,
//        medicao.consumo AS consumo,
//        tarifa.taxa AS tarifa,
//        cobranca.valor AS valor,
//        tarifa.dataInicio AS data_inicio,
//        tarifa.dataFinal AS data_final
//        FROM
//        rota
//        JOIN medidor ON medidor.roda_id = rota.id
//        JOIN poste ON poste.id = medidor.posteId
//        JOIN medicao ON medicao.medidor_id = medidor.id
//        JOIN time_rota ON time_rota.id = medicao.time_rota_id
//        JOIN tarefa_rota ON tarefa_rota.id = time_rota.tarefa_rota_id
//        JOIN tarifa ON tarifa.classe_id = tarefa_rota.classe_id
//        JOIN cobranca ON cobranca.medicao_id = medicao.id
//        JOIN contrato ON contrato.medidor_id = medidor.id
//        JOIN cliente ON cliente.id = contrato.cliente_id
//        JOIN pessoa ON pessoa.id = cliente.pessoaId
//        JOIN classe ON classe.id = contrato.class_id
//        JOIN tipo_pessoa ON tipo_pessoa.id = pessoa.tipo_pessoa_id

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
