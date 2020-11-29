package com.desafio.compasso.controller;

import com.desafio.compasso.model.Cidade;
import com.desafio.compasso.service.CidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("cidade")
public class CidadeController {

    @Autowired
    CidadeService service;

    @GetMapping(params = "estado")
    private List<Cidade> getByEstado(@RequestParam String estado) {
        return service.findByEstado(estado);
    }

    @GetMapping(params = "nome")
    private List<Cidade> getByNome(@RequestParam String nome) {
        return service.findByNome(nome);
    }
}
