package com.desafio.compasso.controller;

import com.desafio.compasso.exception.RecursoNaoEncontrado;
import com.desafio.compasso.model.Cliente;
import com.desafio.compasso.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
@ResponseBody
public class ClienteController {

    @Autowired
    private ClienteService service;


    @GetMapping("{id}")
    private Cliente getClienteById(@PathVariable int id) throws RecursoNaoEncontrado {
        return service.findById(id);
    }

    @GetMapping(params = "nome")
    private Cliente getClienteByNome(@RequestParam("nome") String nome) throws RecursoNaoEncontrado {
        return service.getByNome(nome);
    }

    @GetMapping( params = "estado")
    private List<Cliente> getClienteByEstado(@RequestParam("estado") String estado){
        return service.getByEstado(estado);
    }

    @DeleteMapping("{id}")
    private String deletarCliente(@PathVariable int id) throws RecursoNaoEncontrado {
        Cliente cliente = service.findById(id);
        return service.deletar(cliente);
    }

    // todo add reques post criar cliente
    //todo add request patch para editar o nome do cliente
}
