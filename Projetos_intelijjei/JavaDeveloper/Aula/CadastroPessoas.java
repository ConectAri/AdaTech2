package Aula;

import java.util.Scanner;

import java.lang.String;

/* ......*/

public class CadastroPessoas {


    public static void main(String[] args) {
        operacoes();
    }


    public static void operacoes() {

     Scanner ler = new Scanner(System.in);

        int opcao = 0;
        String nome = "";

        System.out.println("------Sistema de cadastro -----");
        System.out.println("-------------------------------");


        do {

        System.out.println("1 - Cadastro");
        System.out.println("2 - Imprimir ");
        System.out.println("9 - Sair ");
        opcao = ler.nextInt();


            switch (opcao) {
                case 1:
                    System.out.println("Digite um nome: ");
                    nome = ler.nextLine();
                    break;
                case 2:
                    System.out.println("O nome digitado é:" + nome);
                    break;
                case 9 :
                    System.out.println("Opção selecionada: sair");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;

            }

    }while(opcao != 9);
        ler.close();

  }

}











