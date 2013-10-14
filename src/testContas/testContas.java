package testContas;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Contas.Contas;

public class testContas{
	
	Contas meuConversor;
	
	@Before
	public void setUp() throws Exception
	{
		meuConversor = new Contas();
	}
	
	@Test
	public void calculaQuadradoComZero(double valor)
	{
		assertEquals(0,meuConversor.calculaQuadrado(0), 0.01);
	}

	@Test
	public void calculaQuadradoPequeno(double valor)
	{
		assertEquals(4,meuConversor.calculaQuadrado(2) , 0.01);
	}

	@Test
	public void calculaQuadradoGrande(double valor)
	{
		assertEquals(100000000,meuConversor.calculaQuadrado(10000) , 0.01);
	}

	@Test
	public void calculaQuadradoNegativoPequeno(double valor)
	{
		assertEquals(16, meuConversor.calculaQuadrado(-4) , 0.01);
	}

	@Test
	public void calculaQuadradoNegativoGrande(double valor)
	{
		assertEquals(81000000,meuConversor.calculaQuadrado(-9000) , 0.01);
	}

	@Test
	public void calculaCuboComZero(double valor)
	{
		assertEquals(0, meuConversor.calculaCubo(0), 0.01);
	}
	
	@Test
	public void calculaCuboPequeno(double valor)
	{
		assertEquals(8, meuConversor.calculaCubo(2), 0.01);
	}
	
	@Test
	public void calculaCuboGrande(double valor)
	{
		assertEquals(216000000, meuConversor.calculaCubo(600), 0.01);
	}
	
	@Test
	public void calculaCuboNegativoPequeno(double valor)
	{
		assertEquals(-64, meuConversor.calculaCubo(-4), 0.01);
	}
	
	@Test
	public void calculaCuboNegativoGrande(double valor)
	{
		assertEquals(-343000000, meuConversor.calculaCubo(-700), 0.01);
	}
}
