package one.digitalinnovation.gof.facade;

import subsistema1.crm.CrmService;
import subsistema2.crm.CepApi;

public class Facade {
    public void migrarCliente(String nome, String cep) {
       String estado = CepApi.getInstancia().recuperarEstado(cep);
       String cidade = CepApi.getInstancia().recuperarCidade(cep);

        CrmService.gravarCliente(nome, cep, estado, cidade);

    }
}
