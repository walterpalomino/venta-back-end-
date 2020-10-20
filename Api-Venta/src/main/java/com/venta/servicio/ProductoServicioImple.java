package com.venta.servicio;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.venta.entidad.Categoria;
import com.venta.entidad.Producto;
import com.venta.repositorio.ProductoRepositorio;

@Service
public class ProductoServicioImple implements ProductoServicio{
	
	@Autowired
	ProductoRepositorio repo;

	@Override
	public List<Producto> listarProducto() {
		
		return repo.findAll();
		
	}

	@Override
	public Producto addProducto(Producto p) {
		
		return repo.save(p);
	}

	@Override
	public Producto buscarProducto(long id) { 
		
		return repo.findById(id).orElse(null);  		
	}

	@Override
	public List<Producto> buscarCategoria(Categoria c) {
		
		return repo.findByCategoria(c); 
	}

	@Override
	public Producto actualizarProducto(Producto p) {
					
		return repo.save(p);
	}

	@Override
	public Producto eliminarProducto(long id) {
		
		return null;
	}

	@Override
	public Producto aumentarStock(long id, int cantidad) {
		
		if(cantidad > 0)
		{
		Producto producto=this.buscarProducto(id);
		
		if(producto !=null)
		{
			producto.setStockActual(producto.getStockActual()+cantidad);
			return repo.save(producto);
		}
		}
		return null;
		
	}

	@Override
	public Producto disminuirStock(long id, int cantidad) {
		
		Producto producto=this.buscarProducto(id); 
		
		if(producto.getStockActual() >= cantidad)
		{
		
		if(producto !=null)
		{
			producto.setStockActual(producto.getStockActual()-cantidad);
			return repo.save(producto);
		}
		}
		return null;
	}

	

}
