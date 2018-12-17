package br.com.queroalugar.service;

import br.com.queroalugar.domain.Estado;
import br.com.queroalugar.repository.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstadoService{

    private EstadoRepository repository;

    public Estado salvar(Estado estado){

        if (estado == null){
            System.out.println("Objeto nulo!");
        }
        return repository.save(estado);
    }

    public Optional<Estado> findByEstado(Long id){
        return repository.findById(id);
    }

    public List<Estado> findAllEstados(){
        return repository.findAll();
    }

    public List<Estado> salvarTodos(List<Estado> estado){
        return repository.saveAll(estado);
    }

    public EstadoRepository getRepository() {
        return repository;
    }

    @Autowired
    public void setRepository(EstadoRepository repository) {
        this.repository = repository;
    }
}
