package Aula;

import java.util.Scanner;

import java.lang.String;

public class ExercícioEntradaSaidaDeDados {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println(" Primeiro exercício: ");

        System.out.println("Qual seu nome ?");
        String nome = ler.nextLine();

        System.out.println("Qual a sua Cidade?");
        String cidade = ler.nextLine();

        System.out.println("Qual o ano de seu nascimento?");
        int ano1 = ler.nextInt();

        int ano2 = 2023;
        int idadefinal = ano2-ano1 ;

        System.out.println(" Ola," + nome + " A sua idade é " + idadefinal + " anos.");
        System.out.println("A sua cidade é " + cidade + ".");

    }
}
