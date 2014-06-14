package br.edu.uniritter.figura;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author alu201011612
 */
public class TrianguloTest {
    
    private Triangulo triangulo;

    @Before
    public void setUp() {
        triangulo = new Triangulo(3, 4, 5);
    }

    @Test
    public void testaCalculaArea() {
        assertEquals(6, triangulo.calculaArea(), 0.001);
    }

    @Test
    public void testaCalculaPerimetro() {
        assertEquals(12, triangulo.calculaPerimetro(), 0.001);
    }

    @Test
    public void testaCalculaSemiPerimetro() {
        assertEquals(6, triangulo.calculaSemiPerimetro(), 0.001);
    }

}
