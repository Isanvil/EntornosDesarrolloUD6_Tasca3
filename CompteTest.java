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

    //Tests Genera IBAN
    @Test
    public void testgeneraIBAN_01(){
        Compte c = new Compte();
        assertEquals("ES7100302053091234567895", c.generaIBAN("0030","2053","09","1234567895"));
    }

    @Test
    public void testgeneraIBAN_02(){
        Compte c = new Compte();
        assertEquals("ES1000492352082414205416", c.generaIBAN("0049","2352","08","2414205416"));
    }

    @Test
    public void testgeneraIBAN_03(){
        Compte c = new Compte();
        assertEquals("ES1720852066623456789011", c.generaIBAN("2085","2066","62","3456789011"));
    }

    @Test
    public void testgeneraIBAN_04(){
        Compte c = new Compte();
        assertEquals(null, c.generaIBAN("2085","2066","62","3456AE9011"));
    }

    @Test
    public void testgeneraIBAN_05(){
        Compte c = new Compte();
        assertEquals(null, c.generaIBAN("208","2066","62","3456789011"));
    }

    @Test
    public void testgeneraIBAN_06(){
        Compte c = new Compte();
        assertEquals(null, c.generaIBAN("2080","20A6","62","3456789011"));
    }

    @Test
    public void testgeneraIBAN_07(){
        Compte c = new Compte();
        assertEquals(null, c.generaIBAN("2080","2086","6","3456789011"));
    }

    @Test
    public void testgeneraIBAN_08(){
        Compte c = new Compte();
        assertEquals(null, c.generaIBAN("2080","2086","63","345678911"));
    }
}
