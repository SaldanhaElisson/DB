package br.com.frota.model;
import br.com.frota.DAO.RotaDAO;
public class TarefaRota extends  GenericModel {
    private String obervacao;
    private String data_inicio;
    private String data_final;

    private Integer rota_id;

    static RotaDAO rota = new RotaDAO();

    public TarefaRota(String obervacao, String data_inicio, String data_final, Integer rota_id) {
        this.obervacao = obervacao;
        this.data_inicio = data_inicio;
        this.data_final = data_final;
        this.rota_id = rota_id;
    }


    public String getObervacao() {
        return obervacao;
    }

    public String getData_inicio() {
        return data_inicio;
    }

    public String getData_fim() {
        return data_final;
    }

    public Integer getRota_id() {
        return rota_id;
    }

    @Override
    public String toString() {
        return "Rota { \n" +
                "\t id='" + this.getId() + "\' \n"  +
                "\t obersavao=" + obervacao + "\n" +
                "\t data_inicio= " + data_inicio + "\n" +
                "\t data_final="+ data_final + "\n"+
                "\t rota = " + rota.selectRota(rota_id) +
                "\t } ";
    }
}
