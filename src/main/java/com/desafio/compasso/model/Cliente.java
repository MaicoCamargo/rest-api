package com.desafio.compasso.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Cliente {

    @Id @GeneratedValue
    private int id;
    private String nome;
    private String sexo;
    private LocalDate dataNascimento;
    private int idade;
    @ManyToOne
    private Cidade cidade;

    public Cliente() {
    }

    public Cliente(int id, String nome, String sexo, LocalDate dataNascimento, int idade, Cidade cidade) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.idade = idade;
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", idade=" + idade +
                ", cidade=" + cidade +
                '}';
    }
}
