package com.example.demo.Controller;

import com.example.demo.models.Pessoa;
import com.example.demo.repositories.PessoaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    private final PessoaRepository pessoaRepository;

    public PessoaController(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    @GetMapping
    public List<Pessoa> findAll() {
        return pessoaRepository.findAll();
    }

    @PostMapping
    public Pessoa save(@RequestBody Pessoa pessoa){
        return pessoaRepository.save(pessoa);
    }
}
