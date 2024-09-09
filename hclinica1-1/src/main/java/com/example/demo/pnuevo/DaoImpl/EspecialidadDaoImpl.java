package com.example.demo.pnuevo.DaoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.pnuevo.Dao.EspecialidaDao;
import com.example.demo.pnuevo.Dao.PacienteDao;
import com.example.demo.pnuevo.Entity.Especialida;
import com.example.demo.pnuevo.Entity.Paciente;
import com.example.demo.pnuevo.Repository.EspecialidaRepository;
import com.example.demo.pnuevo.Repository.PacienteRepository;

@Component
public class EspecialidadDaoImpl  implements EspecialidaDao{
@Autowired
private EspecialidaRepository pacienteRepository;

@Override
public Especialida create(Especialida es) {
	// TODO Auto-generated method stub
	return pacienteRepository.save(es);
}

@Override
public Especialida update(Especialida es) {
	// TODO Auto-generated method stub
	return pacienteRepository.save(es);
}

@Override
public void delete(long id) {
	// TODO Auto-generated method s
	pacienteRepository.deleteById(id);
	
}

@Override
public Optional<Especialida> read(Long id) {
	// TODO Auto-generated method stub
	return pacienteRepository.findById(id);
}

@Override
public List<Especialida> readAll() {
	// TODO Auto-generated method stub
	return pacienteRepository.findAll();
}


}
