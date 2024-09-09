package com.example.demo.pnuevo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pnuevo.Entity.Consulta;

import com.example.demo.pnuevo.Service.ConsultaService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/consulta")
public class ConsultaController {
	@Autowired
	private ConsultaService consultaService;

	@GetMapping
	public ResponseEntity<List<Consulta>> readAll() {
		try {
			List<Consulta> lista = consultaService.readAll();
			if (lista.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(lista, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PostMapping
	public ResponseEntity<Consulta> createConsulta(@Valid @RequestBody Consulta con) {
		try {
			Consulta consu = consultaService.create(con);
			return new ResponseEntity<>(consu, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
