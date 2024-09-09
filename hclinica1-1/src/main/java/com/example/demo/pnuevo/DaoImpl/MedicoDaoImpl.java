package com.example.demo.pnuevo.DaoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.pnuevo.Dao.MedicoDao;
import com.example.demo.pnuevo.Dao.PacienteDao;
import com.example.demo.pnuevo.Entity.Medico;
import com.example.demo.pnuevo.Entity.Paciente;
import com.example.demo.pnuevo.Repository.MedicoRepository;
import com.example.demo.pnuevo.Repository.PacienteRepository;

@Component
public class MedicoDaoImpl  implements MedicoDao{
@Autowired
private MedicoRepository medicoRepository;

@Override
public Medico create(Medico me) {
	// TODO Auto-generated method stub
	return medicoRepository.save(me);
}

@Override
public Medico update(Medico me) {
	// TODO Auto-generated method stub
	return medicoRepository.save(me);
}

@Override
public void delete(long id) {
	// TODO Auto-generated method stub
	medicoRepository.deleteById(id);
}

@Override
public Optional<Medico> read(Long id) {
	// TODO Auto-generated method stub
	return medicoRepository.findById(id);
}

@Override
public List<Medico> readAll() {
	// TODO Auto-generated method stub
	return medicoRepository.findAll();
}


}
