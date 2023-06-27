package br.com.conta.model;


import java.sql.Timestamp;

public class Contrato extends GenericModel {
    private String descricao;
    private Timestamp dataInicio;
    private Timestamp dataCriacao;
    private Medidor medidorId;
    private Classe classeId;
    private Cliente clienteId;

    public Contrato(String descricao, Timestamp dataInicio, Timestamp dataCriacao, Medidor medidorId, Classe classeId, Cliente clienteId) {
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataCriacao = dataCriacao;
        this.medidorId = medidorId;
        this.classeId = classeId;
        this.clienteId = clienteId;
    }
    public Contrato(int id, String descricao, Timestamp dataInicio, Timestamp dataCriacao, Medidor medidorId, Classe classeId, Cliente clienteId) {
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataCriacao = dataCriacao;
        this.medidorId = medidorId;
        this.classeId = classeId;
        this.clienteId = clienteId;
        super.setId(id);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Timestamp getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Timestamp dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Timestamp getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Timestamp dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public int getMedidorId() {
        return medidorId.getId();
    }

    public void setMedidorId(Medidor medidorId) {
        this.medidorId = medidorId;
    }

    public int getClasseId() {
        return classeId.getId();
    }

    public void setClasseId(Classe classeId) {
        this.classeId = classeId;
    }

    public int getClienteId() {
        return clienteId.getId();
    }

    public void setClienteId(Cliente clienteId) {
        this.clienteId = clienteId;
    }
    @Override
    public String toString() {
        return "Contrato {" +
                "id='" + this.getId() + "\'" +
                "descricao='" + getDescricao() + "\'" +
                "data_inicio='" + getDataInicio() + "\'" +
                "data_criacao='" + getDataCriacao() + "\'" +
                "medidor_id='" + getMedidorId() + "\'" +
                "classe_id='" + getClasseId() + "\'" +
                "cliente_id='" + getClienteId() + "\'" +
                '}';
    }
}