package com.example.demo.pnuevo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.example.demo.pnuevo.Entity.Diagnostico;

@Repository
public interface DiagnosticoRepository extends JpaRepository<Diagnostico, Long> {

}
