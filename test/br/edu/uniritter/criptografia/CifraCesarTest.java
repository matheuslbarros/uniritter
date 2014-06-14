package br.edu.uniritter.criptografia;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author alu201011612
 */
public class CifraCesarTest {

    @Test
    public void testaTheBookIsOnTheTable() {
        assertEquals("ymj gttp nx ts ymj yfgqj", CifraCesar.cifrar("the book is on the table", 5));
    }

}
