package com.example.demo.pnuevo.ServiceImpl;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.pnuevo.Dao.ConsultaDao;
import com.example.demo.pnuevo.Entity.Consulta;
import com.example.demo.pnuevo.Service.ConsultaService;

@Service
public class ConsultaServiceImpl implements ConsultaService{
@Autowired
private  ConsultaDao consultaeDao;

@Override
public Consulta create(Consulta con) {
	// TODO Auto-generated method stub
	return consultaeDao.create(con);
}

@Override
public Consulta update(Consulta con) {
	// TODO Auto-generated method stub
	return consultaeDao.update(con);
}

@Override
public void delete(Long id) {
	// TODO Auto-generated method stub
	consultaeDao.delete(id);
}

@Override
public Optional<Consulta> read(Long id) {
	// TODO Auto-generated method stub
	return consultaeDao.read(id);
}

@Override
public List<Consulta> readAll() {
	// TODO Auto-generated method stub
	return consultaeDao.readAll();
}




}
