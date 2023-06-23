package br.com.conta.model;

public class Medicao extends GenericModel {
    private String mes;
    private String ano;
    private String data_medicao;
    private String consumo;
    private Medidor medidor_id;
    private TimeRota time_rota_id;

    public Medicao(String mes, String ano, String data_medicao, String consumo, Medidor medidor_model, TimeRota time_rota_model) {
        this.mes = mes;
        this.ano = ano;
        this.data_medicao = data_medicao;
        this.consumo = consumo;
        this.medidor_id = medidor_model;
        this.time_rota_id = time_rota_model;
    }
    public Medicao(int id,String mes, String ano, String data_medicao, String consumo, Medidor medidor_model, TimeRota time_rota_model) {
        this.mes = mes;
        this.ano = ano;
        this.data_medicao = data_medicao;
        this.consumo = consumo;
        this.medidor_id = medidor_model;
        this.time_rota_id = time_rota_model;
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

    public String getData_medicao() {
        return data_medicao;
    }

    public void setData_medicao(String data_medicao) {
        this.data_medicao = data_medicao;
    }

    public String getConsumo() {
        return consumo;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }

    public int getMedidorId() {
        return medidor_id.getId();
    }

    public void setMedidorId(Medidor medidor_id) {
        this.medidor_id = medidor_id;
    }

    public int getTimeRotaId() {
        return time_rota_id.getId();
    }

    public void setTimeRotaId(TimeRota time_rota_id) {
        this.time_rota_id = time_rota_id;
    }

    @Override
    public String toString() {
        return "Medicao {" +
                "id='" + this.getId() + "\'" +
                "ano='" + getAno() + "\'" +
                "mes='" + getMes() + "\'" +
                "data_medicao='" + getData_medicao() + "\'" +
                "consumo='" + getConsumo() + "\'" +
                "medidor_id='" + getMedidorId() + "\'" +
                "time_rota_id='" + getTimeRotaId() + "\'" +
                '}';
    }
}
