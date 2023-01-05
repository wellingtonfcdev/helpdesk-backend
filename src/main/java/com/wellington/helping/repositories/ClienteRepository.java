package com.wellington.helping.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wellington.helping.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
