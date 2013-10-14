package ContasNaoConfiaveis;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class testContasNaoConfiaveis {

	ContasNaoConfiaveis meuConversor;
	ContasNaoConfiaveis outroConversor;
		
	@Before
	public void setUp() throws Exception
	{
		meuConversor = new ContasNaoConfiaveis();
		outroConversor = new ContasNaoConfiaveis();
	}
	
	@Test
	public void calculaQuadradoComZero()
	{
		assertEquals(outroConversor.calculaQuadrado(0), meuConversor.calculaQuadrado(0),0.01);
	}

	@Test
	public void calculaQuadradoPequeno()
	{
		assertEquals(outroConversor.calculaQuadrado(2), meuConversor.calculaQuadrado(2), 0.01);
	}

	@Test
	public void calculaQuadradoGrande()
	{
		assertEquals(outroConversor.calculaQuadrado(10000), meuConversor.calculaQuadrado(10000) , 0.01);
	}

	@Test
	public void calculaQuadradoNegativoPequeno()
	{
		assertEquals(outroConversor.calculaQuadrado(-4), meuConversor.calculaQuadrado(-4) , 0.01);
	}

	@Test
	public void calculaQuadradoNegativoGrande()
	{
		assertEquals(outroConversor.calculaQuadrado(-9000),meuConversor.calculaQuadrado(-9000) , 0.01);
	}

	@Test
	public void calculaCuboComZero()
	{
		assertEquals(outroConversor.calculaCubo(0), meuConversor.calculaCubo(0), 0.01);
	}
	
	@Test
	public void calculaCuboPequeno()
	{
		assertEquals(outroConversor.calculaCubo(2), meuConversor.calculaCubo(2), 0.01);
	}
	
	@Test
	public void calculaCuboGrande()
	{
		assertEquals(outroConversor.calculaCubo(600), meuConversor.calculaCubo(600), 0.01);
	}
	
	@Test
	public void calculaCuboNegativoPequeno()
	{
		assertEquals(outroConversor.calculaCubo(-4), meuConversor.calculaCubo(-4), 0.01);
	}
	
	@Test
	public void calculaCuboNegativoGrande()
	{
		assertEquals(outroConversor.calculaCubo(-700), meuConversor.calculaCubo(-700), 0.01);
	}
}
	

