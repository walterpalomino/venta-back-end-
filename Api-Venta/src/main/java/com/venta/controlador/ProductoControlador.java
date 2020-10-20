package com.venta.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.venta.entidad.Producto;
import com.venta.servicio.ProductoServicio;

@RestController
@RequestMapping(name = "API/")
public class ProductoControlador {
	
	
	
	@Autowired
	ProductoServicio servicio;
	
	public ResponseEntity<List<Producto>> listaProducto()
	{
		List<Producto> productos= servicio.listarProducto();
		   
		
		return (productos.isEmpty())? ResponseEntity.noContent().build():ResponseEntity.ok(productos);
		   
	}
	
	
	
	

}
