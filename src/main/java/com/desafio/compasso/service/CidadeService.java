package com.desafio.compasso.service;

import com.desafio.compasso.exception.RecursoNaoEncontrado;
import com.desafio.compasso.model.Cidade;
import com.desafio.compasso.repository.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CidadeService {

    @Autowired
    CidadeRepository repository;

    public List<Cidade> findByEstado(String estado) {

        return repository.findByEstado(estado);

    }

    public List<Cidade> findByNome(String nome) {
        return repository.findByNome(nome);
    }
}
