package ciphers;

import ciphers.impl.Root13Cipher;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Root13CipherTest  {
    private final String NO_ALPHABETIC_SIGNS = "!#$><.,<>+_!;; :'@#%^^";
    private final String ALPHABETIC_SIGNS = "abcd";
    private final String EXPECTED_ENCODED_ALPHABETIC_SIGNS = "nopq";
    Root13Cipher root13Cipher = new Root13Cipher();

    @Test
    protected void testIfNoAlphabeticTextNotChange() {
        String decode = root13Cipher.decode(NO_ALPHABETIC_SIGNS);
        Assertions.assertEquals(NO_ALPHABETIC_SIGNS, decode);

    }

    @Test
    protected void testEncodingOfAlphabeticSigns() {
        String encode = root13Cipher.encode(ALPHABETIC_SIGNS);
        Assertions.assertEquals(EXPECTED_ENCODED_ALPHABETIC_SIGNS, encode);
    }
}
