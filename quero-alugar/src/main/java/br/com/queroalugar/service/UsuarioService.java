package br.com.queroalugar.service;

import br.com.queroalugar.domain.Usuario;
import br.com.queroalugar.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public void salvar(Usuario usuario){

        if (usuario == null){
            System.out.println("Objeto nulo!");
        }else{
            usuarioRepository.save(usuario);
        }

    }
}
