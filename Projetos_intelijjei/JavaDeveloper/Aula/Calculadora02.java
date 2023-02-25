package Aula;
import java.lang.String;

public class Calculadora02 {

    public static void main(String[] args) {


        int a = 5;
        int b = 2;

        int resultadoSoma = Aula.Calculadora02.somar(a, b);
        int resultadoSubtracao = Aula.Calculadora02.subtrair(a, b);
        int resultadoMultiplicacao = Aula.Calculadora02.multiplicar(a, b);
        double resultadoDivisao = Aula.Calculadora02.dividir(a, b);

        System.out.println("Soma: " + resultadoSoma);
        System.out.println("Subtração: " + resultadoSubtracao);
        System.out.println("Multiplicação: " + resultadoMultiplicacao);
        System.out.println("Divisão: " + resultadoDivisao);
    }

    private static int dividir(int a, int b) {
        return a /b ;
    }

    private static int multiplicar(int a, int b) {
        return a * b ;
    }

    private static int subtrair(int a, int b) {
        return a - b ;
    }

    private static int somar(int a, int b) {
        return a + b;
    }
}


