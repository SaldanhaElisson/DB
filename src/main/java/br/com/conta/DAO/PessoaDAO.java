package br.com.conta.DAO;
import br.com.conta.model.Pessoa;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class PessoaDAO extends  ConexaoDB{
    private static final String INSERT_PESSOA_SQL = "INSERT INTO pessoa (nome, cpf, cnpj, tipo_pessoa_id) VALUES (?, ?, ?, ?) ;";
    private static final String SELECT_PESSOA_BY_ID = "SELECT id, nome, cpf, cnpj, tipo_pessoa_id FROM pessoa WHERE id = ?";
    private static final String SELECT_ALL_PESSOA = "SELECT * FROM pessoa;";
    private static final String DELETE_PESSOA_SQL = "DELETE FROM pessoa WHERE id = ?;";
    private static final String UPDATE_PESSOA_SQL = "UPDATE pessoa SET nome = ?, cpf = ?, cnpj = ?, tipo_pessoa_id = ? WHERE id = ?;";

    private static final String TOTAL = "SELECT count(1) FROM pessoa;";

    private static final TipoPessoaDAO tipoPessoaDao = new TipoPessoaDAO();

    public Integer count() {
        Integer count = 0;
        try (PreparedStatement preparedStatement = prepararSQL(TOTAL)) {
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                count = rs.getInt("count");
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return count;
    }
    public void insertPessoa(Pessoa entidade) {
        try (PreparedStatement preparedStatement = prepararSQL(INSERT_PESSOA_SQL)) {
            System.out.println(entidade.getCpf());
            preparedStatement.setString(1, entidade.getNome());
            preparedStatement.setString(2, entidade.getCpf());
            preparedStatement.setInt(3, entidade.getIdTipoPessoa());

            if (entidade.getCnpj() == null || entidade.getCnpj().isEmpty()) {
                preparedStatement.setNull(4, 0);
                preparedStatement.executeUpdate();
                return;
            }

            preparedStatement.setString(4, entidade.getCnpj());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public Pessoa selectPessoaById(int id) {
        Pessoa entidade = null;
        try (PreparedStatement preparedStatement = prepararSQL(SELECT_PESSOA_BY_ID)) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String nome = rs.getString("nome");
                String cpf = rs.getString("cpf");
                Integer tipo_pessoa_id = rs.getInt("tipo_pessoa_id");
                String cnpj = rs.getString("cnpj");
                entidade = new Pessoa(id, nome, cpf, tipoPessoaDao.selectTipoPessoa(tipo_pessoa_id), cnpj);
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return entidade;
    }

    public List<Pessoa> selectAllPessoa() {
        List<Pessoa> entidades = new ArrayList<>();
        try (PreparedStatement preparedStatement = prepararSQL(SELECT_ALL_PESSOA)) {
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                Integer id = rs.getInt("id");
                String nome = rs.getString("nome");
                String cpf = rs.getString("cpf");
                Integer tipo_pessoa_id = rs.getInt("tipo_pessoa_id");
                String cnpj = rs.getString("cnpj");
                entidades.add(new Pessoa(id, nome, cpf, tipoPessoaDao.selectTipoPessoa(tipo_pessoa_id), cnpj));
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return entidades;
    }

    public boolean deletePessoa(int id) throws SQLException {
        try (PreparedStatement statement = prepararSQL(DELETE_PESSOA_SQL)) {
            statement.setInt(1, id);
            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean updatePessoa(Pessoa entidade) throws SQLException {
        try (PreparedStatement statement = prepararSQL(UPDATE_PESSOA_SQL)) {
            statement.setString(1, entidade.getNome());
            statement.setString(2, entidade.getCpf());
            statement.setInt(3, entidade.getIdTipoPessoa());
            statement.setInt(4, entidade.getId());

            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
