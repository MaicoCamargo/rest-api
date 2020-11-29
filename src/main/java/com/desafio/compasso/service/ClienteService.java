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
     *
     * @param id - id do cliente
     * @return cliente
     * @throws RecursoNaoEncontrado - string com mensagem caso cliente não seja incontrado
     */
    public Cliente findById(int id) throws RecursoNaoEncontrado {
        Optional<Cliente> cliente = repository.findById(id);

        if (cliente.isPresent()) {
            return cliente.get();
        } else {
            throw new RecursoNaoEncontrado("Cliente não encontado");
        }

    }

    /**
     * buscando cliente pelo nome
     *
     * @param nome - nome do cliente para busca
     * @return - cliente com donem
     */
    public Cliente getByNome(String nome) {
        return repository.findByNome(nome);


    }


    /**
     * excluir um cliente
     *  -  primeiro busca o cliente pelo id
     *  - caso encontrar deleta do banco
     * @param id - id do cliente para excluir
     * @return - mensagem informando que o cliente foi deletado
     * @throws RecursoNaoEncontrado - mensagem informando que ocorreu um erro no deletar
     */
    public String deletar(int id) throws RecursoNaoEncontrado {

        Optional<Cliente> cliente= repository.findById(id);
        if (cliente.isPresent()){

            repository.deleteById(id);
            return "Cliente Deletado, buddy";
        } else {
            throw new RecursoNaoEncontrado("Ocorreu um erro no deletar o cliente");
        }
    }

    /**
     * buscando cliente pelo estado
     *
     * @param estado - estado
     * @return - lista de cliente de determinado estado
     */
    public List<Cliente> getByEstado(String estado) {
        return repository.findByCidade_Estado(estado);
    }

    public String update() {
        return  "em construção";
    }
}
