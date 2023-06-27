package br.com.conta.servico;

import br.com.conta.DAO.DataClientDAO;
import br.com.conta.model.DataClient;

public class ServiceClient  {

    private DataClientDAO dataClientDAO;


    public ServiceClient(DataClientDAO dataClientDAO) {
        this.dataClientDAO = dataClientDAO;
    }

    public DataClient ConsultClientDatabyCPF(String cpf) throws  IllegalArgumentException{
        String regex = "\\d{11}";
        boolean valido = cpf.matches(regex);

        if (!valido){
            throw new IllegalArgumentException("CPf INVALIDO");
        }

        return dataClientDAO.selectDataClient(cpf);
    }

}
