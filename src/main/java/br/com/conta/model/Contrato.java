package br.com.conta.model;


public class Contrato extends GenericModel {
    private String descricao;
    private String data_inicio;
    private String data_criacao;
    private Medidor medidor_id;
    private Classe classe_id;
    private Cliente cliente_id;

    public Contrato(String descricao, String data_inicio, String data_criacao, Medidor medidor_id, Classe classe_id, Cliente cliente_id) {
        this.descricao = descricao;
        this.data_inicio = data_inicio;
        this.data_criacao = data_criacao;
        this.medidor_id = medidor_id;
        this.classe_id = classe_id;
        this.cliente_id = cliente_id;
    }
    public Contrato(int id, String descricao, String data_inicio, String data_criacao, Medidor medidor_id, Classe classe_id, Cliente cliente_id) {
        this.descricao = descricao;
        this.data_inicio = data_inicio;
        this.data_criacao = data_criacao;
        this.medidor_id = medidor_id;
        this.classe_id = classe_id;
        this.cliente_id = cliente_id;
        super.setId(id);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(String data_inicio) {
        this.data_inicio = data_inicio;
    }

    public String getData_criacao() {
        return data_criacao;
    }

    public void setData_criacao(String data_criacao) {
        this.data_criacao = data_criacao;
    }

    public int getMedidorId() {
        return medidor_id.getId();
    }

    public void setMedidor_id(Medidor medidor_id) {
        this.medidor_id = medidor_id;
    }

    public int getClasseId() {
        return classe_id.getId();
    }

    public void setClasse_id(Classe classe_id) {
        this.classe_id = classe_id;
    }

    public int getClienteId() {
        return cliente_id.getId();
    }

    public void setCliente_id(Cliente cliente_id) {
        this.cliente_id = cliente_id;
    }
    @Override
    public String toString() {
        return "Contrato {" +
                "id='" + this.getId() + "\'" +
                "descricao='" + getDescricao() + "\'" +
                "data_inicio='" + getData_inicio() + "\'" +
                "data_criacao='" + getData_criacao() + "\'" +
                "medidor_id='" + getMedidorId() + "\'" +
                "classe_id='" + getClasseId() + "\'" +
                "cliente_id='" + getClienteId() + "\'" +
                '}';
    }
}
