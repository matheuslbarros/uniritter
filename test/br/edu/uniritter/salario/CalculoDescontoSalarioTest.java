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
        Funcionario funcionario = new Funcionario("Nome do programador 1", new Programador(), 3500);
        assertEquals(2800, calculoDescontoSalario.getSalarioComDesconto(funcionario), 0.001);
    }

    @Test
    public void descontoProgramadorDezPorCento() {
        Funcionario funcionario = new Funcionario("Nome do programador 2", new Programador(), 2500);
        assertEquals(2250, calculoDescontoSalario.getSalarioComDesconto(funcionario), 0.001);
    }

    @Test
    public void descontoTestadorVintePorCento() {
        Funcionario funcionario = new Funcionario("Nome do testador 1", new Testador(), 3000);
        assertEquals(2250, calculoDescontoSalario.getSalarioComDesconto(funcionario), 0.001);
    }

    @Test
    public void descontoTestadorDezPorCento() {
        Funcionario funcionario = new Funcionario("Nome do testador 2", new Testador(), 2500);
        assertEquals(2125, calculoDescontoSalario.getSalarioComDesconto(funcionario), 0.001);
    }

    @Test
    public void descontoDbaVintePorCento() {
        Funcionario funcionario = new Funcionario("Nome do dba 1", new Dba(), 3500);
        assertEquals(2625, calculoDescontoSalario.getSalarioComDesconto(funcionario), 0.001);
    }

    @Test
    public void descontoDbaDezPorCento() {
        Funcionario funcionario = new Funcionario("Nome do dba 2", new Dba(), 2000);
        assertEquals(1700, calculoDescontoSalario.getSalarioComDesconto(funcionario), 0.001);
    }

}
