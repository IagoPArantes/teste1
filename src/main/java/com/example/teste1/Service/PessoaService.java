package com.example.teste1.Service;

import com.example.teste1.Dto.PessoaDto;
import com.example.teste1.Entity.Pessoa;
import com.example.teste1.Repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public Pessoa save(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }
}
