package Aula;

import java.lang.String;
import java.util.Scanner;


public class TreinandoTryCatch{

    public static void main(String[] args) {

    Scanner ler = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        String valor = ler.nextLine();

        try{
        int intValor  = Integer.parseInt(valor);
        }catch (Exception e){
            System.err.println(" O valor digitado não pode ser convertido para número ");
            System.exit(0);
        }

        System.out.println("Digite outro valor:");
        String outroValor = ler.nextLine();

        try{
        int intoutroValor = Integer.parseInt(outroValor);
        } catch (Exception e){
            System.err.println(" O valor digitado não pode ser convertido para número");
            System.exit(0);

        }


        System.out.println(valor + outroValor);

    }
}
