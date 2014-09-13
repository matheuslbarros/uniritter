package br.edu.uniritter.jogodavelha;

/**
 *
 * @author alu201011612
 */
class JogoDaVelha {

    private int[][] matriz = new int[3][3];

    public void marca(int jogador, int coluna, int linha) throws Exception {
        if (matriz[coluna][linha] == 0) {
            matriz[coluna][linha] = jogador;
        }else{
            throw new Exception("Já marcado!");
        }
        
    }

    public int[][] getMatriz() {
        return matriz;
    }

}
