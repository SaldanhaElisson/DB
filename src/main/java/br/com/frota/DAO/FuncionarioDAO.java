package br.com.frota.DAO;

import br.com.frota.model.Funcionario;
import br.com.frota.model.Pessoa;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FuncionarioDAO extends ConexaoDB{
    private static final String INSERT_FUNCIONARIO_SQL = "INSERT INTO funcionario (codigo_funcional, pessoa_id) VALUES (?, ?) ;";
    private static final String SELECT_FUNCIONARIO_BY_ID = "SELECT id, nome, cpf, cnpj, tipo_pessoa_id FROM pessoa WHERE id = ?";
    private static final String SELECT_ALL_FUNCIONARIO = "SELECT * FROM pessoa;";
    private static final String DELETE_FUNCIONARIO_SQL = "DELETE FROM pessoa WHERE id = ?;";
    private static final String UPDATE_FUNCIONARIO_SQL = "UPDATE pessoa SET nome = ?, cpf = ?, cnpj = ?, tipo_pessoa_id = ? WHERE id = ?;";

    public void insertFuncionarioSQL(Funcionario entidade) {
        try (PreparedStatement preparedStatement = prepararSQL(INSERT_FUNCIONARIO_SQL)) {
            preparedStatement.setString(1, entidade.getCodigoFuncional());
            preparedStatement.setInt(2, entidade.getPessoaId());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
