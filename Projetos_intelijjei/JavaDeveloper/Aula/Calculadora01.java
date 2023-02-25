package Aula;

import java.lang.String;

/* Enunciado
  Crie um classe calculadora com os seguites metodos: somar, subtrair, multiplicar e dividir.

  Cada metodo deve receber dois parametros e retornar o resultado da operação.

   Lembre-se que nesse momento todos os metodos devem ser estaticos.

   Crie um programa para usar a calculadora. */

import java.util.Scanner;

public class Calculadora01 {


    int a = 10;
    int b = 3;


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(" Qual calculo deseja realizar? ");
        System.out.println("======================");
        System.out.println(" 1 - Somar      ");
        System.out.println(" 2 - Subtrair   ");
        System.out.println(" 3 - Multiplicar");
        System.out.println(" 4 - Dividir     ");
        int metodo = input.nextInt();

        System.out.println(" Você escolheu a opção: " + metodo);

        switch (metodo) {
            case 1:
                metodoSomar(10, 3);
                System.out.println(" O resultado da soma  de ( a + b) é: " + metodoSomar(10, 3));
                break;

            case 2:
                metodoSubtrair(10, 3);
                System.out.println(" O resultado da subtração de (a - b) é: " + metodoSubtrair(10, 3));
                break;

            case 3:
                metodoMultiplicar(10, 3);
                System.out.println(" O resultado da multilicação de (a * b) é: " + metodoMultiplicar(10, 3));
                break;

            case 4:
                metodoDividir(10, 3);
                System.out.println(" O resultado da divisão de (a/b) é: " + metodoDividir(10, 3));
                break;

        }
    }


    private static int metodoSomar(int a, int b) {
        return a + b;
    }


    private static int metodoSubtrair(int a, int b) {
        return a - b;
    }


    public static int metodoMultiplicar(int a, int b) {
        return a * b;

    }

    public static int metodoDividir(int a, int b) {

        return a / b;

    }

}










