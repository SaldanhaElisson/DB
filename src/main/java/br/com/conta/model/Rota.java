package br.com.conta.model;


public class Rota extends GenericModel{

    private String descricao;


    public Rota(String descricao) {
        this.descricao = descricao;
    }

    public Rota(Integer id, String descricao) {
        super.setId(id);
        this.descricao = descricao;

    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "Rota { \n" +
                "\t id= '" + this.getId() + "\' \n"  +
                "\t descricao ='" + getDescricao() + "\' \n" +
                "\t } \n";
    }

}