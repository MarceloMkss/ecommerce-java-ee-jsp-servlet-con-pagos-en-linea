package com.infotek.aplication.ecommerceJava.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infotek.aplication.ecommerceJava.entity.Categoria;
import com.infotek.aplication.ecommerceJava.entity.Marca;
import com.infotek.aplication.ecommerceJava.entity.Producto;
import com.infotek.aplication.ecommerceJava.service.ProductoService;

@RestController
@RequestMapping("/api")
public class ProductoController {

	@Autowired
	private ProductoService productoService;

	
	
	@GetMapping(value = "/productos")
	public List<Producto> getProductos() {
		return productoService.findAllProductos();
	}
	
	@GetMapping(value = "/marcas")
	public List<Marca> getMarcas() {
		return productoService.findAllMarcas();
	}
	
	@GetMapping(value = "/categorias")
	public List<Categoria> getCategorias() {
		return productoService.findAllCategorias();
	}

}
