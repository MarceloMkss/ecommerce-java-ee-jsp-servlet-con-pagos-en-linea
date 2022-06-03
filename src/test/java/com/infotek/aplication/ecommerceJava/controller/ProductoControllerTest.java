package com.infotek.aplication.ecommerceJava.controller;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

public class ProductoControllerTest  {
	
	@InjectMocks
	ProductoController productoController;
	
	

	@Test
	void testGetMarcas() {
		try {
			productoController.getMarcas();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
