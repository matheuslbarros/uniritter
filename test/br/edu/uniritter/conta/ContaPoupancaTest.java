package br.edu.uniritter.conta;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author alu201011612
 */
public class ContaPoupancaTest {

    private ContaPoupanca contaPoupanca;

    @Before
    public void setUp() {
        contaPoupanca = new ContaPoupanca(1);
    }

    @Test
    public void testaNumero() {
        assertEquals(1, contaPoupanca.retornaNumeroConta());
    }

    @Test
    public void testaSaldoInicial() {
        assertEquals(100, contaPoupanca.verificaSaldo(), 0.001);
    }

    @Test
    public void testaDeposito() throws Exception {
        contaPoupanca.deposita(50);
        assertEquals(150, contaPoupanca.verificaSaldo(), 0.001);
    }

    @Test
    public void testaSaque() throws Exception {
        contaPoupanca.saca(50);
        assertEquals(50, contaPoupanca.verificaSaldo(), 0.001);
    }

    @Test(expected = Exception.class)
    public void testaSaqueContaException() throws Exception {
        contaPoupanca.saca(550);
    }

    @Test
    public void testaDepositoSaque() throws Exception {
        contaPoupanca.deposita(1000);
        contaPoupanca.saca(500);
        assertEquals(600, contaPoupanca.verificaSaldo(), 0.001);
    }

    @Test
    public void testaTransferencia() throws Exception {
        ContaPoupanca contaDestino = new ContaPoupanca(2);
        contaPoupanca.transfere(10, contaDestino);
        
        assertEquals(90, contaPoupanca.verificaSaldo(), 0.001);
        assertEquals(110, contaDestino.verificaSaldo(), 0.001);
    }

    @Test(expected = Exception.class)
    public void testaTransferenciaException() throws Exception {
        ContaPoupanca contaDestino = new ContaPoupanca(2);
        contaPoupanca.transfere(1000, contaDestino);
        
        assertEquals(90, contaPoupanca.verificaSaldo(), 0.001);
        assertEquals(110, contaDestino.verificaSaldo(), 0.001);
    }

}
