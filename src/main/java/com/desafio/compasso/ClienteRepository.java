package com.desafio.compasso;

import com.desafio.compasso.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository  extends JpaRepository<Cliente, Integer> {

    Cliente findByNome(String nome);
    List<Cliente> findByCidade_Estado(String estado);
}
