package com.venta.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.venta.entidad.Producto;

public interface ProductoRepositorio extends JpaRepository<Producto, Long> {

}
