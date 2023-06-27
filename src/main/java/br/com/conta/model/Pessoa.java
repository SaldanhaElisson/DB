package br.com.conta.model;


public class Pessoa extends GenericModel {

    private String nome;
    private String cpf;

    private String cnpj;

    private TipoPessoa tipoPessoaId;


    public Pessoa(Integer id, String nome, String cpf, TipoPessoa tipoPessoaId) {
        this.nome = nome;
        this.cpf = cpf;
        this.tipoPessoaId = tipoPessoaId;
        super.setId(id);
    }

    public Pessoa(Integer id, String nome, String cpf, TipoPessoa tipoPessoaId, String cnpj ) throws Exception {
        this(id, nome, cpf, tipoPessoaId);

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

    public void setTipoPessoaId(TipoPessoa tipoPessoaId) {
        this.tipoPessoaId = tipoPessoaId;
    }

    public Integer getTipoPessoaId() {
        return tipoPessoaId.getId();
    }

    @Override
    public String toString() {
        return "Pessoa { \n" +
                "\t id= '" + this.getId() + "\' \n" +
                "\t nome = '" + getNome() + "\' \n" +
                "\t cpf = '" + getCpf() + "\' \n"  +
                "\t cnpj = '" + getCnpj() + "\' \n"  +
                "\t tipo_pessoa_id =  " + getTipoPessoaId() + "\n" +
                "\t }";
    }
}
