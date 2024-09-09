package com.example.demo.pnuevo.DaoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.pnuevo.Dao.DiagnosticoDao;
import com.example.demo.pnuevo.Dao.PacienteDao;
import com.example.demo.pnuevo.Entity.Diagnostico;
import com.example.demo.pnuevo.Entity.Paciente;
import com.example.demo.pnuevo.Repository.DiagnosticoRepository;
import com.example.demo.pnuevo.Repository.PacienteRepository;

@Component
public class DiagnosticoDaoImpl  implements DiagnosticoDao{
@Autowired
private DiagnosticoRepository diagnosticoRepository;

@Override
public Diagnostico create(Diagnostico dia) {
	// TODO Auto-generated method stub
	return diagnosticoRepository.save(dia);
}

@Override
public Diagnostico update(Diagnostico dia) {
	// TODO Auto-generated method stub
	return diagnosticoRepository.save(dia);
}

@Override
public void delete(long id) {
	// TODO Auto-generated method stub
	diagnosticoRepository.deleteById(id);
}

@Override
public Optional<Diagnostico> read(Long id) {
	// TODO Auto-generated method stub
	return diagnosticoRepository.findById(id);
}

@Override
public List<Diagnostico> readAll() {
	// TODO Auto-generated method stub
	return diagnosticoRepository.findAll();
}


}
