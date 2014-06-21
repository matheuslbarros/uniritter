package br.edu.uniritter.crivo;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author matheus
 */
public class Crivo {

	public List<Integer> retornaNumerosPrimosDoIntervalo(Integer numeroInicial, Integer numeroFinal) {
		List<Integer> primos = new LinkedList();
		
		for(int numero = (numeroInicial + 1); numero <= numeroFinal; numero++) {
			primos.add(numero);
		}
		
		Double numeroMaximo = Math.sqrt(numeroFinal);
		
		for(int divisor = 0; divisor < primos.size() && primos.get(divisor) <= numeroMaximo; divisor++) {
			for(int multiplo = (divisor + 1); multiplo < primos.size(); multiplo++) {
				if (primos.get(multiplo) % primos.get(divisor) == 0) {
					primos.remove(multiplo);
				}
			}
		}
		
		return primos;
	}

}
