package br.edu.uniritter.primo;

import java.util.LinkedList;
import java.util.List;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author alu201011612
 */
public class PrimoTest {

    @Test
    public void recebeDoisInteirosRetornandoOsNumerosPrimosDesteIntervalo() {
        List<Integer> primosExpected = new LinkedList();
        primosExpected.add(2);
        primosExpected.add(3);
        primosExpected.add(5);
        primosExpected.add(7);
        
        Primo primo = new Primo();
        List<Integer> primos = primo.retornaNumerosPrimosDoIntervalo(1, 10);
        
        assertEquals(primosExpected, primos);
    }
}
