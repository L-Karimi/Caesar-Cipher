package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class EncryptTest {
    @Test
    public void runEncrypt_ifInputIsString() {
        Encrypt testEncrypt = new Encryptt("abc",3);
        assertEquals("abc", testEncrypt.getmInputString());
    }
    @Test
    public void runDecrypt_ifKeyIsInt(){
        Encrypt testEncrypt = new Encrypy("abc",3);
        assertEquals(3, testEncrypt.getmShift());
    }
}