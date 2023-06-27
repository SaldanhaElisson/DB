package br.com.conta.model;

import java.sql.Timestamp;
public class TarefaRota extends  GenericModel {
    private String obervacao;
    private Timestamp dataInicio;
    private Timestamp dataFinal;

    private String tarefaRotcao;
    private Rota rotaId;


    public TarefaRota(String obervacao, Timestamp dataInicio, Timestamp dataFinal,String tarefaRotcao, Rota rotaId) {
        this.obervacao = obervacao;
        this.dataInicio = dataInicio;
        this.dataFinal = dataFinal;
        this.tarefaRotcao = tarefaRotcao;
        this.rotaId = rotaId;
    }

    public TarefaRota(Integer id, String obervacao, Timestamp dataInicio, Timestamp dataFinal,String tarefaRotcao, Rota rotaId) {
        this.obervacao = obervacao;
        this.dataInicio = dataInicio;
        this.dataFinal = dataFinal;
        this.tarefaRotcao = tarefaRotcao;
        this.rotaId = rotaId;

        super.setId(id);
    }


    public String getObervacao() {
        return obervacao;
    }

    public Timestamp getDataInicio() {
        return dataInicio;
    }

    public Timestamp getDataFinal() {
        return dataFinal;
    }

    public String getTarefaRotcao() {
        return tarefaRotcao;
    }

    public int getRotaId() {
        return rotaId.getId();
    }

    @Override
    public String toString() {
        return "tarefa_rota { \n" +
                "\t id='" + this.getId() + "\' \n"  +
                "\t observacao=" + getObervacao() + "\n" +
                "\t data_inicio_id= " + getDataInicio() + "\n" +
                "\t data_final_id= "+ getDataFinal() + "\n"+
                "\t rota_id = " + getRotaId() +
                "\t } ";
    }
}