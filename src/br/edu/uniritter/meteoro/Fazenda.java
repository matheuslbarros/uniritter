package br.edu.uniritter.meteoro;

/**
 *
 * @author alu201011612
 */
public class Fazenda {

    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Fazenda(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public boolean colideMeteoro(int x, int y) {
        return numeroEstaEntre(x, x1, x2) && numeroEstaEntre(y, y1, y2);
    }

    private boolean numeroEstaEntre(int numero, int numero1, int numero2) {
        return (numero >= numero1 && numero <= numero2) || (numero >= numero2 && numero <= numero1);
    }

}
