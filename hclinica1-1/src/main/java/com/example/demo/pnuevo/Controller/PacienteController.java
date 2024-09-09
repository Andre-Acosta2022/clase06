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

import com.example.demo.pnuevo.Entity.Paciente;
import com.example.demo.pnuevo.Service.PacienteService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/paciente")
public class PacienteController {
	@Autowired
	private PacienteService pacienteService;

	@GetMapping
	public ResponseEntity<List<Paciente>> readAll() {
		try {
			List<Paciente> lista = pacienteService.readAll();
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
	public ResponseEntity<Paciente> createpaciente(@Valid @RequestBody Paciente pac) {
		try {
			Paciente paci = pacienteService.create(pac);
			return new ResponseEntity<>(paci, HttpStatus.CREATED);

		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
