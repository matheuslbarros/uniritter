package br.edu.uniritter.salario;

/**
 *
 * @author matheus-lisboa
 */
public class CalculoDescontoSalario {

    public double getSalarioComDesconto(Funcionario funcionario) {
        double desconto;
        
        if (funcionario.getSalario() > funcionario.getCargo().getSalarioMaximo()) {
            desconto = funcionario.getCargo().getDescontoMaximo();
        } else {
            desconto = funcionario.getCargo().getDescontoMinimo();
        }
        
        return funcionario.getSalario() * desconto;
    }

}
