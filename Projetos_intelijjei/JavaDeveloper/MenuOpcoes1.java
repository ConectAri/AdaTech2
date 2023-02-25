import java.util.Scanner;

// TEMA: DO WHILE (SISTEMA DE REPETIÇÕES)

public class MenuOpcoes1 {

    public static void main(String[] args) {

        int opcao = 0;

        Scanner ler = new Scanner(System.in);

        System.out.println("=======SISTEMA DE CADASTRO ======");
        System.out.println("");

        do{
            System.out.println(" 1 - Cadastro ");
            System.out.println(" 2 - Imprimir Cadastro ");
            System.out.println(" 9 - Sair do Sistema ");
            opcao = ler.nextInt();


        }while(opcao != 9);//Enquando a pessoa não digitar 9, o sistema não para,
        //O sistema ficará pedindo até a pessoa digitar 9



    }

}

 /*   COMO SERÁ IMPRESSO NO CONSOLE:

 =======SISTEMA DE CADASTRO ======

 1 - Cadastro
 2 - Imprimir Cadastro
 9 - Sair do Sistema
2
 1 - Cadastro
 2 - Imprimir Cadastro
 9 - Sair do Sistema
3
 1 - Cadastro
 2 - Imprimir Cadastro
 9 - Sair do Sistema
9  (ASSIM QUE EU DIGITEI 9, PAROU O SISTEMA)




  */
