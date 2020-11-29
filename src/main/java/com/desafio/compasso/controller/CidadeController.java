package com.desafio.compasso.controller;

import com.desafio.compasso.model.Cidade;
import com.desafio.compasso.service.CidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cidade")
public class CidadeController {

    @Autowired
    CidadeService service;

    /**
     * buscar cidade por estado
     * @param estado - estado para buscar no banco
     * @return - lista de cidade daquele estado
     */
    @GetMapping(params = "estado")
    private List<Cidade> getByEstado(@RequestParam String estado) {
        return service.findByEstado(estado);
    }

    /**
     * buscar cidade por nome
     * @param nome - nome para buscar no banco
     * @return - lista de cidade com determinado nome
     */
    @GetMapping(params = "nome")
    private List<Cidade> getByNome(@RequestParam String nome) {
        return service.findByNome(nome);
    }

    /**
     * criar um nova cidade
     * @param cidade - nova cidade para criar
     * @return - cidade criada
     */
    @PostMapping
    private Cidade cadastrar(@RequestBody Cidade cidade){
        return service.criar(cidade);
    }

}
