package com.desafio.compasso.service;

import com.desafio.compasso.model.Cidade;
import com.desafio.compasso.repository.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CidadeService {

    @Autowired
    CidadeRepository repository;

    /**
     * buscar cidade pelo estado
     * @param estado - sigla de um estado
     * @return - lista de cidades com este estado
     */
    public List<Cidade> findByEstado(String estado) {

        return repository.findByEstado(estado);

    }

    /**
     * buscar cidade pelo nome
     * @param nome - nome de uma cidade
     * @return - lista de cidades com determinado nome
     */
    public List<Cidade> findByNome(String nome) {
        return repository.findByNome(nome);
    }
}
