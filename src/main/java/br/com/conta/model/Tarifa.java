package br.com.conta.model;

public class Tarifa extends GenericModel{
    private String taxa;
    private Classe classeModel;
    private String data_inicio;

    private String data_fim;

    private String aliquota_ICMS;

    private String lei;



    public Tarifa(String taxa, Classe classeModel, String lei, String data_inicio, String data_fim, String aliquota_ICMS) {
        this.taxa = taxa;
        this.classeModel = classeModel;
        this.lei = lei;
        this.data_inicio = data_inicio;
        this.data_fim = data_fim;
        this.aliquota_ICMS = aliquota_ICMS;
    }

    public Tarifa(int id,String taxa, Classe classeModel, String lei, String data_inicio, String data_fim, String aliquota_ICMS) {
        this.taxa = taxa;
        this.classeModel = classeModel;
        this.lei = lei;
        this.data_inicio = data_inicio;
        this.data_fim = data_fim;
        this.aliquota_ICMS = aliquota_ICMS;
        super.setId(id);
    }

    public String getTaxa() {
        return taxa;
    }

    public void setTaxa(String taxa) {
        this.taxa = taxa;
    }

    public int getClasseModel() {
        return classeModel.getId();
    }

    public void setClasseModel(Classe classeModel) {
        this.classeModel = classeModel;
    }

    public String getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(String data_inicio) {
        this.data_inicio = data_inicio;
    }

    public String getData_fim() {
        return data_fim;
    }

    public void setData_fim(String data_fim) {
        this.data_fim = data_fim;
    }

    public String getAliquota_ICMS() {
        return aliquota_ICMS;
    }

    public void setAliquota_ICMS(String aliquota_ICMS) {
        this.aliquota_ICMS = aliquota_ICMS;
    }

    public String getLei() {
        return lei;
    }

    public void setLei(String lei) {
        this.lei = lei;
    }

    @Override
    public String toString() {
        return "Tarifa {" +
                "id='" + this.getId() + "\'" +
                "taxa='" + getTaxa() + "\'" +
                "lei='" + getLei() + "\'" +
                "data_inicio='" + getData_inicio() + "\'" +
                "data_fim='" + getData_fim() + "\'" +
                "aliquota_ICMS='" + getAliquota_ICMS() + "\'" +
                "classe_id='" + getClasseModel() + "\'" +
                '}';
    }
}