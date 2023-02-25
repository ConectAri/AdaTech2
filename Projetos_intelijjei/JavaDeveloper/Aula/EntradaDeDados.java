package Aula;
import java.lang.String;

public class EntradaDeDados {

    public static void main(String[] args) {

        System.out.println(" Calcule a média das notas: ");

        int nota1 = 9;
        int nota2 = 5;
        int nota3 = 8;

        double totalNotas = 3.0;

        double media = (nota1 + nota2 + nota3)/ totalNotas;

        System.out.println(media);

        // Disciplina nota   peso
        // Biologia    8.2,  3
        // Filosofia   7.9   2
        // Física      5.8   4

        double mediaPonderada = ((8.2 * 3) + (7.9 * 2) + (5.0 * 4))/ (3+2+4);

        System.out.println(mediaPonderada);

        //tipo  modificador
        String valor = "Isto é um texto";

        int tamanho = valor.length();
        System.out.println(tamanho);
        int posicao = valor.indexOf("w");



        System.err.println(" Para demonstrar um erro e ficar vermelho");


    }

}
