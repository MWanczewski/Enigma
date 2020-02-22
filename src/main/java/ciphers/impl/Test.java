package ciphers.impl;

public class Test {
    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    public static void main(String[] args) {
        String textToEncode = "algorytmyistrukturadanych";
        String key = "vigenere";
        VigenereCipher vigenereCipher = new VigenereCipher(key);
        String encode = vigenereCipher.encode(textToEncode);
        System.out.println(encode);
        String decode = vigenereCipher.decode(encode);
        System.out.println(decode);
        Root13Cipher root13Cipher = new Root13Cipher();
        String abc = "abcd";
        String encode1 = root13Cipher.encode(abc);
        String decode1 = root13Cipher.decode(encode1);
        System.out.println(encode1);
        System.out.println(decode1);
        System.out.println(-4 % 24);




    }
}
