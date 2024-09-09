package com.example.demo.pnuevo.ServiceImpl;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.pnuevo.Dao.ConsultaDao;
import com.example.demo.pnuevo.Dao.MedicoDao;
import com.example.demo.pnuevo.Entity.Consulta;
import com.example.demo.pnuevo.Entity.Medico;
import com.example.demo.pnuevo.Service.ConsultaService;
import com.example.demo.pnuevo.Service.MedicoService;

@Service
public class MedicoServiceImpl implements MedicoService{
@Autowired
private  MedicoDao medicoeDao;

@Override
public Medico create(Medico me) {
	// TODO Auto-generated method stub
	return medicoeDao.create(me);
}

@Override
public Medico update(Medico me) {
	// TODO Auto-generated method stub
	return medicoeDao.update(me);
}

@Override
public void delete(long id) {
	// TODO Auto-generated method stub
	medicoeDao.delete(id);
}

@Override
public Optional<Medico> read(Long id) {
	// TODO Auto-generated method stub
	return medicoeDao.read(id);
}

@Override
public List<Medico> readAll() {
	// TODO Auto-generated method stub
	return medicoeDao.readAll();
}


}
