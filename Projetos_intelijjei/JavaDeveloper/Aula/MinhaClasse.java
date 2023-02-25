package Aula;

import java.util.Scanner;
import java.lang.String;

public class MinhaClasse {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println(" Calcule a média da idade:");

        System.out.println("Informe a idade01:");
        double idade1 = ler.nextDouble();

        System.out.println("Informe a idade02:");
        double idade2 = ler.nextDouble();

        System.out.println("Informe a idade03:");
        double idade3 = ler.nextDouble();

        double media = (idade1+idade2+idade3)/3;


        System.out.printf(" A média das idades é: %.2f" , media);


    }
}
