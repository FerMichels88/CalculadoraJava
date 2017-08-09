package br.com.empresa.test;

import static org.junit.Assert.*;

import br.com.empresa.lib.Calculadora;

import org.junit.Test;

public class TesteCalculadora {

	@Test
	public void somaNumerosInteiros(){
		Calculadora calculadora = new Calculadora();
		assertEquals(calculadora.Soma(2,3), 5, 0);
	}
	
	@Test
	public void somaNumerosInteirosComVirgula(){
		Calculadora calculadora = new Calculadora();
		assertEquals(calculadora.Soma(2.33,6.59), 8.92, 0);
	}
}
