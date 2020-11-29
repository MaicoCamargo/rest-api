package com.desafio.compasso.service;

import com.desafio.compasso.ClienteRepository;
import com.desafio.compasso.exception.RecursoNaoEncontrado;
import com.desafio.compasso.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    /**
     * buscar cliente pelo id
     * @param id - id do cliente
     * @return cliente
     * @throws RecursoNaoEncontrado - string com mensagem caso cliente não seja incontrado
     */
    public Cliente findById(int id) throws RecursoNaoEncontrado {
        Optional<Cliente> cliente = repository.findById(id);

        if(cliente.isPresent()) {
            return cliente.get();
        } else {
            throw new RecursoNaoEncontrado("Cliente não encontado");
        }

    }

    /**
     * buscando cliente pelo nome
     * @param nome - nome do cliente para busca
     * @return - cliente com donem
     * @throws RecursoNaoEncontrado - caso n exista cliente com nome informado
     */
    public Cliente getByNome(String nome) throws RecursoNaoEncontrado {
        return repository.findByNome(nome);


    }

    /**
     * excluir um cliente
     * @param cliente - objeto cliente
     * @return - string com mensagem de deletado
     */
    public String deletar(Cliente cliente) {
            //todo trazer a buscar do cliente para service
         repository.delete(cliente);
         return "Cliente Deletado";
    }

    /**
     * buscando cliente pelo estado
     * @param estado - estado
     * @return - lista de cliente de determinado estado
     */
    public List<Cliente> getByEstado(String estado) {
     return repository.findByCidade_Estado(estado);
    }

    // todo criar metodo para editar nome do usuário
}
