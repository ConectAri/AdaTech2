
public class EstruturaRepeticao03 {

    public static void main(String[] args) {


        int contador = 0;

       //Entando o contador for MAIOR  que 10 executo, não executou porquê é zero
        while (contador > 10) {
            System.out.println("Olá Turma" + contador);
            contador++;
        }

        //Aqui vai imprimir apenas uma vez a frase "Olá Turma boa" com apenas
        //uma vez ela aparecer no final
        do {
            System.out.println("Olá Turma boa" + contador);
            contador++;


        } while (contador > 10);
    }
}


/*

Resultado no Console:

Olá Turma boa0

ESTE CÓDIOG PODE SER UTILIZADO PARA..EXEMPLOS:

Um exemplo real de aplicação desse código seria em um programa que executa uma ação enquanto uma
determinada condição não é satisfeita, como por exemplo, em um jogo em que o jogador tem que acertar um alvo.
O programa pode utilizar um loop para executar a ação de disparo até que o jogador acerte o alvo, ou até que
o número máximo de tentativas seja alcançado.



Outro exemplo seria em um sistema de login, em que o programa pode utilizar um loop para solicitar ao usuário
 que digite suas credenciais até que elas sejam válidas, ou até que o número máximo de tentativas seja alcançado.



O uso de loops é muito comum em programação, pois permite que o programa
 execute uma determinada ação várias vezes, sem a necessidade de escrever várias linhas de código repetitivas. No exemplo apresentado, o programa utiliza dois tipos de loops: o while e o do-while, que permitem que o código dentro do loop seja executado enquanto uma condição é verdadeira.








.....*/