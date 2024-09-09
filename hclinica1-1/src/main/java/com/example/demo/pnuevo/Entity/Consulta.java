package com.example.demo.pnuevo.Entity;



import java.sql.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
@Table(name="consulta")
public class Consulta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="id")
	private Long Id;
	@Column(name="fecha_consulta")
	private  Date Fecha_Consulta;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="paciente_id",referencedColumnName = "id")	
	private Paciente  paciente;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="medico_id",referencedColumnName = "id")

	private Medico medico;
}
