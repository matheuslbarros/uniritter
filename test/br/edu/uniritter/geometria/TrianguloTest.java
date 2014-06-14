package br.edu.uniritter.geometria;

import br.edu.uniritter.geometria.Triangulo;
import br.edu.uniritter.geometria.TipoTriangulo;
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
    public void testaTipoTrianguloEquilatero() {
        triangulo = new Triangulo(3, 3, 3);
        assertEquals(TipoTriangulo.EQUILATERO, triangulo.retornaTipoTriangulo());
    }

    @Test
    public void testaTipoTrianguloIsoceles() {
        triangulo = new Triangulo(3, 5, 3);
        assertEquals(TipoTriangulo.ISOCELES, triangulo.retornaTipoTriangulo());
    }

    @Test
    public void testaTipoTrianguloEscaleno() {
        triangulo = new Triangulo(3, 4, 5);
        assertEquals(TipoTriangulo.ESCALENO, triangulo.retornaTipoTriangulo());
    }
}
