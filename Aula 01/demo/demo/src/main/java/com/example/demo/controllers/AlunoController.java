package com.example.demo.controllers;

import com.example.demo.models.Alunos;
import com.example.demo.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/schools")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @GetMapping
    public List<Alunos> findAll(){
        return alunoService.findAll();
    }
}
