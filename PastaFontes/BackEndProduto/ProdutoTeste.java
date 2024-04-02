import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProdutoTeste {

	@Test
	void testGetterPeso() {

		Produto pr = new Produto(75, 180);
		double resultadoEsperado = 75;
		double resultadoReal = pr.getPeso();

		assertEquals(resultadoEsperado, resultadoReal);		
	}

	@Test
	void testGetterAltura() {

		Produto pr = new Produto(75, 180);
		double resultadoEsperado = 180;
		double resultadoReal = pr.getAltura();

		assertEquals(resultadoEsperado, resultadoReal);		
	}

	@Test
	void testSetterPeso() {

		Produto pr = new Produto();
		//set eh void

		pr.setPeso(75);

		double resultadoEsperado = 75;
		double resultadoReal = pr.getPeso();

		assertEquals(resultadoEsperado, resultadoReal);

	}	
	
	@Test
	void testSetterAltura() {

		Produto pr = new Produto();
		//set eh void

		pr.setAltura(180);

		double resultadoEsperado = 180;
		double resultadoReal = pr.getAltura();

		assertEquals(resultadoEsperado, resultadoReal);

	}	
	

}
