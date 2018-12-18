package br.com.queroalugar.service;

import br.com.queroalugar.domain.Cidade;
import br.com.queroalugar.domain.Estado;
import br.com.queroalugar.repository.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CidadeService {


    private CidadeRepository cidadeRepository;

    public List<Cidade> salvarTodos(List<Cidade> cidade){
        return cidadeRepository.saveAll(cidade);
    }

    public CidadeRepository getCidadeRepository() {
        return cidadeRepository;
    }

    @Autowired
    public void setCidadeRepository(CidadeRepository cidadeRepository) {
        this.cidadeRepository = cidadeRepository;
    }
}
