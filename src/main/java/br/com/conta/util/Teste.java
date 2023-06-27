package br.com.conta.util;
import br.com.conta.DAO.*;
import br.com.conta.model.Cliente;
import br.com.conta.model.DataClient;
import br.com.conta.model.Pessoa;
import br.com.conta.model.TipoPessoa;
import br.com.conta.servico.ServiceClient;

import java.util.Arrays;

public class Teste {
    static TipoPessoaDAO tipo_pessoaDAO = new TipoPessoaDAO();
    static PessoaDAO pessoa = new PessoaDAO();
    static RotaDAO rota = new RotaDAO();
    static TarefaRotaDAO tarefaRota = new TarefaRotaDAO();
    static TimeRotaDAO timeRotaDAO = new TimeRotaDAO();

    static DataClientDAO dataClientDAO = new DataClientDAO();

    static ClienteDAO clienteDAO = new ClienteDAO();

    static FuncionarioDAO funcionario = new FuncionarioDAO();
    public static void main(String[] args) throws Exception {


//        TipoPessoa tipoPessoa = tipo_pessoaDAO.selectTipoPessoaById(2);
//
//        Pessoa pessoa1 = new Pessoa(10, "Clara Lira Zarro", "09714631300", tipoPessoa);
//
//        pessoa.insertPessoa(pessoa1);
//
//
//        pessoa.selectAllPessoa().forEach(System.out::print);

//        Cliente cliente2 = new Cliente(10, "2313213", "2131312312", pessoa.selectPessoaById(2));
//        clienteDAO.insertCliente(cliente2);


        clienteDAO.selectAllCliente().forEach(System.out::print);



//        ServiceClient serviceClient = new ServiceClient(dataClientDAO);
//
//        DataClient response = serviceClient.ConsultClientDatabyCPF("09174300000");
//


    }
}
