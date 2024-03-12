import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class CompteTest {
    //Tests compruebaIBAN
    @Test
    public void testCompruebaIBAN_01(){
        Compte c = new Compte();
        assertEquals(true, c.compruebaIBAN("ES6621000418401234567891"));
    }

    @Test
    public void testCompruebaIBAN_02(){
        Compte c = new Compte();
        assertEquals(true, c.compruebaIBAN("ES6000491500051234567892"));
    }

    @Test
    public void testCompruebaIBAN_03(){
        Compte c = new Compte();
        assertEquals(true, c.compruebaIBAN("ES9420805801101234567891"));
    }

    @Test
    public void testCompruebaIBAN_04(){
        Compte c = new Compte();
        assertNotEquals(false, c.compruebaIBAN("ES7600246912501234567891"));
    }

    @Test
    public void testCompruebaIBAN_05(){
        Compte c = new Compte();
        assertNotEquals(false, c.compruebaIBAN("ES4721000418401234567891"));
    }

    @Test
    public void testCompruebaIBAN_06(){
        Compte c = new Compte();
        assertNotEquals(false, c.compruebaIBAN("ES8200491500051234567892"));
    }
}
