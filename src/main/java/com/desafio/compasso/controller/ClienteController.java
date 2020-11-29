package com.desafio.compasso.controller;

import com.desafio.compasso.exception.RecursoNaoEncontrado;
import com.desafio.compasso.model.Cliente;
import com.desafio.compasso.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService service;

    /**
     * buscar um cliente pelo id
     * @param id - id do cliente
     * @return - um cliente caso encontre no banco
     * @throws RecursoNaoEncontrado - mensagem informando que o cliente não foi encontrado
     */
    @GetMapping("{id}")
    private Cliente getClienteById(@PathVariable int id) throws RecursoNaoEncontrado {
        return service.findById(id);
    }

    /**
     * buscar cliente pelo nome
     * @param nome - nome para buscar no banco
     * @return - um unico cliente com o nome
     */
    @GetMapping(params = "nome")
    private Cliente getClienteByNome(@RequestParam("nome") String nome) throws RecursoNaoEncontrado {
        return service.getByNome(nome);
    }

    /**
     * buscar uma lista clientes pelo estado
     * @param estado - estado para buscar o cliente
     * @return lista clientes
     */
    @GetMapping( params = "estado")
    private List<Cliente> getClienteByEstado(@RequestParam("estado") String estado){
        return service.getByEstado(estado);
    }

    /**
     * apagar um cliente do banco
     * @param id - id do cliente para buscar no banco
     * @return - mensagem informando que o cliente foi excluido
     */
    @DeleteMapping("{id}")
    private String deletarCliente(@PathVariable int id) throws RecursoNaoEncontrado {
        return service.deletar(id);
    }

    /**
     * criar um novo cliente
     * @param cliente - novo cliente para criar
     * @return - mensagem com sucesso ou erro na criação
     */
    @PostMapping
    public Cliente cadastrar(@RequestBody Cliente cliente) throws RecursoNaoEncontrado {
        return service.cadastrar(cliente);
    }

    /**
     * editar o nome de um cliente
     * @param id - id do cliente para editar
     * @param cliente - novo nome do cleinte
     * @return -  mensagem com sucesso ou erro na edição
     */
    @PatchMapping("/{id}")
    public Cliente editar(@PathVariable int id,@RequestBody Cliente cliente) throws RecursoNaoEncontrado {
        cliente.setId(id);
        return service.update(cliente);
    }
}
