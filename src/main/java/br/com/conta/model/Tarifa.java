package br.com.conta.model;

public class Tarifa extends GenericModel{
    private String taxa;
    private Classe classeId;
    private String dataInicio;

    private String dataFim;

    private String aliquotaICMS;

    private String lei;



    public Tarifa(String taxa, Classe classeId, String lei, String dataInicio, String dataFim, String aliquotaICMS) {
        this.taxa = taxa;
        this.classeId = classeId;
        this.lei = lei;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.aliquotaICMS = aliquotaICMS;
    }

    public Tarifa(int id, String taxa, Classe classeId, String lei, String dataInicio, String dataFim, String aliquotaICMS) {
        this.taxa = taxa;
        this.classeId = classeId;
        this.lei = lei;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.aliquotaICMS = aliquotaICMS;
        super.setId(id);
    }

    public String getTaxa() {
        return taxa;
    }

    public void setTaxa(String taxa) {
        this.taxa = taxa;
    }

    public int getClasseId() {
        return classeId.getId();
    }

    public void setClasseId(Classe classeId) {
        this.classeId = classeId;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public String getAliquotaICMS() {
        return aliquotaICMS;
    }

    public void setAliquotaICMS(String aliquotaICMS) {
        this.aliquotaICMS = aliquotaICMS;
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
                "dataInicio='" + getDataInicio() + "\'" +
                "dataFim='" + getDataFim() + "\'" +
                "aliquotaICMS='" + getAliquotaICMS() + "\'" +
                "classe_id='" + getClasseId() + "\'" +
                '}';
    }
}