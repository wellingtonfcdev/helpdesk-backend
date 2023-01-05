package com.wellington.helping.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wellington.helping.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer>{

}
