
//IF TERNÁRIO  ENCADEADO
//IF EM UMA LINHA SÓ PARA REDUZIR O CÓDIGO

public class EstruturaRepeticao7 {

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
        int tempoCasa = 1;


        /*

        Será dado um salário para essa pessoa, se ele for gerente e:
        tiver um ano de casa, o salário será 1000, caso não, será 900
        Ou se não for gerente será 100

        .*/
        salario = (funcao.equals("Gerente")) ? ((tempoCasa == 1) ? 1000 : 900) : 100;

        //Um bloco de código de 10 linhas que pode ser representado por:  salario = (funcao.equals("Gerente")) ? ((tempoCasa == 1) ? 1000 : 900) : 100;:
        if (funcao.equals("Gerente")) {
            if (tempoCasa == 1) {
                System.out.println(" Parabéns, você tem mais de um ano de casa, logo, seu salário será: " + salario);
                salario = 1000;
            } else {
                System.out.println(" você tem MENOS de um ano de casa, logo, seu salário será: " + salario);
                salario = 900;
            }
        }else{
            System.out.println(" você não é gerente, logo, seu salário será: " + salario);
            salario = 100;
        }




        System.out.println("O salário é: R$ " + salario);

    }
}


// O objetivo o if ternário é fazer uma atribuição de uma função na forma rápida
// Neste if ternário ENCADEADO
// ? ( O ponto de interrogação representa o IF)
// : (Representa o else)


