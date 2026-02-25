package com.bn.school.controllers;

import com.bn.school.models.AlunoModel;
import com.bn.school.repositories.AlunoRepository;
import com.bn.school.services.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/alunos")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @PostMapping
    public AlunoModel criarAluno(@RequestBody AlunoModel alunoModel) {
        return alunoService.criarAluno(alunoModel);
    }

    @GetMapping
    public List<AlunoModel> buscarTodosAlunos() {
        return alunoService.buscarTodosAlunos();
    }

    @DeleteMapping("/{id}")
    public void deletarAluno(@PathVariable Long id) {
        alunoService.deletarAluno(id);
    }
}
