package com.example.demo.pnuevo.Entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="paciente")
public class Paciente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="id")
	private Long Id;
	@Column(name="nombres")
	private  String nombres;
	@Column(name="apellidos")
	private String apellidos ;
	@Column(name="fecha_nac")
	private Date fecha_nac ;
	@Column(name="direccion")
	private String direccion ;
	@Column(name="telefono")
	private Number telefono ;
	
	@OneToOne(mappedBy = "paciente")
	private Consulta  consulta;
}
