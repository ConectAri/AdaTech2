
//Tema : Escopos de Variáveis
//Escopo de classes, métodos e blocos

public class Variavel3 {

    public static int contador;

    public static boolean servidorEmailDisponível = true; // Aqui o servidor NÃO está disponível

    public static void main(String[] args) {

        int numero = 10;

        if(numero ==10){
            numero = 9;
            System.out.println(numero);

            int numero2 = 10;
            System.out.println(numero2);
            //Quando a variável dentro de um bloco só é acessível detro do bloco
        }


        String mensagem = "Olá como vai...";

        enviarEmail(mensagem + " A ");
        enviarEmail(mensagem + " B ");
        enviarEmail(mensagem + " C ");
        enviarEmail(mensagem + " D ");

        System.out.println(" ========================================");
        System.out.println("Numero de emails enviados: " + contador);
        System.out.println(" ========================================");

    }

    public static void enviarEmail(String corpoEmail) {

        System.out.println(" Enviando email........");

        if (servidorEmailDisponível) {
            System.out.println(" Email Enviado....Mensagem: " + corpoEmail);
            contador++;
        } else {
            System.out.println(" Ocorreu um erro ao enviar email......");

        }
    }


}
