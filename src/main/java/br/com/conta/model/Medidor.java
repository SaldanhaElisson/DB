package br.com.conta.model;

public class Medidor extends GenericModel {
    private String descricao;
    private Rota rotaId;
    private Poste posteId;

    public Medidor(String descricao, Rota rotaId, Poste posteId) {
        this.descricao = descricao;
        this.rotaId = rotaId;
        this.posteId = posteId;
    }
    public Medidor(int id, String descricao, Rota rotaId, Poste posteId) {
        this.descricao = descricao;
        this.rotaId = rotaId;
        this.posteId = posteId;
        super.setId(id);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getRotaId() {
        return rotaId.getId();
    }

    public void setRotaId(Rota rotaId) {
        this.rotaId = rotaId;
    }

    public int getPosteId() {
        return posteId.getId();
    }

    public void setPosteId(Poste poste_id) {
        this.posteId = poste_id;
    }
    @Override
    public String toString() {
        return "Medidor {" +
                "id='" + this.getId() + "\'" +
                "descricao='" + getDescricao() + "\'" +
                "rota_id='" + getRotaId() + "\'" +
                "poste_id='" + getPosteId() + "\'" +
                '}';
    }
}
