package br.edu.uniritter.jogodavelha;

/**
 *
 * @author alu201011612
 */
class JogoDaVelha {

    private int[][] matriz = new int[3][3];
    private int jogadas = 0;

    public void marca(int coluna, int linha) throws Exception {
        if (matriz[linha][coluna] == 0) {
            jogadas++;
            matriz[linha][coluna] = getJogador();
        } else {
            throw new Exception("Já marcado!");
        }        
    }

    public int[][] getMatriz() {
        return matriz;
    }

    private int getJogador() {
        return jogadas % 2 == 0 ? 2 : 1;
    }

    public void zerar() {
        matriz = new int[3][3];
        jogadas = 0;
    }

}
