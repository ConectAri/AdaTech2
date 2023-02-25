
/*
* Aqui quero criar um contador de e-mails enviados
*
* */

public class Variavel1 {


// Variável criada fora do método,
// Quando eu crio uma variável na classe ela é visível em toda a classe.
    public static int contador;

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

    public static void enviarEmail(String corpoEmail){


        System.out.println("Enviar email .....");
        System.out.println("Email Enviado.....Mensagem: " + corpoEmail);

        contador ++;

    }
}

/*

Quando eu crio uma variável dentro do método somente o método tem acesso a ela.

Quando eu crio uma variável na classe ela é visível em toda a classe.


Esse código pode ser utilizado em um projeto que envolve o envio de e-mails em massa,
onde é necessário contar quantos e-mails foram enviados com sucesso.




O código define uma variável estática chamada "contador" que é
incrementada toda vez que um e-mail é enviado com sucesso através do método "enviarEmail".
O número total de e-mails enviados é exibido no final do programa através da impressão
da mensagem "Numero de emails enviados: " + contador".



Porém, vale ressaltar que esse código é apenas um exemplo simples e não é
suficiente para lidar com questões de segurança, desempenho e escalabilidade
que são importantes em projetos reais de envio de e-mails em massa.

.*/


