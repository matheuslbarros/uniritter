package br.edu.uniritter.salario.cargo;

/**
 *
 * @author matheus-lisboa
 */
public class Testador implements Cargo {

    @Override
    public double getSalarioMaximo() {
        return 2500;
    }

    @Override
    public double getDescontoMaximo() {
        return 0.75;
    }

    @Override
    public double getDescontoMinimo() {
        return 0.85;
    }

}
