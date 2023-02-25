

//IF TERNÁRIO
//IF EM UMA LINHA SÓ PARA REDUZIR O CÓDIGO

public class EstruturaRepeticao6 {

    public static void main(String[] args) {

        int contador = 1;
        int resultado = 0;

        if(contador ==1){
            resultado = 10;
        }else {
            resultado = 100;
        }

        resultado = (contador ==1) ? 10 : resultado;

        int salario = 0;
        String funcao = "Gerente";


        salario = (funcao.equals("Gerente")) ? 1000 : 100;

        System.out.println("O salário é: R$ " + salario);

    }
}


// O objetivo o if ternário é fazer uma atribuição de uma função na forma rápida
// Neste if ternário se a função for gerente o salário é 1000, caso não seja se rá 100
// ? ( O ponto de interrogação representa o IF)
// : (Representa o else)
