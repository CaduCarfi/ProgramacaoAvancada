package com.example.demo.service;

import com.example.demo.model.EstudanteModel;
import com.example.demo.repositories.EstudanteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudanteService {

    private static EstudanteRepository estudanteRepository;

    public EstudanteService(EstudanteRepository estudanteRepository) {
        this.estudanteRepository = estudanteRepository;
    }

    public EstudanteModel criarEstudante(EstudanteModel estudante) {
        return estudanteRepository.save(estudante);
    }

    public static List<EstudanteModel> buscarTodosEstudante() {
        return estudanteRepository.findAll();
    }

    public void  deletarEstudante(Long id) {
        estudanteRepository.deleteById(id);
    }

}
