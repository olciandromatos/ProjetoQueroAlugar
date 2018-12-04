package br.com.queroalugar;

import br.com.queroalugar.domain.Estado;
import br.com.queroalugar.service.EstadoService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class EstadoTest {

    @Autowired
    private EstadoService estadoService;


    @Test
    public void salvar(){

        Estado estado = new Estado();

        estado.setNome("Acre");
        estado.setSigla("AC");

        estado.setNome("Alagoas");
        estado.setSigla("AL");

        estado.setNome("Amapá");
        estado.setSigla("AP");

        estado.setNome("Amazonas");
        estado.setSigla("AM");

        estado.setNome("Bahia");
        estado.setSigla("BA");

        estado.setNome("Ceará");
        estado.setSigla("CE");

        estado.setNome("Distrito Federal\n");
        estado.setSigla("DF");

        estado.setNome("Espírito Santo");
        estado.setSigla("ES");

        estado.setNome("Goiás");
        estado.setSigla("GO");

        estado.setNome("Maranhão");
        estado.setSigla("MA");

        estado.setNome("Mato Grosso");
        estado.setSigla("MT");

        estado.setNome("Mato Grosso do Sul");
        estado.setSigla("MS");

        estado.setNome("Minas Gerais");
        estado.setSigla("MG");

        estado.setNome("Pará");
        estado.setSigla("PA");

        estado.setNome("Paraíba");
        estado.setSigla("PB");

        estado.setNome("Paraná");
        estado.setSigla("PR");

        estado.setNome("Pernambuco");
        estado.setSigla("PE");

        estado.setNome("Piauí");
        estado.setSigla("PI");

        estado.setNome("Rio de Janeiro");
        estado.setSigla("RJ");

        estado.setNome("Rio Grande do Norte");
        estado.setSigla("RN");

        estado.setNome("Rio Grande do Sul");
        estado.setSigla("RS");

        estado.setNome("Rondônia");
        estado.setSigla("RO");

        estado.setNome("Roraima");
        estado.setSigla("RR");

        estado.setNome("Santa Catarina");
        estado.setSigla("SC");

        estado.setNome("São Paulo");
        estado.setSigla("SP");

        estado.setNome("Sergipe");
        estado.setSigla("SE");

        estado.setNome("Tocantins");
        estado.setSigla("TO");

        estadoService.salvar(estado);
    }

}
