package com.desafio.compasso.service;

import com.desafio.compasso.exception.RecursoNaoEncontrado;
import com.desafio.compasso.model.Cliente;
import com.desafio.compasso.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public Cliente getByNome(String nome) throws RecursoNaoEncontrado {
        Cliente cliente = repository.findByNome(nome);
         return cliente;


    }

    public String deletar(Cliente cliente) {

         repository.delete(cliente);
         return "Cliente Deletado";
    }

    public List<Cliente> getByEstado(String estado) {
     return repository.findByCidade_Estado(estado);
    }

    // todo criar metodo para editar nome do usuário
}
