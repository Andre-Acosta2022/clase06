package com.example.demo.pnuevo.Service;

import java.util.List;
import java.util.Optional;


import com.example.demo.pnuevo.Entity.Especialida;

public interface EspecialidaService {
	Especialida create (Especialida es);

	Especialida update(Especialida es);

	void delete(long id);

	Optional<Especialida> read(Long id);

	List<Especialida> readAll();
}
