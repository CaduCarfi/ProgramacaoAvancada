package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name = "TBL_PESSOA")
public class Pessoa {

    @Id
    @GeneratedValue(Strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
}
