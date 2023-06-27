package br.com.conta.model;

import br.com.conta.DAO.FuncionarioDAO;
import br.com.conta.DAO.TarefaRotaDAO;

public class TimeRota extends GenericModel{

    private Funcionario funcionarioId;
    private TarefaRota tarefaRotaId;


    public TimeRota(Funcionario funcionarioId, TarefaRota tarefaRotaId) {
        this.funcionarioId = funcionarioId;
        this.tarefaRotaId = tarefaRotaId;
    }

    public TimeRota(Integer id, Funcionario funcionario_id, TarefaRota tarefa_rota_id) {
        this.funcionarioId = funcionario_id;
        this.tarefaRotaId = tarefa_rota_id;
        super.setId(id);
    }

    public Integer getFuncionarioId() {
        return funcionarioId.getId();
    }

    public Integer getTarefaRotaId() {
        return tarefaRotaId.getId();
    }

    @Override
    public String toString() {
        return "tarefa_rota { \n" +
                "\t id='" + this.getId() + "\' \n"  +
                "\t funcionario_id = " + getFuncionarioId() + "\n" +
                "\t tarefa_rota_id = " +  getTarefaRotaId() + "\n" +
                "\t } ";
    }

}