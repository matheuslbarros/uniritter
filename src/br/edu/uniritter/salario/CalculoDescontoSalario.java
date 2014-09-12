package br.edu.uniritter.salario;

/**
 *
 * @author matheus-lisboa
 */
public class CalculoDescontoSalario {

    public double getDesconto(Funcionario funcionario) {
        if (funcionario.getSalario() > funcionario.getCargo().getSalarioMaximo()) {
            return funcionario.getCargo().getDescontoMaximo();
        } else {
            return funcionario.getCargo().getDescontoMinimo();
        }
    }

}
