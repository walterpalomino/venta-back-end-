package com.venta.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
@Entity
@Table(name="categoria")
public class Categoria {

	@Id
	@Column(name="c_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="c_nombre")
	private String nombre;
	
}
