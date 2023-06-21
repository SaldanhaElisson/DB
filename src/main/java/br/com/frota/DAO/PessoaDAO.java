package br.com.frota.DAO;
import br.com.frota.model.Pessoa;
import br.com.frota.model.TipoPessoa;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class PessoaDAO extends  ConexaoDB{
    private static final String INSERT_PESSOA_SQL = "INSERT INTO tipo_pessoa (nome, cpf, tipo_pessoa_id, cnpj ) VALUES (?, ?, ?, ?);";
//    private static final String SELECT_TIPO_PESSOA_BY_ID = "SELECT id, descricao FROM tipo_pessoa WHERE id = ?";
//    private static final String SELECT_ALL_TIPO_PESSOA = "SELECT * FROM tipo_pessoa;";
//    private static final String DELETE_TIPO_PESSOA_SQL = "DELETE FROM tipo_pessoa WHERE id = ?;";
//    private static final String UPDATE_TIPO_PESSOA_SQL = "UPDATE tipo_pessoa SET descricao = ? WHERE id = ?;";

    public void insertPessoa(Pessoa entidade) {
        try (PreparedStatement preparedStatement = prepararSQL(INSERT_PESSOA_SQL)) {
            preparedStatement.setString(1, entidade.getNome());
            preparedStatement.executeUpdate();

            preparedStatement.setString(2, entidade.getCpf());
            preparedStatement.executeQuery();

            preparedStatement.setInt(3, entidade.getTipoPessoa());
            preparedStatement.executeQuery();

            if (entidade.getCnpj() == null || entidade.getCnpj().isEmpty()) {
                preparedStatement.setNull(4, 0);
                preparedStatement.executeQuery();
                return;
            }

            preparedStatement.setString(4, entidade.getCnpj());
            preparedStatement.executeQuery();

        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
