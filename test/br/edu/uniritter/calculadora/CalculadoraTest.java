package br.edu.uniritter.calculadora;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author alu201011612
 */
public class CalculadoraTest {

    private Calculadora calculadora;

    @Before
    public void setUp() {
        calculadora = new Calculadora();
    }

    @Test
    public void testUm() {
        assertEquals(8, calculadora.retornaResultadoDaExpressao("1 + 4 + 3"));
    }
    
    @Test
    public void testDois() {
        assertEquals(0, calculadora.retornaResultadoDaExpressao("4 / 2 + 1 - 3"));
    }
    
    @Test
    public void testTres() {
        assertEquals(11, calculadora.retornaResultadoDaExpressao("1 + 2 * 3 + 4"));
    }

    @Test
    public void testMultiplicacaoDivisao() {
        assertEquals(16, calculadora.retornaResultadoDaExpressao("2 + 4 * 2 + 2 + 4 / 2 + 2"));
    }
}
