package com.example.demo.pnuevo.ServiceImpl;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.pnuevo.Dao.PacienteDao;
import com.example.demo.pnuevo.Entity.Paciente;
import com.example.demo.pnuevo.Service.PacienteService;

@Service
public class PacienteServiceImpl implements PacienteService{
@Autowired
private  PacienteDao pacienteDao;

@Override
public Paciente create(Paciente pac) {
	// TODO Auto-generated method stub
	return pacienteDao.create(pac);
}

@Override
public Paciente update(Paciente pac) {
	// TODO Auto-generated method stub
	return pacienteDao.update(pac);
}

@Override
public void delete(Long id) {
	// TODO Auto-generated method stub
	pacienteDao.delete(id);
}

@Override
public Optional<Paciente> read(Long id) {
	// TODO Auto-generated method stub
	return pacienteDao.read(id);
}

@Override
public List<Paciente> readAll() {
	// TODO Auto-generated method stub
	return pacienteDao.readAll();
}

}
