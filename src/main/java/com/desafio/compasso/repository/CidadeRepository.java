package com.desafio.compasso.repository;

import com.desafio.compasso.model.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

    List<Cidade> findByNome(String nome);
    List<Cidade> findByEstado(String estado);
}
