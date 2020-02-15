import ciphers.Cipher;
import ciphers.impl.CesarCipher;

public class Test {
    public static void main(String[] args) {
        Cipher cesarCipher = new CesarCipher();
        String example = cesarCipher.encode("");
        System.out.println(example);
        String decoded = cesarCipher.decode("rdvkrlkdlILSZKHINQYSMTH90213X40912X31923");
        System.out.println(decoded);
    }

}



