package br.edu.uniritter.jogodavelha;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author alu201011612
 */
public class JogoDaVelhaTest {

    JogoDaVelha jogoDaVelha = new JogoDaVelha();

    @Test
    public void testaMarcaColuna1Linha1() throws Exception {
        int[][] expected = {
            { 1, 0, 0 },
            { 0, 0, 0 },
            { 0, 0, 0 }
        };
        
        jogoDaVelha.zerar();
        jogoDaVelha.marca(0, 0);
        
        Assert.assertArrayEquals(expected, jogoDaVelha.getMatriz());
    }

    @Test(expected = Exception.class)
    public void testaJamarcado() throws Exception {
        jogoDaVelha.zerar();
        jogoDaVelha.marca(0, 0);
        jogoDaVelha.marca(0, 0);
    }

    @Test
    public void testaMarcaDoisJogadores() throws Exception {
        int[][] expected = {
            { 1, 2, 0 },
            { 0, 0, 0 },
            { 0, 0, 0 }
        };
        
        jogoDaVelha.zerar();
        jogoDaVelha.marca(0, 0);
        jogoDaVelha.marca(1, 0);
        
        Assert.assertArrayEquals(expected, jogoDaVelha.getMatriz());
    }

    @Test
    public void testaPrimeiraLinha() throws Exception {
        int[][] expected = {
            { 1, 1, 1 },
            { 2, 2, 0 },
            { 0, 0, 0 }
        };
        
        jogoDaVelha.zerar();
        jogoDaVelha.marca(0, 0);
        jogoDaVelha.marca(0, 1);
        jogoDaVelha.marca(1, 0);
        jogoDaVelha.marca(1, 1);
        jogoDaVelha.marca(2, 0);
        
        Assert.assertArrayEquals(expected, jogoDaVelha.getMatriz());
    }    
    
}
