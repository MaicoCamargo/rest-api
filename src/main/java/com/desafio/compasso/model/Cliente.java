package com.desafio.compasso.model;

import org.springframework.context.annotation.Primary;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Cliente {

    //todo tornar o id auto increment
    @Id @GeneratedValue
    private int id;
    private String nome;
    private String sexo;
    private Date dataNascimento;
    private int idade;
    @ManyToOne
    private Cidade cidade;

    public Cliente() {
    }

    public Cliente(int id, String nome, String sexo, Date dataNascimento, int idade, Cidade cidade) {
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

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
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
