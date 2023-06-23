package br.com.frota.model;

import br.com.frota.DAO.FuncionarioDAO;
import br.com.frota.DAO.TarefaRotaDAO;

public class TimeRota extends GenericModel{

    private Integer funcionarioId;
    private Integer tarefaRotaId;

    static FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
    static TarefaRotaDAO tarefaRotaDAO = new TarefaRotaDAO();


    public TimeRota(Integer id, Integer funcionario_id, Integer tarefa_rota_id) {
        this.funcionarioId = funcionario_id;
        this.tarefaRotaId = tarefa_rota_id;
        super.setId(id);
    }

    public Integer getFuncionarioId() {
        return funcionarioId;
    }

    public Integer getTarefaRotaId() {
        return tarefaRotaId;
    }

    @Override
    public String toString() {
        return "tarefa_rota { \n" +
                "\t id='" + this.getId() + "\' \n"  +
                "\t funcionario = " + funcionarioDAO.selectFuncionario(funcionarioId) + "\n" +
                "\t tarefa = " +  tarefaRotaDAO.selectTarefaRota(tarefaRotaId) + "\n" +
                "\t } ";
    }

}
