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

//        String str="2018-09-01 09:01:15";
//        Timestamp timestamp= Timestamp.valueOf(str);
//        System.out.println("2. value of Timestamp : "+timestamp);
//
//        TarefaRota rota1 = new TarefaRota(2, "batata", timestamp, timestamp, 1 );
//        tarefaRota.insertTarefaRota(rota1);

//        TimeRota timeRota = new TimeRota(1, 1, 1 );
//        timeRotaDAO.setInsertTimeRotaSQL(timeRota);


        ServiceClient serviceClient = new ServiceClient(dataClientDAO);

        DataClient response = serviceClient.ConsultClientDatabyCPF("batata");

        System.out.println(response);

    }
}
