package com.infotek.aplication.ecommerceJava.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.infotek.aplication.ecommerceJava.entity.Categoria;
import com.infotek.aplication.ecommerceJava.entity.Marca;
import com.infotek.aplication.ecommerceJava.entity.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
	@Query("from Marca")
	public List<Marca> findAllMarcas();
	
	@Query("from Categoria")
	public List<Categoria> findAllCategorias();
}
