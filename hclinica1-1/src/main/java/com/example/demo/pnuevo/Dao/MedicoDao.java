package com.example.demo.pnuevo.Dao;

import java.util.List;
import java.util.Optional;

import com.example.demo.pnuevo.Entity.Medico;

public interface MedicoDao {
	Medico create(Medico me);

	Medico update(Medico me);

	void delete(long id);

	Optional<Medico> read(Long id);

	List<Medico> readAll();
}
