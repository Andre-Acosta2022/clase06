package com.example.demo.pnuevo.DaoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.pnuevo.Dao.ConsultaDao;
import com.example.demo.pnuevo.Entity.Consulta;
import com.example.demo.pnuevo.Repository.ConsultaRepository;

@Component
public class ConsultaDaoImpl  implements ConsultaDao{
@Autowired
private ConsultaRepository consultaRepository;

@Override
public Consulta create(Consulta con) {
	// TODO Auto-generated method stub
	return consultaRepository.save(con);
}

@Override
public Consulta update(Consulta con) {
	// TODO Auto-generated method stub
	return consultaRepository.save(con);
}

@Override
public void delete(long id) {
	// TODO Auto-generated method stub
	consultaRepository.deleteById(id);
}

@Override
public Optional<Consulta> read(Long id) {
	// TODO Auto-generated method stub
	return consultaRepository.findById(id);
}

@Override
public List<Consulta> readAll() {
	// TODO Auto-generated method stub
	return consultaRepository.findAll();
}


}
