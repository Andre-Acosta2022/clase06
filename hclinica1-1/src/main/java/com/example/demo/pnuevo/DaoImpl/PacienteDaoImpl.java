package com.example.demo.pnuevo.DaoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.pnuevo.Dao.PacienteDao;
import com.example.demo.pnuevo.Entity.Paciente;
import com.example.demo.pnuevo.Repository.PacienteRepository;

@Component
public class PacienteDaoImpl  implements PacienteDao{
@Autowired
private PacienteRepository pacienteRepository;

@Override
public Paciente create(Paciente pac) {
	// TODO Auto-generated method stub
	return pacienteRepository.save(pac);
}

@Override
public Paciente update(Paciente pac) {
	// TODO Auto-generated method stub
	return pacienteRepository.save(pac);
}

@Override
public void delete(long id) {
	// TODO Auto-generated method stub
	pacienteRepository.deleteById(id);
}

@Override
public Optional<Paciente> read(Long id) {
	// TODO Auto-generated method stub
	return pacienteRepository.findById(id);
}

@Override
public List<Paciente> readAll() {
	// TODO Auto-generated method stub
	return pacienteRepository.findAll();
}
}
