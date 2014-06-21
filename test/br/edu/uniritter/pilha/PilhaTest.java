package br.edu.uniritter.pilha;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author alu201011612
 */
public class PilhaTest {

    private Pilha<String> pilha;

    @Before
    public void setUp() {
        pilha = new Pilha();
    }

    @Test
    public void incluiDoisItensRemoveDoisItens() {
        pilha.clear();
        pilha.push("Item 1");
        pilha.push("Item 2");
        
        assertEquals(false, pilha.isEmpty());
        assertEquals("Item 1", pilha.pop());
        assertEquals("Item 2", pilha.pop());
        assertEquals(true, pilha.isEmpty());
    }

    @Test(expected = Exception.class)
    public void incluiUmItemRemoveDoisItensComExcecao() throws Exception {
        pilha.clear();
        pilha.push("Item 1");
        pilha.pop();
        pilha.pop();
    }

}
