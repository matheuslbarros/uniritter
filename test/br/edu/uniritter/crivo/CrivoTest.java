package br.edu.uniritter.crivo;

import static org.junit.Assert.assertEquals;
import java.util.LinkedList;
import java.util.List;
import org.junit.Test;

/**
 *
 * @author matheus
 */
public class CrivoTest {

	@Test
	public void verificaNumerosPrimosDoUmAoTrinta() {
		List<Integer> primosExpected = new LinkedList();
		primosExpected.add(2);
		primosExpected.add(3);
		primosExpected.add(5);
		primosExpected.add(7);
		primosExpected.add(11);
		primosExpected.add(13);
		primosExpected.add(17);
		primosExpected.add(19);
		primosExpected.add(23);
		primosExpected.add(29);
		
		Crivo crivo = new Crivo();
		assertEquals(primosExpected, crivo.retornaNumerosPrimosDoIntervalo(1, 30));
	}

}
