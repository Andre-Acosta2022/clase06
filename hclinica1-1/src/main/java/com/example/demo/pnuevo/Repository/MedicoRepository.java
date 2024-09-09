package com.example.demo.pnuevo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.example.demo.pnuevo.Entity.Medico;

@Repository
public interface MedicoRepository extends JpaRepository<Medico, Long> {
}
