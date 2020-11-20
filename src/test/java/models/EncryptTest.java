package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class EncryptTest {
    @Test
    public void runEncrypt_ifInputIsString() {
        Encrypt testEncrypt = new Encryptt("abc",3);
        assertEquals("abc", testEncrypt.getmInputString());
    }
}