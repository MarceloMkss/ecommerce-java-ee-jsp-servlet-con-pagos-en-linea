package com.infotek.aplication.ecommerceJava.service;

import java.util.List;

import com.infotek.aplication.ecommerceJava.entity.Categoria;
import com.infotek.aplication.ecommerceJava.entity.Marca;
import com.infotek.aplication.ecommerceJava.entity.Producto;

public interface ProductoService {

	public List<Producto> findAllProductos();

	public Producto findById(Long id);

	public Producto save(Producto producto);

	public List<Marca> findAllMarcas();
	
	public List<Categoria> findAllCategorias();

}
