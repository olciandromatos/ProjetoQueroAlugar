package br.com.queroalugar.service;

import br.com.queroalugar.domain.Estado;
import br.com.queroalugar.repository.EstadoRepository;
import org.springframework.stereotype.Service;

@Service
public class EstadoService{

    EstadoRepository repository;

    public void salvar(Estado estado){

        if (estado == null){
            System.out.println("Objeto nulo!");
        }
        repository.save(estado);
    }
}
