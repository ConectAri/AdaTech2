import java.util.Scanner;

/*

Escreva um programa que solicita ao usuario um numero e se
 o numero for par interrompe o programa, se o numero for
 impar solicita de novo um novo numrero

*/
public class ParOuImpar {

    public static void main(String[] args) {


        Scanner ler = new Scanner(System.in);

        int resultado;

        do {

            System.out.println("Informe um número: ");

            int numero = ler.nextInt();
            resultado = numero % 2;


        } while (resultado != 0);


    }
}







