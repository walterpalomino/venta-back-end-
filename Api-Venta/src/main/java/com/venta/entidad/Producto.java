package com.venta.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data @AllArgsConstructor @NoArgsConstructor
@Entity
@Table(name = "producto")
public class Producto {
	
	@Id
	@Column(name="p_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="p_nombre")
	private String nombre;
	
	@Column(name = "p_descripcion")
	private String descripcion;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "p_categoria")
	private Categoria categoria;
	
	@Column(name = "p_stock_minimo")
	private int stockMinimo;
	
	@Column(name = "p_stock_maximo")
	private int stockMaximo;
	
	@Column(name = "p_stock_actual")
	private int stockActual;
	
	
	
	
	

}
