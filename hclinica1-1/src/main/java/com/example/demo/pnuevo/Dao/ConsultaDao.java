package com.example.demo.pnuevo.Dao;

import java.util.List;
import java.util.Optional;

import com.example.demo.pnuevo.Entity.Consulta;

public interface ConsultaDao {
	Consulta create(Consulta con);

	Consulta update(Consulta con);

	void delete(long id);

	Optional<Consulta> read(Long id);

	List<Consulta> readAll();
}
