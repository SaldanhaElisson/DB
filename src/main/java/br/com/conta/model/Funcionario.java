package br.com.conta.model;

import br.com.conta.DAO.PessoaDAO;

public class Funcionario extends GenericModel {
    private String codigoFuncionario;
    private Pessoa pessoaId;

    private static final PessoaDAO pessoaDAO = new PessoaDAO();

    public Funcionario(String codigoFuncionario, Pessoa pessoaId) {
        this.codigoFuncionario = codigoFuncionario;
        this.pessoaId = pessoaId;
    }
    public Funcionario(int id, String codigoFuncionario, Pessoa pessoaId) {
        this.codigoFuncionario = codigoFuncionario;
        this.pessoaId = pessoaId;
        super.setId(id);
    }

    public String getCodigoFuncionario() {
        return codigoFuncionario;
    }

    public void setCodigoFuncionario(String codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }

    public int getPessoaId() {
        return pessoaId.getId();
    }

    public void setPessoal_id(Pessoa pessoaId) {
        this.pessoaId = pessoaId;
    }

    @Override
    public String toString() {
        return "Funcionario {" +
                "id='" + this.getId() + "\'" +
                "codigoFuncionario='" + getCodigoFuncionario() + "\'" +
                "pessoa_id='" + getPessoaId() + "\'" +
                '}';
    }
}
