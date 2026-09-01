package com.example.teste1.Controller;

import com.example.teste1.Entity.Pessoa;
import com.example.teste1.Service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/pessoa")
@RestController
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @PostMapping
    public ResponseEntity<Pessoa> save(@RequestBody Pessoa pessoa) {
        Pessoa pessoaSalva = pessoaService.save(pessoa);
        return ResponseEntity.ok().body(pessoaSalva);
    }
}
