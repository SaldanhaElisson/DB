package br.com.frota.util;

import br.com.frota.DAO.PessoaDAO;
import br.com.frota.DAO.TipoPessoaDAO;
import br.com.frota.model.Pessoa;
import br.com.frota.model.TipoPessoa;
import java.util.Arrays;

import java.sql.SQLException;

public class Teste {
    static TipoPessoaDAO tipo_pessoaDAO = new TipoPessoaDAO();
    static PessoaDAO pessoa = new PessoaDAO();
    public static void main(String[] args) throws SQLException {

//        TipoPessoa tipo_pessoa = new TipoPessoa(3, "pessoa batata doce doce");
//        tipo_pessoaDAO.insertTipoPessoa(tipo_pessoa);
//
//        System.out.print(tipo_pessoaDAO.selectTipoPessoa(3));
//        tipo_pessoaDAO.selectAllTipoPessoa().forEach(System.out::println);

        Pessoa pessoa1 = new Pessoa(1, "elisson", "544556464", 2);
        pessoa.insertPessoa(pessoa1);
    }
}
