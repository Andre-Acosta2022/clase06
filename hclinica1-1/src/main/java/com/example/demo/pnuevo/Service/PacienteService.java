package com.example.demo.pnuevo.Service;

import java.util.List;
import java.util.Optional;

import com.example.demo.pnuevo.Entity.Paciente;

public interface PacienteService {
Paciente create(Paciente pac);
Paciente update(Paciente pac);
void delete(Long id);
Optional<Paciente>read (Long id);
List<Paciente> readAll();
}
