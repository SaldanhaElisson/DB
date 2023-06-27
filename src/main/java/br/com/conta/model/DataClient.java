package br.com.conta.model;

public class DataClient extends GenericModel {
    private String poste;
    private String nome;
    private String cnpj;
    private String classe;
    private String tipoFase;
    private String cpf;


    public DataClient(Integer id, String cpf, String poste, String nome, String cnpj, String classe, String tipoFase) {
        this.poste = poste;
        this.nome = nome;
        this.cnpj = cnpj;
        this.classe = classe;
        this.tipoFase = tipoFase;
        this.cpf = cpf;

    }


    public String getPoste() {
        return poste;
    }

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getClasse() {
        return classe;
    }

    public String getTipoFase() {
        return tipoFase;
    }

    @Override
    public String toString() {
        return "DataClien{ \n" +
                " \tposte=" + poste + "\n" +
                " \tnome=" + nome + "\n" +
                " \tcnpj=" + cnpj + "\n" +
                " \tclasse=" + classe + "\n" +
                " \ttipoFase=" + tipoFase + "\n" +
                " \tcpf=" + cpf + "\n" +
                '}';
    }

    public String getCpf() {
        return cpf;
    }
}
