package com.example.demo.pnuevo.Entity;





import com.example.demo.pnuevo.DaoImpl.EspecialidadDaoImpl;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name="medico")
public class Medico {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="id")
	private Long Id;
	@Column(name="nombres")
	private  String nombres;
	@Column(name="apellidos")
	private  String apellidos;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="especialida_id",referencedColumnName = "id")

	private Especialida especialidad;
	
	
}


