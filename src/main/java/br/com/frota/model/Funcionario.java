package br.com.frota.model;

import br.com.frota.DAO.PessoaDAO;

public class Funcionario extends GenericModel{



 static  private PessoaDAO pessoaDao = new PessoaDAO();
   private Integer id;
   private String codigoFuncional;

   private Integer pessoaId;


    public Funcionario(Integer id, String codigoFuncional, Integer pessoaId) {

        this.codigoFuncional = codigoFuncional;
        this.pessoaId = pessoaId;
        super.setId(id);
    }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Tipo_pessoa { \n" +
                "   id= '" + this.getId() + "\' \n"  +
                "   codigo_funcional='" + codigoFuncional + "\' \n" +
                "   pessoa = '" + pessoaDao.selectPessoaById(pessoaId) + " \' \n" +
                "} \n";
    }

    public String getCodigoFuncional() {
        return codigoFuncional;
    }

    public Integer getPessoaId() {
        return pessoaId;
    }
}
