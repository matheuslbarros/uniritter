package br.edu.uniritter.primo;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author alu201011612
 */
class Primo {

    public List<Integer> retornaNumerosPrimosDoIntervalo(int numeroInicial, int numeroFinal) {
        List<Integer> primos = new LinkedList();
        
        for(int i = ++numeroInicial; i < numeroFinal; i++) {
            if (isPrimo(i)) {
                primos.add(i);
            }
        }
        
        return primos;
    }

    private boolean isPrimo(int numero) {
        for(int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

}
