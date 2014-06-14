package br.edu.uniritter.conta;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author alu201011612
 */
public class ContaCorrenteTest {

    private ContaCorrente contaCorrente;

    @Before
    public void setUp() {
        contaCorrente = new ContaCorrente(1, 500);
    }

    @Test
    public void testaNumero() {
        assertEquals(1, contaCorrente.retornaNumeroConta());
    }

    @Test
    public void testaSaldoInicial() {
        assertEquals(500, contaCorrente.verificaSaldo(), 0.001);
    }

    @Test
    public void testaDeposito() throws Exception {
        contaCorrente.deposita(50);
        assertEquals(550, contaCorrente.verificaSaldo(), 0.001);
    }

    @Test
    public void testaSaque() throws Exception {
        contaCorrente.saca(50);
        assertEquals(450, contaCorrente.verificaSaldo(), 0.001);
    }

    @Test(expected = Exception.class)
    public void testaSaqueException() throws Exception {
        contaCorrente.saca(550);
    }

    @Test
    public void testaDepositoSaque() throws Exception {
        contaCorrente.deposita(1000);
        contaCorrente.saca(500);
        assertEquals(1000, contaCorrente.verificaSaldo(), 0.001);
    }

    @Test
    public void testaTransferencia() throws Exception {
        ContaCorrente contaDestino = new ContaCorrente(3, 0);
        contaCorrente.transfere(100, contaDestino);
        
        assertEquals(400, contaCorrente.verificaSaldo(), 0.001);
        assertEquals(100, contaDestino.verificaSaldo(), 0.001);
    }

    @Test(expected = Exception.class)
    public void testaTransferenciaException() throws Exception {
        ContaCorrente contaDestino = new ContaCorrente(3, 0);
        contaCorrente.transfere(1000, contaDestino);
        
        assertEquals(400, contaCorrente.verificaSaldo(), 0.001);
        assertEquals(100, contaDestino.verificaSaldo(), 0.001);
    }

}
