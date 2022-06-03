package com.infotek.aplication.ecommerceJava.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "productos")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Producto implements Serializable {
	
	private static final long serialVersionUID = 1L;

	//Atributos
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "webID")
	Long webID;
	
	@Column(name = "nombre")
	String nombre;
	
	@Column(name = "precio")
	BigDecimal precio;
	
	@Column(name = "descripcion")
	String descripcion;
	
	@Column(name = "stock")
	int stock = 1;
	
	@Column(name = "nuevo")
	Boolean nuevo;
	
	@Column(name = "recomendado")
	Boolean recomendado;
	
	@Column(name = "visible")
	Boolean visible;
	
	@Column(name = "img")
	String img;
	
	
	@Column(name = "categorias_id")
	private Categoria categoria;
	
	
	@Column(name = "marcas_id")
	private Marca marca;
}
