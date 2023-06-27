package br.com.conta.util;
import br.com.conta.DAO.*;
import br.com.conta.model.DataClient;
import br.com.conta.servico.ServiceClient;

public class Teste {
    static TipoPessoaDAO tipo_pessoaDAO = new TipoPessoaDAO();
    static PessoaDAO pessoa = new PessoaDAO();
    static RotaDAO rota = new RotaDAO();
    static TarefaRotaDAO tarefaRota = new TarefaRotaDAO();
    static TimeRotaDAO timeRotaDAO = new TimeRotaDAO();

    static DataClientDAO dataClientDAO = new DataClientDAO();

    static FuncionarioDAO funcionario = new FuncionarioDAO();
    public static void main(String[] args) throws Exception {

        ServiceClient serviceClient = new ServiceClient(dataClientDAO);

        DataClient response = serviceClient.ConsultClientDatabyCPF("09174300000");

        System.out.println(response);

    }
}
