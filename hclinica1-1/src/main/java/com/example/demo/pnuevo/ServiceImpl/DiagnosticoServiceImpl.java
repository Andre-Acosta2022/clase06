package com.example.demo.pnuevo.ServiceImpl;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.pnuevo.Dao.ConsultaDao;
import com.example.demo.pnuevo.Dao.DiagnosticoDao;
import com.example.demo.pnuevo.Entity.Consulta;
import com.example.demo.pnuevo.Entity.Diagnostico;
import com.example.demo.pnuevo.Service.ConsultaService;
import com.example.demo.pnuevo.Service.DiagnosticoService;

@Service
public class DiagnosticoServiceImpl implements DiagnosticoService{
@Autowired
private  DiagnosticoDao diagnosticoeDao;

@Override
public Diagnostico create(Diagnostico dia) {
	// TODO Auto-generated method stub
	return diagnosticoeDao.create(dia);
}

@Override
public Diagnostico update(Diagnostico dia) {
	// TODO Auto-generated method stub
	return diagnosticoeDao.update(dia);
}

@Override
public void delete(long id) {
	// TODO Auto-generated method stub
	diagnosticoeDao.delete(id);
}

@Override
public Optional<Diagnostico> read(Long id) {
	// TODO Auto-generated method stub
	return diagnosticoeDao.read(id);
}

@Override
public List<Diagnostico> readAll() {
	// TODO Auto-generated method stub
	return diagnosticoeDao.readAll();
}




}
