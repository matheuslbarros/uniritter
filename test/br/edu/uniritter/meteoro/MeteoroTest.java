package br.edu.uniritter.meteoro;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author alu201011612
 */
public class MeteoroTest {

    @Test
    public void testeFazendaUmComDoisMeteoros() {
        Fazenda fazenda = new Fazenda(2, 4, 5, 1);
        
        assertFalse(fazenda.colideMeteoro(1, 2));
        assertTrue(fazenda.colideMeteoro(3, 3));
    }

    @Test
    public void testeFazendaDoisComTresMeteoros() {
        Fazenda fazenda = new Fazenda(2, 4, 3, 2);
        
        assertFalse(fazenda.colideMeteoro(1, 1));
        assertTrue(fazenda.colideMeteoro(2, 2));
        assertTrue(fazenda.colideMeteoro(3, 3));
    }
}
