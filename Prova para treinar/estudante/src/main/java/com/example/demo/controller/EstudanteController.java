package com.example.demo.controller;

import com.example.demo.model.EstudanteModel;
import com.example.demo.service.EstudanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/estudante")
public class EstudanteController {

    @Autowired
    private EstudanteService estudanteService;

    @PostMapping
    public EstudanteModel criarEstudante(@RequestBody EstudanteModel estudanteModel) {
        return estudanteService.criarEstudante(estudanteModel);
    }

    @GetMapping
    public List<EstudanteModel> buscarTodosEstudante() {
        return EstudanteService.buscarTodosEstudante();
    }

    @DeleteMapping("/{id}")
    public void deletarEstudante(@PathVariable Long id) {
        estudanteService.deletarEstudante(id);
    }

    @GetMapping("/{id}")
    public Optional<EstudanteModel> buscarId(@PathVariable Long id) {
        return Optional.ofNullable(estudanteService.buscarId(id));
    }

    @PutMapping
    public EstudanteModel atualizarEstudante(@PathVariable Long id,@RequestBody EstudanteModel estudanteModel) {
        return estudanteService.atualizarEstudante(id, estudanteModel);
    }
}
