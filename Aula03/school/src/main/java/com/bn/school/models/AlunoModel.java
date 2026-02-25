package com.bn.school.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import jakarta.persistence.*;


@Entity
public class AlunoModel {

    @Id
    @GeneratedValue(Strategy = GenerationType.IDENTITY)

    private long id;
    private String nome;
    private String matricula;
    private String endereco;
    private String email;

    public AlunoModel() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
