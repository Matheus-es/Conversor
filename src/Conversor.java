import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conversor {

    String primeiroMoeda;
    String segundoMoeda;

    public Conversor (String primeiraMoeda , String segundoMoeda){
        this.primeiroMoeda = primeiraMoeda;
        this.segundoMoeda = segundoMoeda;
    }

    public double converter (double quantidade, String primeiraMoeda, String segundaMoeda) throws IOException, InterruptedException {

        String endereco = "https://v6.exchangerate-api.com/v6/a564442dfd4934921881f24b/pair/" + primeiraMoeda + "/" + segundaMoeda ;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();

        Gson gson = new Gson();
        MoedaExchange conversao = gson.fromJson(json, MoedaExchange.class);

        return conversao.conversion_rate() * quantidade;


    }


    }

