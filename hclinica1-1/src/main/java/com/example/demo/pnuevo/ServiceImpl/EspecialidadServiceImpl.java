package com.example.demo.pnuevo.ServiceImpl;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.pnuevo.Dao.ConsultaDao;
import com.example.demo.pnuevo.Dao.EspecialidaDao;
import com.example.demo.pnuevo.Entity.Consulta;
import com.example.demo.pnuevo.Entity.Especialida;
import com.example.demo.pnuevo.Service.ConsultaService;
import com.example.demo.pnuevo.Service.EspecialidaService;

@Service
public class EspecialidadServiceImpl implements EspecialidaService{
@Autowired
private  EspecialidaDao consultaeDao;

@Override
public Especialida create(Especialida es) {
	// TODO Auto-generated method stub
	return consultaeDao.create(es);
}

@Override
public Especialida update(Especialida es) {
	// TODO Auto-generated method stub
	return consultaeDao.update(es);
}

@Override
public void delete(long id) {
	// TODO Auto-generated method stub
	consultaeDao.delete(id);
}

@Override
public Optional<Especialida> read(Long id) {
	// TODO Auto-generated method stub
	return consultaeDao.read(id);
}

@Override
public List<Especialida> readAll() {
	// TODO Auto-generated method stub
	return consultaeDao.readAll();
}


}
