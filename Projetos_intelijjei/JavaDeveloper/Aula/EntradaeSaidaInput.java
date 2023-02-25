package Aula;/* Enunciado
Crie um programa que separa em metodos o input de dados feito
 pelo usuario e a saida de dados.
Ex. Um programa que pede para o usuario digitar o nome e depois
 exibir na tela o nome digitado, em seguida que solicita ao
 usuario para digitar o sobre nome e depois exibir na tela o
 valor digitado */

import java.sql.SQLOutput;
import java.util.Scanner;
import java.lang.String;

public class EntradaeSaidaInput {


    /* Primeiro método:Ler nome  */

    public static String lerNome() {

        Scanner input = new Scanner(System.in);
        System.out.println(" Informe seu nome:");
        String nome = input.nextLine();
        return nome;
    }

    /* Segundo método:Ler sobrenome  */
    public static String lerSobrenome() {

        Scanner input = new Scanner(System.in);
        System.out.println(" Informe seu sobrenome:");
        String sobrenome = input.nextLine();
        return sobrenome;
    }

    public static void main(String[] args) {

        System.out.println(" Seu nome completo é: " + lerNome() + " " + lerSobrenome());

    }

}


