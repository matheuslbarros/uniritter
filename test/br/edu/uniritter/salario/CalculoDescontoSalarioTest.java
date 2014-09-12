package br.edu.uniritter.salario;

import br.edu.uniritter.salario.cargo.Dba;
import br.edu.uniritter.salario.cargo.Testador;
import br.edu.uniritter.salario.cargo.Programador;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author matheus-lisboa
 */
public class CalculoDescontoSalarioTest {

    private CalculoDescontoSalario calculoDescontoSalario;

    @Before
    public void iniciaCalculoDescontoSalario() {
        calculoDescontoSalario = new CalculoDescontoSalario();
    }

    @Test
    public void descontoProgramadorVintePorCento() {
        Funcionario funcionario = new Funcionario("Nome do programador 1", new Programador(), 3001);
        assertEquals(20, calculoDescontoSalario.getDesconto(funcionario), 0.001);
    }

    @Test
    public void descontoProgramadorDezPorCento() {
        Funcionario funcionario = new Funcionario("Nome do programador 2", new Programador(), 3000);
        assertEquals(10, calculoDescontoSalario.getDesconto(funcionario), 0.001);
    }

    @Test
    public void descontoTestadorVintePorCento() {
        Funcionario funcionario = new Funcionario("Nome do testador 1", new Testador(), 2501);
        assertEquals(25, calculoDescontoSalario.getDesconto(funcionario), 0.001);
    }

    @Test
    public void descontoTestadorDezPorCento() {
        Funcionario funcionario = new Funcionario("Nome do testador 2", new Testador(), 2500);
        assertEquals(15, calculoDescontoSalario.getDesconto(funcionario), 0.001);
    }

    @Test
    public void descontoDbaVintePorCento() {
        Funcionario funcionario = new Funcionario("Nome do dba 1", new Dba(), 2501);
        assertEquals(25, calculoDescontoSalario.getDesconto(funcionario), 0.001);
    }

    @Test
    public void descontoDbaDezPorCento() {
        Funcionario funcionario = new Funcionario("Nome do dba 2", new Dba(), 2500);
        assertEquals(15, calculoDescontoSalario.getDesconto(funcionario), 0.001);
    }

}
