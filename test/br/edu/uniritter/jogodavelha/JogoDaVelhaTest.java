package br.edu.uniritter.jogodavelha;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author alu201011612
 */
public class JogoDaVelhaTest {

    public static int JOGADOR_UM = 1;
    public static int JOGADOR_DOIS = 2;

    JogoDaVelha jogoDaVelha = new JogoDaVelha();
    
    @Test
    public void testaMarcaColuna1Linha1() throws Exception {
        int[][] expected = {
            { JOGADOR_UM, 0, 0 },
            { 0, 0, 0 },
            { 0, 0, 0 }
        };
        
        
        jogoDaVelha.marca(JOGADOR_UM, 0, 0);
        
        Assert.assertArrayEquals(expected, jogoDaVelha.getMatriz());
    }

    @Test(expected = Exception.class)
    public void testaJamarcado() throws Exception {
        jogoDaVelha.marca(JOGADOR_UM, 0, 0);
        jogoDaVelha.marca(JOGADOR_DOIS, 0, 0);
    }

}
