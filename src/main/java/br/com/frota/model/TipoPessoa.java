package br.com.frota.model;

public class TipoPessoa extends GenericModel {
    private String descricao;


    public TipoPessoa(Integer id, String descricao) {

        this.descricao = descricao;

        super.setId(id);
    }

    public String getDescricao() {
        return this.descricao;
    }


    @Override
    public String toString() {
        return "Tipo_pessoa { \n" +
                "\t id='" + this.getId() + "\' \n"  +
                "\t descricao='" + descricao + "\n" +
                "\t } ";
    }
}
