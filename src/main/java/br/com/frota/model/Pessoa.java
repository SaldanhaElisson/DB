package br.com.frota.model;

import br.com.frota.DAO.TipoPessoaDAO;

public class Pessoa extends GenericModel {

    static private TipoPessoaDAO tipoPessoaDAO = new TipoPessoaDAO();
    private String nome;
    private String cpf;

    private String cnpj;

    private Integer tipoPessoa;


    public Pessoa(Integer id, String nome, String cpf, Integer tipoPessoa) {
        this.nome = nome;
        this.cpf = cpf;
        this.tipoPessoa = tipoPessoa;
        super.setId(id);
    }

    public Pessoa(Integer id, String nome, String cpf, Integer tipoPessoa, String cnpj ) throws Exception {
        this(id, nome, cpf, tipoPessoa);

        this.cnpj = cnpj;

    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getCnpj() {
        return cnpj;
    }

    public Integer getTipoPessoa() {
        return tipoPessoa;
    }

    @Override
    public String toString() {
        return "Pessoa{ \n" +
                "id= '" + this.getId() + "\' \n" +
                "nome = '" + getNome() + "\' \n" +
                "cpf = '" + getCpf() + "\' \n"  +
                "tipo_pessoa =  '" + tipoPessoaDAO.selectTipoPessoa(tipoPessoa) + "\' \n" +
                '}';
    }
}
