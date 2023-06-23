package br.com.conta.model;


public class Classe extends GenericModel{
    private String descricao;
    private TipoFase tipo_fase_model;

    public Classe(String descricao, TipoFase tipo_fase_model) {
        this.descricao = descricao;
        this.tipo_fase_model = tipo_fase_model;
    }
    public Classe(Integer id, String descricao, TipoFase tipo_fase_model){
        this.descricao = descricao;
        this.tipo_fase_model = tipo_fase_model;
        super.setId(id);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getTipoFaseModel() {
        return tipo_fase_model.getId();
    }

    public void setTipoFaseModel(TipoFase tipo_fase_model) {
        this.tipo_fase_model = tipo_fase_model;
    }

    @Override
    public String toString() {
        return "Classe {" +
                "id='" + this.getId() + "\'" +
                "descricao='" + getDescricao() + "\'" +
                "tipo_fase='" + getTipoFaseModel() + "\'" +
                '}';
    }
}
