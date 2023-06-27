package br.com.conta.model;

import br.com.conta.DAO.TarifaDAO;

public class Cobranca extends GenericModel {
    private String mesReferencia;
    private String anoReferencia;
    private Tarifa tarifaId;
    private Medicao medicaoId;

    static private final TarifaDAO tarifaDAO = new TarifaDAO();
    public Cobranca(String mesReferencia, String anoReferencia, Tarifa tarifaId, Medicao medicaoId) {
        this.mesReferencia = mesReferencia;
        this.anoReferencia = anoReferencia;
        this.tarifaId = tarifaId;
        this.medicaoId = medicaoId;
    }
    public Cobranca(int id, String mesReferencia, String anoReferencia, Tarifa tarifaId, Medicao medicaoId) {
        this.mesReferencia = mesReferencia;
        this.anoReferencia = anoReferencia;
        this.tarifaId = tarifaId;
        this.medicaoId = medicaoId;
        super.setId(id);
    }

    public String getMesReferencia() {
        return mesReferencia;
    }

    public void setMesReferencia(String mesReferencia) {
        this.mesReferencia = mesReferencia;
    }

    public String getAnoReferencia() {
        return anoReferencia;
    }

    public void setAnoReferencia(String anoReferencia) {
        this.anoReferencia = anoReferencia;
    }

    public int getTarifaModel() {
        return tarifaId.getId();
    }

    public void setTarifaModel(Tarifa tarifa_model) {
        this.tarifaId = tarifa_model;
    }

    public int getMedicaoModel() {
        return medicaoId.getId();
    }

    public void setMedicaoModel(Medicao medicao_model) {
        this.medicaoId = medicao_model;
    }

    @Override
    public String toString() {
        return "Cobranca {" +
                "id='" + this.getId() + "\'" +
                "mes_referencia='" + getMesReferencia() + "\'" +
                "ano_referencia='" + getAnoReferencia() + "\'" +
                "tarifa_id='" + getTarifaModel() + "\'" +
                "medicao_id='" + getMedicaoModel() + "\'" +
                '}';
    }
}
