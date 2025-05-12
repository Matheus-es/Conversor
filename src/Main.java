import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner ler = new Scanner(System.in);
        double quantidade;
        int opcao = 0;

        String menu = """
                *********************************************
                Seja bem vindo/a ao Conversor de moedas =)
                
                1) Dólar =>> Peso argentino
                
                2) Peso argentinos =>> Dólar
                
                3) Dólar =>> Real brasileiro
                
                4) Real brasileiro =>> Dólar
                
                5) Dólar =>> Franco do Jibuti
                
                6) Franco do Jibuti =>> Dólar
                
                7) Sair
                
                Escolha uma opção valida
                *********************************************
                """;

        while (opcao != 7 ){
            System.out.println(menu);
            opcao = ler.nextInt();

            if (opcao >= 1 && opcao <= 6 ){
                System.out.println("Digite o valor que deseja converter");
                quantidade = ler.nextDouble();

                String primeiraMoeda = "";
                String segundaMoeda = "";

                switch (opcao){
                    case 1 :
                        primeiraMoeda = "USD";
                        segundaMoeda = "ARS";
                        break;
                    case 2:
                        primeiraMoeda = "ARS";
                        segundaMoeda = "USD";
                        break;
                    case 3:
                        primeiraMoeda = "USD";
                        segundaMoeda = "BRL";
                        break;
                    case 4:
                        primeiraMoeda = "BRL";
                        segundaMoeda = "USD";
                        break;
                    case 5:
                        primeiraMoeda = "USD";
                        segundaMoeda = "DJF";
                        break;
                    case 6:primeiraMoeda = "DJF";
                        segundaMoeda = "USD";
                        break;
                }

                Conversor conversorDeMoedas = new Conversor(primeiraMoeda,segundaMoeda);
                double valorConvertido = conversorDeMoedas.converter(quantidade,primeiraMoeda,segundaMoeda);




                System.out.println("O valor de " + quantidade + " " + primeiraMoeda + " é equivalente a " + valorConvertido + " " + segundaMoeda);

            }


        }








    }

}