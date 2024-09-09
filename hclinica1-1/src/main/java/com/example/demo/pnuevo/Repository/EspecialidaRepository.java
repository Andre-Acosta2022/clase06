package com.example.demo.pnuevo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.pnuevo.Entity.Especialida;

@Repository
public interface EspecialidaRepository extends JpaRepository<Especialida, Long> {

}
