package br.com.queroalugar;

import br.com.queroalugar.domain.Locador;
import br.com.queroalugar.domain.Usuario;
import br.com.queroalugar.service.UsuarioService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UsuarioTest {

    @Autowired
    private UsuarioService usuarioService;


    @Test
    public void salvar(){
        Usuario usuario = new Usuario();
        Locador locador = new Locador();

        locador.setPrimeiroNome("Felipe");
        locador.setUltimoNome(" de jan");

        usuario.setLocador(locador);
        usuario.setNomeUsuario("felipe");
        usuario.setEmail("felipe@gmail.com");
        usuario.setSenha("123456");

        usuarioService.salvar(usuario);
    }
}
