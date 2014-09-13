package br.edu.uniritter.jogodavelha;

/**
 *
 * @author alu201011612
 */
class JogoDaVelha {

    private int[][] matriz = new int[3][3];
    private int jogadas = 0;

    public void marca( int coluna, int linha) throws Exception {
        if (matriz[coluna][linha] == 0) {
            jogadas++;
            matriz[coluna][linha] = getJogador();
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

}
