package com.example.demo.pnuevo.Service;

import java.util.List;
import java.util.Optional;


import com.example.demo.pnuevo.Entity.Medico;

public interface MedicoService {
	Medico create(Medico me);

	Medico update(Medico me);

	void delete(long id);

	Optional<Medico> read(Long id);

	List<Medico> readAll();
}
