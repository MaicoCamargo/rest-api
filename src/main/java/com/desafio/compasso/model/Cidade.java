package com.desafio.compasso.model;

import javax.persistence.*;

@Entity
public class Cidade {

    //todo tornar o id auto increment
    @Id @GeneratedValue
    private int id;
    private String nome;
    private String estado;

    public Cidade() {
    }

    public Cidade(int id, String nome, String estado) {
        this.id = id;
        this.nome = nome;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Cidade{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
