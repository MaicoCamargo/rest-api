package com.desafio.compasso.service;

import com.desafio.compasso.ClienteRepository;
import com.desafio.compasso.exception.RecursoNaoEncontrado;
import com.desafio.compasso.model.Cidade;
import com.desafio.compasso.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.relation.RelationNotFoundException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    public Cliente findById(int id) throws RecursoNaoEncontrado {
        Optional<Cliente> cliente = repository.findById(id);

        if(cliente.isPresent()) {
            return cliente.get();
        } else {
            throw new RecursoNaoEncontrado("Cliente não encontado");
        }

    }

    public Cliente getByNome(String nome) {
        return new Cliente(1, "AngryM4n","Masculino", new Date("01/01/2020"),23, new Cidade());
    }

    public String deletar(int id) {
        return "deletado";
    }

    public List<Cliente> getByEstado(String estado) {
     return new ArrayList<>();
    }

    // todo criar metodo para editar nome do usuário
}
