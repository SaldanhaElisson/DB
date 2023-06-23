package br.com.frota.model;

import br.com.frota.DAO.TipoPessoaDAO;

public class Pessoa extends GenericModel {

    static private TipoPessoaDAO tipoPessoaDAO = new TipoPessoaDAO();
    private String nome;
    private String cpf;

    private String cnpj;

    private TipoPessoa tipoPessoa;


    public Pessoa(Integer id, String nome, String cpf, TipoPessoa tipoPessoa) {
        this.nome = nome;
        this.cpf = cpf;
        this.tipoPessoa = tipoPessoa;
        super.setId(id);
    }

    public Pessoa(Integer id, String nome, String cpf, TipoPessoa tipoPessoa, String cnpj ) throws Exception {
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

    public Integer getIdTipoPessoa() {
        return tipoPessoa.getId();
    }

    @Override
    public String toString() {
        return "pessoa { \n" +
                    "\t id= '" + this.getId() + "\' \n" +
                    "\t nome = '" + getNome() + "\' \n" +
                    "\t cpf = '" + getCpf() + "\' \n"  +
                    "\t tipo_pessoa =  " + tipoPessoa + "\n" +
                "\t }";
    }
}
