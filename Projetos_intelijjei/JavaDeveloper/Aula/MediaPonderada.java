package Aula;

import java.util.Scanner;

import java.lang.String;

public class MediaPonderada {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        //Diciplina nota    peso
        // Biologia  8.2    3
        // Filosofia 7.9    2
        // Fisica    5.0    4

        System.out.println("Informe a nota de Biologia:");
        double notaB = ler.nextDouble();

        System.out.println("Informe a nota de Filosofia:");
        double notaF = ler.nextDouble();

        System.out.println("Informe a nota de Física:");
        double notaFi = ler.nextDouble();

        double mediaPonderada = ((notaB *3) + (notaF*2)+ (notaFi*4))/(3+2+4);

        System.out.printf(" O resultado da média ponderada é %.2f:", mediaPonderada);

    }
}
