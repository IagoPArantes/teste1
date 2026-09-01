package com.example.teste1.Repository;

import com.example.teste1.Dto.PessoaDto;
import com.example.teste1.Entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
