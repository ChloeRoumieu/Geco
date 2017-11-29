package geco;

import java.util.Random;

public class PasswordGeneration {

    /**
     * mot de passe aléatoire généré
     * @return output
     */
    String getRandomPassword () {
        char[] chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890".toCharArray();
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 8; i++) {
            char c = chars[random.nextInt(chars.length)];
            sb.append(c);
        }
        String output = sb.toString();
        return output;

    }
}
