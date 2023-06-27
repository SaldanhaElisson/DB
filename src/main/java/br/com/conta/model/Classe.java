package br.com.conta.model;


public class Classe extends GenericModel{
    private String descricao;
    private TipoFase tipoFaseId;

    public Classe(String descricao, TipoFase tipoFaseId) {
        this.descricao = descricao;
        this.tipoFaseId = tipoFaseId;
    }
    public Classe(Integer id, String descricao, TipoFase tipoFaseId){
        this.descricao = descricao;
        this.tipoFaseId = tipoFaseId;
        super.setId(id);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getTipoFaseId() {
        return tipoFaseId.getId();
    }

    public void setTipoFaseId(TipoFase tipoFaseId) {
        this.tipoFaseId = tipoFaseId;
    }

    @Override
    public String toString() {
        return "Classe {" +
                "id='" + this.getId() + "\'" +
                "descricao='" + getDescricao() + "\'" +
                "tipo_fase_id='" + getTipoFaseId() + "\'" +
                '}';
    }
}
