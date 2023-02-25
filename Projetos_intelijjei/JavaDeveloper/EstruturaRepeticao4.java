
// IF BRACELESS - SEM BRAÇO

public class EstruturaRepeticao4 {

    public static void main(String[] args) {

        int contador = 1;

        if(contador == 0)
            System.out.println("Contador é 0 ");
            System.out.println(" Teste teste teste ");

    }
}

/*

O Resultado saiu apenas a frase: " Teste teste teste "
MOTIVO: Quando uso o IF sem os braços a primeira linha até o PONTO E VÍRGULA
após isso processa normalmente.


No exemplo apresentado, o programa utiliza uma estrutura condicional if para verificar se
a variável contador é igual a 0. Caso essa condição seja verdadeira, o programa imprime a
frase "Contador é 0". No entanto, mesmo que a condição seja falsa, o programa ainda irá imprimir
a frase "Teste teste teste".


Essa construção de código é comum em situações em que o programador precisa executar uma
ação caso uma condição seja verdadeira e outra ação caso a condição seja falsa.
No entanto, é importante lembrar que o código apresentado pode gerar resultados inesperados,
uma vez que o segundo println está fora das chaves da estrutura condicional.
Para evitar erros, é recomendável sempre utilizar chaves para delimitar as ações
que devem ser executadas dentro de uma estrutura condicional.


.....*/


