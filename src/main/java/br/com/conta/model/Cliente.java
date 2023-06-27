package br.com.conta.model;

import br.com.conta.DAO.PessoaDAO;


public class Cliente extends GenericModel{
    private String numDocumento;
    private String numCliente;
    private Pessoa pessoaId;

    static private final PessoaDAO pessoaDAO = new PessoaDAO();

    public Cliente(String numDocumento, String numCliente, Pessoa pessoaId) {
        this.numDocumento = numDocumento;
        this.numCliente = numCliente;
        this.pessoaId = pessoaId;
    }
    public Cliente(Integer id, String numCliente, String numDocumento, Pessoa pessoaId){
        this.numDocumento = numDocumento;
        this.numCliente = numCliente;
        this.pessoaId = pessoaId;
        super.setId(id);
    }

    public String getNumDocumento() {
        return numDocumento;
    }

    public void setNumDocumento(String numDocumento) {
        this.numDocumento = numDocumento;
    }

    public String getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(String numCliente) {
        this.numCliente = numCliente;
    }

    public int getPessoaId() {
        return pessoaId.getId();
    }

    public void setPessoaId(Pessoa pessoaId) {
        this.pessoaId = pessoaId;
    }

    @Override
    public String toString() {
        return "Cliente {" +
                "id='" + this.getId() + "\'" +
                "num_documento='" + getNumDocumento() + "\'" +
                "num_cliente='" + getNumCliente() + "\'" +
                "pessoa_id='" + getPessoaId() + "\'" +
                '}';
    }
}
