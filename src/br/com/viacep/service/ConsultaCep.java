package br.com.viacep.service;

import br.com.viacep.model.Cep;
import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaCep {

    public Cep buscaCep(String cep) {
        Gson gson = new Gson();
        String url = "https://viacep.com.br/ws/" + cep + "/json/";
        System.out.println("endpoint: " + url);

        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(url)).build();
        HttpResponse<String> response = null;
        try {
            response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e.getCause());
        }

        String resposta = response.body();
        System.out.println("resposta serviço: " + resposta);

        if (!resposta.contains("Bad Request")) {
            Cep cepResposta = gson.fromJson(resposta, Cep.class);
            return cepResposta;
        }
        return null;
    }
}
