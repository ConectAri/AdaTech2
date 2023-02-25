

public class Variavel2 {

    // Variável criada fora do método,
    // Quando eu crio uma variável na classe ela é visível em toda a classe.
    public static int contador;

    public static boolean servidorEmailDisponível = true; // Aqui o servidor NÃO está disponível

    public static void main(String[] args) {


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


/*
*
* Este código é um exemplo simples em Java que mostra como trabalhar com variáveis ​​e métodos estáticos.

A classe Variavel2 tem dois atributos estáticos, contador e servidorEmailDisponível, e um método estático enviarEmail.
*
O atributo contador é um contador que é incrementado a cada vez que um e-mail é enviado com sucesso.
 *
O atributo servidorEmailDisponível é uma variável booleana que indica se o servidor de e-mail está disponível ou não.

O método enviarEmail é responsável por enviar um e-mail. Ele primeiro verifica se o servidor de e-mail está disponível e,
se estiver, envia a mensagem do e-mail e incrementa o contador. Caso contrário,
*
ele exibe uma mensagem de erro indicando que ocorreu um erro ao enviar o e-mail.

No método main, são criadas quatro chamadas ao método enviarEmail, cada uma com uma mensagem diferente.
Depois de todas as chamadas, o valor atual do contador é impresso no console.

Este exemplo é simples, mas demonstra o uso de variáveis ​​estáticas e métodos em Java e como eles podem
ser usados para rastrear o número de e-mails enviados e verificar se o servidor de e-mail está disponível antes
de enviar um e-mail
*
*
*  */
