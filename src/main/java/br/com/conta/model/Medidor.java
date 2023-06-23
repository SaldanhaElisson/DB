package br.com.conta.model;

public class Medidor extends GenericModel {
    private String descricao;
    private Rota rota_id;
    private Poste poste_id;

    public Medidor(String descricao, Rota rota_id, Poste poste_id) {
        this.descricao = descricao;
        this.rota_id = rota_id;
        this.poste_id = poste_id;
    }
    public Medidor(int id,String descricao, Rota rota_id,Poste poste_id) {
        this.descricao = descricao;
        this.rota_id = rota_id;
        this.poste_id = poste_id;
        super.setId(id);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getRotaId() {
        return rota_id.getId();
    }

    public void setRota_id(Rota rota_id) {
        this.rota_id = rota_id;
    }

    public int getPosteId() {
        return poste_id.getId();
    }

    public void setPosteId(Poste poste_id) {
        this.poste_id = poste_id;
    }
    @Override
    public String toString() {
        return "Medidor {" +
                "id='" + this.getId() + "\'" +
                "descricao='" + getDescricao() + "\'" +
                "rota='" + getRotaId() + "\'" +
                "poste='" + getPosteId() + "\'" +
                '}';
    }
}
