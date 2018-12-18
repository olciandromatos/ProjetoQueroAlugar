package br.com.queroalugar;

import br.com.queroalugar.domain.Cidade;
import br.com.queroalugar.domain.Estado;
import br.com.queroalugar.service.CidadeService;
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
public class CidadeTest {

    @Autowired
    private EstadoService estadoService;

    private CidadeService cidadeService;

    @Test
    public void salvar(){

        Estado estado1 = new Estado("Goias", "GO");

        List<Cidade> cidades = new ArrayList<>();

        Cidade cidade1 =  new Cidade("Valparaiso de goiás", estado1);
        Cidade cidade2 =  new Cidade("Luziania", estado1);
        Cidade cidade3 =  new Cidade("Ocidental", estado1);
        Cidade cidade4 =  new Cidade("Novo Gama", estado1);

        cidades.addAll(Arrays.asList(cidade1, cidade2, cidade3, cidade4));

        estadoService.salvar(estado1);
        cidadeService.salvarTodos(cidades);


    }
}
