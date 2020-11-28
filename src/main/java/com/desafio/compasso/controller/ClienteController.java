package com.desafio.compasso.controller;

import com.desafio.compasso.model.Cliente;
import com.desafio.compasso.service.ClienteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
@ResponseBody
public class ClienteController {


    @GetMapping("{id}")
    private Cliente getClienteById(@PathVariable int id){
        return new ClienteService().getById(id);
    }

    @GetMapping(params = "nome")
    private Cliente getClienteByNome(@RequestParam("nome") String nome){
        return new ClienteService().getByNome(nome);
    }

    @GetMapping( params = "estado")
    private List<Cliente> getClienteByEstado(@RequestParam("estado") String estado){
        return new ClienteService().getByEstado(estado);
    }

    @DeleteMapping("{id}")
    private String deletarCliente(@PathVariable int id ){
        return new ClienteService().deletar(id);
    }

    // todo add reques post criar cliente
    //todo add request patch para editar o nome do cliente
}
