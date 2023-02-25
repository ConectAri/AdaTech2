package Escola;


import java.util.Scanner;

public class Escola {

    public static void main(String[] args) {

        final double NOTA_CORTE = 60;
        final double NOTA_MINIMA_RECUPERACAO = 50.0;
        final int MINIMO_PRESENCA = 50;


        Scanner sc = new Scanner(System.in);

        System.out.println(" Informe a nota da disciplica 1");
        double nota1 = sc.nextInt();
        System.out.println(" Informe a nota da disciplica 2");
        double nota2 = sc.nextInt();
        System.out.println(" Informe a nota da disciplica 3");
        double nota3 = sc.nextInt();

        System.out.println(" Informe o percentual de presença do aluno");
        double presenca = sc.nextInt();

        //Chamou a classe ENUM Media e o método de calcular média de forma..
        //simples
        double media =  Media.calcularMediaSimples(nota1, nota2, nota3);

        // Variável Declarada que na verdade chama o ENUN que é uma classe com nome StatusAluno
        //Enum. Foi passado para detro do ENUM a regra para identificar a aprovação....
        //Caso a regra altere, basta passar tudo para dentro do ENUM
        StatusAluno status = StatusAluno.NÃO_APROVADO.identificaAprovacao(media, NOTA_CORTE, NOTA_MINIMA_RECUPERACAO );


        System.out.println("O aluno foi: " + status.descricao);

    }
}
