package com.desafio.compasso.service;

import com.desafio.compasso.model.Cidade;
import com.desafio.compasso.model.Cliente;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClienteService {

    public Cliente getById(int id) {
        return new Cliente();

    }

    public Cliente getByNome(String nome) {
        return new Cliente("AngryM4n","Masculino", new Date("01/01/2020"),23, new Cidade());
    }

    public String deletar(int id) {
        return "deletado";
    }

    public List<Cliente> getByEstado(String estado) {
     return new ArrayList<>();
    }

    // todo criar metodo para editar nome do usuário
}
