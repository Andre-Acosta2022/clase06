package com.example.demo.pnuevo.Dao;

import java.util.List;
import java.util.Optional;

import com.example.demo.pnuevo.Entity.Paciente;

public interface PacienteDao {
	Paciente create(Paciente pac);

	Paciente update(Paciente pac);

	void delete(long id);

	Optional<Paciente> read(Long id);

	List<Paciente> readAll();
}
