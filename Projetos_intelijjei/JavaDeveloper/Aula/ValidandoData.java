package Aula;

/*

Esse código verifica se o array "partesData" tem pelo menos 3 elementos
antes de tentar acessar os índices 0, 1 e 2.
 Se o array tiver menos de 3 elementos, o programa exibe uma mensagem de erro.
Caso contrário, o programa exibe o dia, o mês e o ano separadamente.
 */

import java.util.Scanner;

import java.lang.String;


public class ValidandoData {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe uma data no formato DD/MM/AAAA:");
        String data = scanner.nextLine();

        String[] partesData = data.split("/");

        if (partesData.length >= 3) {
            String dia = partesData[0];
            String mes = partesData[1];
            String ano = partesData[2];

            System.out.println("Dia: " + dia);
            System.out.println("Mês: " + mes);
            System.out.println("Ano: " + ano);
        } else {
            System.out.println("Data inválida.");
        }
    }
}





