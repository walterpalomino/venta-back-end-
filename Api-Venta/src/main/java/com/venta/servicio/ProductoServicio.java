package com.venta.servicio;

import java.util.List;

import com.venta.entidad.Categoria;
import com.venta.entidad.Producto;

public interface ProductoServicio {
	
	
	public List<Producto> listarProducto();	
	public Producto addProducto(Producto p);
	public Producto buscarProducto(long id);
	public List<Producto> buscarCategoria(Categoria c);
	public Producto actualizarProducto(Producto p);
	public Producto eliminarProducto(long id);
	
	public Producto aumentarStock(long id,int cantidad);
	public Producto disminuirStock(long id,int cantidad);
	

}
