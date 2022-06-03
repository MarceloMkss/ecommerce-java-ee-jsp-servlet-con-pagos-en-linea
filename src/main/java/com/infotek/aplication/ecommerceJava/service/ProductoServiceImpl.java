package com.infotek.aplication.ecommerceJava.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.infotek.aplication.ecommerceJava.entity.Categoria;
import com.infotek.aplication.ecommerceJava.entity.Marca;
import com.infotek.aplication.ecommerceJava.entity.Producto;
import com.infotek.aplication.ecommerceJava.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService {

	@Autowired
	private ProductoRepository productoRepository;
	
	
	@Override
	@Transactional(readOnly = true)
	public List<Producto> findAllProductos() {
		
		return productoRepository.findAll();
	}

	@Override
	@Transactional
	public Producto findById(Long id) {
		
		return productoRepository.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Producto save(Producto producto) {
		
		return productoRepository.save(producto);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Marca> findAllMarcas() {
		
		return productoRepository.findAllMarcas();
	}

	@Override
	@Transactional(readOnly = true)
	public List<Categoria> findAllCategorias() {
		
		return productoRepository.findAllCategorias();
	}

	

}
