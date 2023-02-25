package Aula;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import java.lang.String;

public class OlhandoData {


        public static void main(String[] args) {

            Scanner ler = new Scanner(System.in);

            // Solicita ao usuário que informe a data
            System.out.println(" Informe uma data: dd-mm-aa");
            String dataInformada = ler.nextLine();

            try{

                // Converte a string informada em um objeto Date
                SimpleDateFormat formatadorEntrada = new SimpleDateFormat("dd/MM/yyyy");
                Date data = formatadorEntrada.parse(dataInformada);


                // Cria um objeto SimpleDateFormat com o formato desejado
                SimpleDateFormat formatadorSaida = new SimpleDateFormat("dd-MM-yyyy");

                // Formata a data e exibe no console
                String dataFormatada = formatadorSaida.format(data);

                System.out.println("Data formatada: " + dataFormatada);
            } catch (Exception e) {
                System.out.println("Data inválida. Informe uma data no formato DD/MM/AAAA.");
            }
        }
    }









