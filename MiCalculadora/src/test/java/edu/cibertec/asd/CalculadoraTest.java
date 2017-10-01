package edu.cibertec.asd;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CalculadoraTest {
	private static final Logger LOG = LoggerFactory.getLogger(CalculadoraTest.class);

	@Test
	public void Sumar4y1_resulta5() {
		Calculadora calc = new Calculadora();
		int resultado = calc.sumar(1, 4);
		assertEquals(5, resultado);
	}

	@Test
	public void Sumar7y10_resulta17() {
		Calculadora calc = new Calculadora();
		int resultado = calc.sumar(7, 10);
		assertEquals(17, resultado);
	}

}
