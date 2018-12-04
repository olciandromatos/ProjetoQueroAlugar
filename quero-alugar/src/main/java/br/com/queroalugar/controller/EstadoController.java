package br.com.queroalugar.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api")
public class EstadoController {

    @RequestMapping(value = "ola")
    public String ola(){
        return "index.html";
    }

    @RequestMapping(value = "estados")
    public String estados(){
        return "https://servicodados.ibge.gov.br/api/v1/localidades/estados/{UF}/mesorregioes";

    }
}
