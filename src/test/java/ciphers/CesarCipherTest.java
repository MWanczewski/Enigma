package ciphers;

import ciphers.impl.CesarCipher;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CesarCipherTest {
    protected final String textWithNoAlphabeticLetters = "112312[]][";
    protected final String textWithAlphabeticLetters = "abcdd";
    protected final String expectedTextForAlphabeticLetters = "defgg";
    protected final String mixedText = "123ac///";
    protected final String expectedTextForMixedText = "123df//";
    protected Cipher cesarCipher = new CesarCipher();

    @DisplayName( "Testing correction of encoding text with no alphabetic letters")
    @Test
    public void testIfOnlyAlphabeticLettersAreEncoded() {
        String encoded = cesarCipher.encode(textWithNoAlphabeticLetters);
        Assertions.assertEquals(textWithNoAlphabeticLetters, encoded);
    }

    @DisplayName("Testing correction of encoding text with no alphabetic letters")
    @Test
    public void testIfEncodingModifyTextWithAlphabeticChars() {
        String encoded = cesarCipher.encode(textWithAlphabeticLetters);
        Assertions.assertEquals(expectedTextForAlphabeticLetters, encoded);
    }




}
