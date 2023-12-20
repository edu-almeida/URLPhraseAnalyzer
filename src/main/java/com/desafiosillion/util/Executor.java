package com.desafiosillion.util;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;

public class Executor {
    public void executar(String url, String frase) {
        String conteudoPagina = realizarSolicitacaoHTTP(url);

        // Criar instância da classe Analisador e chamar os métodos
        Analisador analisador = new Analisador();
        int ocorrenciasFrase = analisador.contarOcorrencias(conteudoPagina, frase);
        Map<String, Integer> contagemPalavras = analisador.contarPalavras(conteudoPagina, frase);

        // Exibir resultados no console
        System.out.println("\"" + frase + "\" => repete " + ocorrenciasFrase + " vezes");

        for (Map.Entry<String, Integer> entry : contagemPalavras.entrySet()) {
            System.out.println("\"" + entry.getKey() + "\" => é repetido " + entry.getValue() + " vezes");
        }
    }

    private String realizarSolicitacaoHTTP(String url) {
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        try {
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            return response.body();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
