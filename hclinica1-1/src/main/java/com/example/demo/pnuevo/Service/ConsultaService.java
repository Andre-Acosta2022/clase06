package com.example.demo.pnuevo.Service;

import java.util.List;
import java.util.Optional;

import com.example.demo.pnuevo.Entity.Consulta;

public interface ConsultaService {
	Consulta create(Consulta con);
	Consulta update(Consulta con);
void delete(Long id);
Optional<Consulta>read (Long id);
List<Consulta> readAll();
}
