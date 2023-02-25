
/*.Questão #1

Enunciado:

Faça um programa que peça para um usuário digitar um
número e que só finaliza quando o usuário digitar 0.....*/

import java.util.Scanner;

public class EstruturaDeRepeticao01 {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

        int numero;

        do {
            System.out.println("Informe um número:");
            numero = ler.nextInt();
        }while (numero !=0);
        System.out.println("Programa encerrado!");

        ler.close();

        }
    }


