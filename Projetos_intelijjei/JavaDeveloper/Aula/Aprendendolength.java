package Aula;

import java.lang.String;
import java.util.Scanner;
/*
Crie uma função que recebe uma String e retorna o tamanho da String.
E depois crie um método main para testar o seu método, usando um texto
inserido pelo usuário.
 */

public class Aprendendolength {

    public static void main(String[] args) {

        Scanner ler = new Scanner (System.in);

        System.out.println("Informe uma palavra:");
        String palavra = ler.nextLine();

        int tamanho =  imprimirTamanho(palavra);
        System.out.println(" O tamanho da palavra é: " + tamanho);
    }


    public static int imprimirTamanho(String palavra) {

        return palavra.length();

    }

}
