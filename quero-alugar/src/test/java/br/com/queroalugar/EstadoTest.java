package br.com.queroalugar;

import br.com.queroalugar.domain.Estado;
import br.com.queroalugar.service.EstadoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EstadoTest {

    @Autowired
    private EstadoService estadoService;


    @Test
    public void salvar(){

        List<Estado> estados = new ArrayList<>();

        Estado estado = new Estado("Acre", "AC");
        Estado estado2 = new Estado("Alagoas", "AL");
        Estado estado3 = new Estado("Amapá", "AP");
        Estado estado4 = new Estado("Amazonas", "AM");
        Estado estado5 = new Estado("Bahia", "BA");
        Estado estado6 = new Estado("Ceará", "CE");
        Estado estado7 = new Estado("Distrito Federal", "DF");
        Estado estado8 = new Estado("Espírito Santo", "ES");
        Estado estado9 = new Estado("Goiás", "GO");
        Estado estado10 = new Estado("Maranhão", "MA");
        Estado estado11 = new Estado("Mato Grosso", "MT");
        Estado estado12 = new Estado("Mato Grosso do Sul", "MS");
        Estado estado13 = new Estado("Minas Gerais", "MG");
        Estado estado14 = new Estado("Pará", "PA");
        Estado estado15 = new Estado("Paraíba", "PB");
        Estado estado16 = new Estado("Paraná", "PR");
        Estado estado17 = new Estado("Pernambuco", "PE");
        Estado estado18 = new Estado("Piauí", "PI");
        Estado estado19 = new Estado("Rio de Janeiro", "RJ");
        Estado estado20 = new Estado("Rio Grande do Norte", "RN");
        Estado estado21 = new Estado("Rio Grande do Sul", "RS");
        Estado estado22 = new Estado("Rondônia", "RO");
        Estado estado23 = new Estado("Roraima", "RR");
        Estado estado24 = new Estado("Santa Catarina", "SC");
        Estado estado25 = new Estado("São Paulo", "SP");
        Estado estado26 = new Estado("Sergipe", "SE");
        Estado estado27 = new Estado("Tocantins", "TO");

        estados.addAll(Arrays.asList(estado, estado2, estado3, estado4, estado5, estado6, estado7, estado8, estado9, estado10,
                estado11, estado12, estado13, estado14, estado15, estado16, estado17, estado18, estado19, estado20, estado21,
                estado22, estado23, estado24, estado25, estado26, estado27));

        estadoService.salvarTodos(estados);
    }

}
