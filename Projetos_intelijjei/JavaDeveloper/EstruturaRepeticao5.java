

//IF TERNÁRIO
//IF EM UMA LINHA SÓ PARA REDUZIR O CÓDIGO

public class EstruturaRepeticao5 {
    public static void main(String[] args) {

        int contador = 1;
        int resultado = 0;

        if (contador == 1) {
            resultado = 10;
        }

        /* Aqui fala: Contador é igual a 1? Caso seja igual a 1 irá retornar 10
        * caso não, irá retornar o 0   */

        resultado = (contador ==1) ? 10: resultado;

        System.out.println(resultado);

    }

}

/*

No Console o resultado irá retornar o 10.


Esse código pode ser utilizado em diversos projetos que envolvam a verificação de condições e a
atribuição de valores a variáveis com base nessas condições.

Um exemplo de aplicação seria em um sistema de gestão financeira, em que o programa precisa
verificar se um determinado cliente possui desconto em uma compra. O programa pode utilizar
uma estrutura condicional para verificar se o cliente possui algum tipo de desconto.
Caso o cliente possua o desconto, o programa pode atribuir o valor do desconto a uma
variável chamada resultado. Caso contrário, o programa pode manter o valor original da variável resultado.



Outro exemplo seria em um sistema de votação online, em que o programa precisa verificar
se um determinado usuário já votou antes. O programa pode utilizar uma estrutura condicional
para verificar se o usuário já votou. Caso o usuário já tenha votado, o programa pode atribuir
o valor 1 à variável resultado, indicando que o voto não pode ser computado. Caso contrário,
o programa pode manter o valor original da variável resultado.




O operador ternário utilizado no exemplo é uma alternativa mais concisa para a
estrutura condicional if-else. Ele permite que o programador verifique uma condição
e atribua um valor a uma variável com base nessa condição em uma única linha de código.


.....*/
