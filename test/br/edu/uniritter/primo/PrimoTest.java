package br.edu.uniritter.primo;

import java.util.LinkedList;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author alu201011612
 */
public class PrimoTest {

    private Primo primo;

    @Before
    public void setUp() {
        primo = new Primo();
    }

    @Test
    public void recebeDoisInteirosRetornandoOsNumerosPrimosDesteIntervalo() {
        List<Integer> primosExpected = new LinkedList();
        primosExpected.add(2);
        primosExpected.add(3);
        primosExpected.add(5);
        primosExpected.add(7);
        
        assertEquals(primosExpected, primo.retornaNumerosPrimosDoIntervalo(1, 10));
    }

    @Test
    public void verificaSeCincoEhPrimo() {
        assertTrue(primo.retornaSeNumeroEhPrimo(5));
    }

    @Test
    public void verificaSeSeisNaoEhPrimo() {
        assertFalse(primo.retornaSeNumeroEhPrimo(6));
    }
}
