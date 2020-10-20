package com.venta.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.venta.entidad.Categoria;
import com.venta.entidad.Producto;

@Repository
public interface ProductoRepositorio extends JpaRepository<Producto, Long> {
	
	public List<Producto> findByCategoria(Categoria categoria);

}
