package com.wellington.helping.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wellington.helping.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{

}
