package br.com.conta.model;

import br.com.conta.DAO.TarifaDAO;

public class Cobranca extends GenericModel {
    private String mes_referencia;
    private String ano_referencia;
    private Tarifa tarifa_model;
    private Medicao medicao_model;

    static private final TarifaDAO tarifaDAO = new TarifaDAO();
    public Cobranca(String mes_referencia, String ano_referencia, Tarifa tarifa_model, Medicao medicao_model) {
        this.mes_referencia = mes_referencia;
        this.ano_referencia = ano_referencia;
        this.tarifa_model = tarifa_model;
        this.medicao_model = medicao_model;
    }
    public Cobranca(int id, String mes_referencia, String ano_referencia, Tarifa tarifa_model, Medicao medicao_model) {
        this.mes_referencia = mes_referencia;
        this.ano_referencia = ano_referencia;
        this.tarifa_model = tarifa_model;
        this.medicao_model = medicao_model;
        super.setId(id);
    }

    public String getMes_referencia() {
        return mes_referencia;
    }

    public void setMes_referencia(String mes_referencia) {
        this.mes_referencia = mes_referencia;
    }

    public String getAno_referencia() {
        return ano_referencia;
    }

    public void setAno_referencia(String ano_referencia) {
        this.ano_referencia = ano_referencia;
    }

    public int getTarifaModel() {
        return tarifa_model.getId();
    }

    public void setTarifaModel(Tarifa tarifa_model) {
        this.tarifa_model = tarifa_model;
    }

    public int getMedicaoModel() {
        return medicao_model.getId();
    }

    public void setMedicaoModel(Medicao medicao_model) {
        this.medicao_model = medicao_model;
    }

    @Override
    public String toString() {
        return "Cobranca {" +
                "id='" + this.getId() + "\'" +
                "mes_referencia='" + getMes_referencia() + "\'" +
                "ano_referencia='" + getAno_referencia() + "\'" +
                "tarifa_id='" + getTarifaModel() + "\'" +
                "medicao_id='" + getMedicaoModel() + "\'" +
                '}';
    }
}
