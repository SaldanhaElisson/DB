package br.com.conta.model;

import java.sql.Timestamp;

public class Medicao extends GenericModel {
    private String mes;
    private String ano;
    private Timestamp dataMedicao;
    private String consumo;
    private Medidor medidorId;
    private TimeRota timeRotaId;

    public Medicao(String mes, String ano, Timestamp dataMedicao, String consumo, Medidor medidorId, TimeRota timeRotaId) {
        this.mes = mes;
        this.ano = ano;
        this.dataMedicao = dataMedicao;
        this.consumo = consumo;
        this.medidorId = medidorId;
        this.timeRotaId = timeRotaId;
    }
    public Medicao(int id, String mes, String ano, Timestamp dataMedicao, String consumo, Medidor medidorId, TimeRota timeRotaId) {
        this.mes = mes;
        this.ano = ano;
        this.dataMedicao = dataMedicao;
        this.consumo = consumo;
        this.medidorId = medidorId;
        this.timeRotaId = timeRotaId;
        super.setId(id);
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public Timestamp getDataMedicao() {
        return dataMedicao;
    }

    public void setDataMedicao(Timestamp dataMedicao) {
        this.dataMedicao = dataMedicao;
    }

    public String getConsumo() {
        return consumo;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }

    public int getMedidorId() {
        return medidorId.getId();
    }

    public void setMedidorId(Medidor medidor_id) {
        this.medidorId = medidor_id;
    }

    public int getTimeRotaId() {
        return timeRotaId.getId();
    }

    public void setTimeRotaId(TimeRota time_rota_id) {
        this.timeRotaId = time_rota_id;
    }

    @Override
    public String toString() {
        return "Medicao {" +
                "id='" + this.getId() + "\'" +
                "ano='" + getAno() + "\'" +
                "mes='" + getMes() + "\'" +
                "dataMedicao='" + getDataMedicao() + "\'" +
                "consumo='" + getConsumo() + "\'" +
                "medidor_id='" + getMedidorId() + "\'" +
                "timeRota_id='" + getTimeRotaId() + "\'" +
                '}';
    }
}
