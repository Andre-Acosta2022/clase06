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

import com.example.demo.pnuevo.Entity.Medico;

import com.example.demo.pnuevo.Service.MedicoService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/medico")
public class MedicoController {
	@Autowired
	 private MedicoService medicoService;
	@GetMapping
	public ResponseEntity<List<Medico>> readAll() {
		try {
			List<Medico> lista = medicoService.readAll();
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
	public ResponseEntity<Medico> createMedico(@Valid @RequestBody Medico me ) {
		try {
			Medico med = medicoService.create(me);
			return new ResponseEntity<>(med, HttpStatus.CREATED);

		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
