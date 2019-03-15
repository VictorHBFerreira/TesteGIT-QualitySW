package br.com.fiap.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;



import org.junit.jupiter.api.Test;


class TesteProduto {
	
	Produto prod = new Produto(35, 1.30);
	
	
	@Test
	public void testeSetAltura(){	
		prod.setAltura(0.90);
		assertEquals(0.90, prod.getAltura());
	}
	@Test
	public void testeSetPeso(){	
		prod.setPeso(10);
		assertEquals(10, prod.getPeso());
	}
	
	
	//=============================================================//
	
	
	
	@Test
	public void testeGetAltura() {

		assertEquals(1.30, prod.getAltura());
	}
	@Test
	public void testeGetPeso() {
		
		assertEquals(35, prod.getPeso());
	}
	

}
