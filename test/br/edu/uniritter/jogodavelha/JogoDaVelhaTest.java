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

    @Test
    public void testaMarcaColuna1Linha1() {
        int[][] expected = {
            { JOGADOR_UM, 0, 0 },
            { 0, 0, 0 },
            { 0, 0, 0 }
        };
        
        JogoDaVelha jogoDaVelha = new JogoDaVelha();
        jogoDaVelha.marca(JOGADOR_UM, 0, 0);
        
        Assert.assertArrayEquals(expected, jogoDaVelha.getMatriz());
    }

}
