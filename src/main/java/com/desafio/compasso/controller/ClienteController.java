package com.desafio.compasso.controller;

import com.desafio.compasso.model.Cliente;
import com.desafio.compasso.service.ClienteService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cliente")
@ResponseBody
public class ClienteController {


    @GetMapping("{id}")
    private Cliente getClienteById(@PathVariable int id){
        System.out.println("id: "+ id);
        return new ClienteService().getById(id);
    }
}
