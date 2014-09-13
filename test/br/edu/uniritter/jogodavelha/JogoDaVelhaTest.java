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
        
        jogoDaVelha.marca(0, 0);
        
        Assert.assertArrayEquals(expected, jogoDaVelha.getMatriz());
    }

    @Test(expected = Exception.class)
    public void testaJamarcado() throws Exception {
        jogoDaVelha.marca(0, 0);
        jogoDaVelha.marca(0, 0);
    }

      @Test
    public void testaMarcaDoisJogadores() throws Exception {
        int[][] expected = {
            { JOGADOR_UM, 0, 0 },
            { JOGADOR_DOIS, 0, 0 },
            { 0, 0, 0 }
        };
        
        jogoDaVelha.marca(0, 0);
        jogoDaVelha.marca(1, 0);
        Assert.assertArrayEquals(expected, jogoDaVelha.getMatriz());
    }    
    
}
