package Aula;

import java.util.Scanner;

import java.lang.String;

public class PesquisaData {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe uma data: DD-MM-AAAA");
        String data = scanner.nextLine();

        String[] formatoData = data.split("-");

        System.out.println("A data informada foi: " + String.format("%s-%s-%s", formatoData[0], formatoData[1], formatoData[2]));
    }

}
