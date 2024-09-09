package com.example.demo.pnuevo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.pnuevo.Entity.Consulta;

@Repository
public interface ConsultaRepository extends JpaRepository<Consulta, Long> {

}
