import java.util.Scanner;

// Tema Do While com funções (Switch ...Case)...

public class MenuOpcoes2 {

    public static void main(String[] args) {

        int opcao = 0;
        String nome = " ";

        Scanner ler = new Scanner(System.in);

        System.out.println("=======SISTEMA DE CADASTRO ======");
        System.out.println("");


        do {

            System.out.println(" =========================");
            System.out.println(" 1 - Cadastro ");
            System.out.println(" 2 - Imprimir Cadastro ");
            System.out.println(" 9 - Sair do Sistema ");
            System.out.println(" =========================");
            System.out.print(" Escolha uma das opções : ");
            opcao = ler.nextInt();


            switch (opcao) {
                case 1:
                    System.out.print(" Digite um nome: ");
                    nome = ler.next();
                      break;
                case 2:
                    System.out.println(" O nome digitado e cadastrado foi: " + nome);

                    break;
                case 9:
                    System.out.println(" ");
                    System.out.println(" Você clicou na opção 9 para sair do programa!!!");
                    break;
                    default:
                        System.out.println("");
                        System.out.println(" Opção inválida!!!! Digite algum número do menu de opções!!!");
            }

        } while (opcao != 9) ;//Enquando a pessoa não digitar 9, o sistema não para,
        //O sistema ficará pedindo até a pessoa digitar 9

        }
    }

/*.

 COMO FICA NO CONSOLE:


 =======SISTEMA DE CADASTRO ======

 =========================
 1 - Cadastro
 2 - Imprimir Cadastro
 9 - Sair do Sistema
 =========================
 Escolha uma das opções : 1
 Digite um nome: Mara
 =========================
 1 - Cadastro
 2 - Imprimir Cadastro
 9 - Sair do Sistema
 =========================
 Escolha uma das opções : 2
 O nome digitado e cadastrado foi: Mara
 =========================
 1 - Cadastro
 2 - Imprimir Cadastro
 9 - Sair do Sistema
 =========================
 Escolha uma das opções : 3

 Opção inválida!!!! Digite algum número do menu de opções!!!
 =========================
 1 - Cadastro
 2 - Imprimir Cadastro
 9 - Sair do Sistema
 =========================
 Escolha uma das opções : 9

 Você clicou na opção 9 para sair do programa!!!




....*/
