package models;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class DecryptTest {

    @Test
    public void runEncrypt_ifInputIsString() {
        Encrypt testEncrypt = new Encrypt("abc",3);
        assertEquals("abc", testEncrypt.getmInputString());
    }

    @Test
    public void runDecrypt_ifKeyIsInt() {
        Encrypt testEncrypt = new Encrypt("abc",3);
        assertEquals(3, testEncrypt.getmShift());
    }

    @Test
    public void runDecrypt_ifDecryptsVariousInputs() {
        Decrypt testDecrypt = new Decrypt("!ODCB EURZQ IRA MXPSV RYHU D ODCB GRJ2", 3);
        assertEquals("!fA@? Bliqh Fi> dogjm ipEl A fA@? DiG2", Decrypt.decrypt(testDecrypt));
    }

}


