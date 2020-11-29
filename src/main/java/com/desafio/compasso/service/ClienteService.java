package com.desafio.compasso.service;

import com.desafio.compasso.exception.RecursoNaoEncontrado;
import com.desafio.compasso.model.Cliente;
import com.desafio.compasso.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
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

    /**
     * criar novo cliente
     * @param cliente - dados do novo cliente
     * @return - mensagem de sucesso ou erro no cadastro
     */
    public Cliente cadastrar(Cliente cliente) throws RecursoNaoEncontrado {
        return repository.save(cliente);
    }

    /**
     *
     * @param cliente - cliente com novo nome
     * @return - mensagem de sucesso ou erro no update
     * th
     */
    /**
     * editar o nome de um cliente
     * @param cliente - cliente com novo nome
     * @return  - mensagem de sucesso ou erro no update
     * @throws RecursoNaoEncontrado - mensagem informando caso o cliente não seja encontrado
     */
    public Cliente update(@NotNull Cliente cliente) throws RecursoNaoEncontrado {
        Optional<Cliente> encontrado =  repository.findById(cliente.getId());

        if (encontrado.isPresent()){
            return repository.save(cliente);
        } else {
            throw new RecursoNaoEncontrado("Ocorreu um erro no update do nome");
        }

    }

}
