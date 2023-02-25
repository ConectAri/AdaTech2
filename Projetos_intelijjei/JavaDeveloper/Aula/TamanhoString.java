package Aula;

import java.util.Scanner;
import java.lang.String;

public class TamanhoString {

    /* Crie uma função que recebe uma String e retorna o tamanho da String. */
    public static int tamanhoString(String p) {
        return p.length();
    }

    /* E depois crie um método main para testar o seu método,
    usando um texto inserido pelo usuario.
    OBS: O resultado só deu certo por causa do input*/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite uma palavra:");
        String p = input.nextLine();
        System.out.println(" O tamanho da palavra digitda é:" + tamanhoString(p));

    }

}
