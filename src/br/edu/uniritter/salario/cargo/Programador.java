package br.edu.uniritter.salario.cargo;

/**
 *
 * @author matheus-lisboa
 */
public class Programador implements Cargo {

    @Override
    public double getSalarioMaximo() {
        return 3000;
    }

    @Override
    public double getDescontoMaximo() {
        return 20;
    }

    @Override
    public double getDescontoMinimo() {
        return 10;
    }

}
