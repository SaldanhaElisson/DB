package br.com.frota.model;

import br.com.frota.DAO.TipoPessoaDAO;

public class Rota extends GenericModel{

    private String descricao;


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
                "\t descricao ='" + descricao + "\' \n" +
                "\t } \n";
    }

}
