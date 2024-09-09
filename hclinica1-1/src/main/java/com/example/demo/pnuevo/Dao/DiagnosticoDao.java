package com.example.demo.pnuevo.Dao;

import java.util.List;
import java.util.Optional;

import com.example.demo.pnuevo.Entity.Diagnostico;

public interface DiagnosticoDao {
	Diagnostico create(Diagnostico dia);

	Diagnostico update(Diagnostico dia);

	void delete(long id);

	Optional<Diagnostico> read(Long id);

	List<Diagnostico> readAll();
}
