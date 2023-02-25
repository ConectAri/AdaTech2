package Aula;

import java.util.Scanner;

import java.lang.String;

public class TesteTamanhoString {

    public static int testeTamanhoString(String str) {
        return str.length();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String str = input.nextLine();
        System.out.println("O tamanho da string é: " + testeTamanhoString(str));
    }
}

