package br.edu.uniritter.figura;

/**
 *
 * @author alu201011612
 */
public class Triangulo extends Figura {

    private final double ladoA;
    private final double ladoB;
    private final double ladoC;

    public Triangulo(double ladoA, double ladoB, double ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    @Override
    public double calculaArea() {
        double semiPerimetro = calculaSemiPerimetro();
        return Math.sqrt(semiPerimetro * (semiPerimetro - ladoA) * (semiPerimetro - ladoB) * (semiPerimetro - ladoC));
    }

    @Override
    public double calculaPerimetro() {
        return (ladoA + ladoB + ladoC);
    }

    public double calculaSemiPerimetro() {
        return calculaPerimetro() / 2;
    }

}
