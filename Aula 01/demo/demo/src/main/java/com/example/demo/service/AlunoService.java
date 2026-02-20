package com.example.demo.service;

import com.example.demo.models.Alunos;
import com.example.demo.repositories.AlunosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    @Autowired
    private final AlunosRepository alunosRepository;

    public AlunoService(AlunosRepository alunosRepository) {
        this.alunosRepository = alunosRepository;
    }

    public List<Alunos> findAll() {
        return alunosRepository.findAll();
    }
}
