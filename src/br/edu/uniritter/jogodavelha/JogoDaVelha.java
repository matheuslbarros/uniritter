package br.edu.uniritter.jogodavelha;

/**
 *
 * @author alu201011612
 */
class JogoDaVelha {

    private int[][] matriz = new int[3][3];

    public void marca(int jogador, int coluna, int linha) {
        matriz[coluna][linha] = jogador;
    }

    public int[][] getMatriz() {
        return matriz;
    }

}
