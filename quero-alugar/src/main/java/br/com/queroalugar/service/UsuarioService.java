package br.com.queroalugar.service;

import br.com.queroalugar.domain.Usuario;
import br.com.queroalugar.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UsuarioService {


    private UsuarioRepository usuarioRepository;

    public void salvar(Usuario usuario){

        if (usuario == null){
            System.out.println("Objeto nulo!");
        }else{
            usuarioRepository.save(usuario);
        }

    }

    public String buscarTodos(){
        return "Cadastrado!";
    }

    @Autowired
    public void setUsuarioRepository(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public UsuarioRepository getUsuarioRepository() {
        return usuarioRepository;
    }
}
