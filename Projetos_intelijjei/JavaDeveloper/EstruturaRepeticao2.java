

public class EstruturaRepeticao2 {

    public static void main(String[] args) {


        int contador = 0;

        //Aqui vai imrprimir 10 vezes a frase "Olá Turma"
        // e na frente colocar um número na frase em forma de contagem

        while (contador < 10) {
            System.out.println("Olá Turma" + contador);
            contador++;
        }

        //Aqui vai imprimir apenas uma vez a frase "Olá Turma boa" com apenas
        //uma vez ela aparecer no final
        do {
            System.out.println("Olá Turma boa" + contador);
            contador++;


        } while (contador < 10);


    }

}


/*

Resultado de como ficaria no Console:

Olá Turma0
Olá Turma1
Olá Turma2
Olá Turma3
Olá Turma4
Olá Turma5
Olá Turma6
Olá Turma7
Olá Turma8
Olá Turma9
Olá Turma boa10


Esse código pode ser utilizado em diversas situações em que seja necessário iterar um determinado número de vezes, como por exemplo,
 na geração de relatórios com informações de clientes, produtos, vendas, etc.


Um exemplo específico seria em um sistema de matrícula escolar, em que o programa pode utilizar um loop para iterar sobre
 uma lista de alunos e exibir suas informações em tela. Nesse caso, o loop seria útil para evitar a repetição de código,
  já que a mesma ação (exibir informações do aluno) seria executada várias vezes.


Outro exemplo seria em um programa que gera senhas aleatórias para usuários, em que o loop seria utilizado
 para gerar várias senhas até que a quantidade desejada fosse atingida.



O uso de loops é muito comum em programação, pois permite que o programador execute uma determinada
 ação várias vezes sem a necessidade de escrever várias linhas de código repetitivas. No exemplo apresentado, o programa utiliza dois tipos de loops: o while e o do-while, que permitem que o código dentro do loop seja executado enquanto uma condição é verdadeira.






.....*/

