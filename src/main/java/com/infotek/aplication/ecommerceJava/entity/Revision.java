package com.infotek.aplication.ecommerceJava.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "revisiones")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Revision implements Serializable {

	private static final long serialVersionUID = 1L;

	// Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo")
	Long codigo;

	@Column(name = "nombre")
	String nombre;

	@Column(name = "correo")
	String correo;

	@Column(name = "comentario")
	String comentario;
	
	@Column(name = "estrellas")
	int estrellas;
	
	@Column(name = "fecha")
	Date fecha;
	
	@Column(name = "productos_id")
	private Producto producto;
}
