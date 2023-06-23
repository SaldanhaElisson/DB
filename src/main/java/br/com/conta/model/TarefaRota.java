package br.com.conta.model;
import br.com.conta.DAO.RotaDAO;
import java.sql.Timestamp;
public class TarefaRota extends  GenericModel {
    private String obervacao;
    private Timestamp data_inicio;
    private Timestamp data_final;

    private Integer rota_id;

    static RotaDAO rota = new RotaDAO();

    public TarefaRota(Integer id, String obervacao, Timestamp data_inicio, Timestamp data_final, Integer rota_id) {
        this.obervacao = obervacao;
        this.data_inicio = data_inicio;
        this.data_final = data_final;
        this.rota_id = rota_id;

        super.setId(id);
    }


    public String getObervacao() {
        return obervacao;
    }

    public Timestamp getData_inicio() {
        return data_inicio;
    }

    public Timestamp getData_fim() {
        return data_final;
    }

    public Integer getRota_id() {
        return rota_id;
    }

    @Override
    public String toString() {
        return "tarefa_rota { \n" +
                "\t id='" + this.getId() + "\' \n"  +
                "\t obersavao=" + obervacao + "\n" +
                "\t data_inicio= " + data_inicio + "\n" +
                "\t data_final="+ data_final + "\n"+
                "\t rota = " + rota.selectRota(rota_id) +
                "\t } ";
    }
}
