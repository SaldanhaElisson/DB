package br.com.conta.model;

public class Cliente extends GenericModel{
    private String numDocumento;
    private String numCliente;
    private  Pessoa pessoa;

    public Cliente(Integer id, String num_documento, String num_cliente, Pessoa pessoa) {
        this.numDocumento = num_documento;
        this.numCliente = num_cliente;
        this.pessoa = pessoa;
        super.setId(id);
    }

    public Integer getIdPessoa() {
        return pessoa.getId();
    }

    @Override
    public String toString() {
        return "tarefa_rota { \n" +
                "\t id='" + this.getId() + "\' \n"  +
                "\t num_documento =" + numDocumento + "\n" +
                "\t num_cliente = " + numCliente + "\n" +
                "\t pessoa ="+ pessoa + "\n" +
                "\t } ";
    }

    public String getNumDocumento() {
        return numDocumento;
    }

    public String getNumCliente() {
        return numCliente;
    }
}
