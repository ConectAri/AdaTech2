package Aula;

import Util.Meses;

import java.lang.String;

import java.util.Locale;
import java.util.Scanner;

// Aprendendo   switch //

public class OutraPrincipal {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Inicio da aplicação:");
        System.out.println("Informe o mês do seu nascimento:");
        String mes = ler.nextLine();

        // Aqui chamou o ENUM que tem o nome MES, declarou a variável mesDigitado
        // método toUpperCase converte tudo para maiúsculo e não da erro ao digitar diferente
        Meses mesDigitado = Meses.valueOf(mes.toUpperCase());

        switch (mesDigitado) {
            case JANEIRO : // Aqui usou no formado do ENUM
                System.out.println("O mes informado foi" + mes);
                break;
            case MARÇO :
                System.out.println("O mes informado foi" + mes);
                break;
            case SETEMBRO :
                System.out.println("O mes informado foi" + mes);
                break;
            default:
                System.out.println("Mês não existe .");

        }


    }

}
