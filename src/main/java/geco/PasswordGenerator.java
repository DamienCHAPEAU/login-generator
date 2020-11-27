package geco;

import java.util.Random;

/**
 * Classe permettant la génération des mot de passe
 */

public class PasswordGenerator {
    public String password;

    public PasswordGenerator(String password){
        this.password = password;
    }
    /**
     * Construit un mot de passe aléatoire
     * @return Le mot de passe généré aléatoirement
     */
    public String getRandomPassword() {
        Random r = new Random();
        //char[] alphabetC = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i<8 ; i++){
            password = password + alphabet.charAt(r.nextInt(alphabet.length()));
        }
        return password;
    }

}
