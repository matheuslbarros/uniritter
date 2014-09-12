package br.edu.uniritter.salario.cargo;

/**
 *
 * @author matheus-lisboa
 */
public class Dba implements Cargo {

    @Override
    public double getSalarioMaximo() {
        return 2500;
    }

    @Override
    public double getDescontoMaximo() {
        return 25;
    }

    @Override
    public double getDescontoMinimo() {
        return 15;
    }

}
