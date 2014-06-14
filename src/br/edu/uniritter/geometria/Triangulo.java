package br.edu.uniritter.geometria;

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
        return Math.sqrt(calculaDelta());
    }

    @Override
    public double calculaPerimetro() {
        return (ladoA + ladoB + ladoC);
    }

    private double calculaSemiPerimetro() {
        return calculaPerimetro() / 2;
    }

    private double calculaDelta() {
        double semiPerimetro = calculaSemiPerimetro();
        return semiPerimetro * (semiPerimetro - ladoA) * (semiPerimetro - ladoB) * (semiPerimetro - ladoC);
    }

    public TipoTriangulo retornaTipoTriangulo() {
        boolean ab = (ladoA == ladoB);
        boolean ac = (ladoA == ladoC);
        boolean bc = (ladoB == ladoC);
        
        if (ab && ac && bc) {
            return TipoTriangulo.EQUILATERO;
        } else
        if (ab || ac || bc) {
            return TipoTriangulo.ISOCELES;
        } else {
            return TipoTriangulo.ESCALENO;
        }
    }

}
