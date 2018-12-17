package br.com.queroalugar.controller;

import br.com.queroalugar.domain.Estado;
import br.com.queroalugar.service.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "api")
public class EstadoController {

    @Autowired
    private EstadoService estadoService;

    @RequestMapping(value = "/ola")
    public String ola(){
        return "index.html";
    }

    @RequestMapping(value = "/estado/{id}", method = RequestMethod.GET)
    public Optional<Estado> findByEstado(@PathVariable Long id){
        return estadoService.findByEstado(id);
    }

    @RequestMapping(value = "/estado", method = RequestMethod.GET)
    public List<Estado> findByEstados(){
        return estadoService.findAllEstados();
    }

    @RequestMapping(value = "/estado}", method = RequestMethod.POST)
    public Estado salvar(Estado estado){
        return estadoService.salvar(estado);
    }
}
