package com.desafiosillion.util;

import java.util.HashMap;
import java.util.Map;

public class Analisador {
    public Map<String, Integer> contarPalavras(String conteudo, String frase) {
        Map<String, Integer> contagemPalavras = new HashMap<>();
        String[] palavrasFrase = frase.split("\\s+");

        for (String palavra : palavrasFrase) {
            int ocorrencias = conteudo.split("\\b" + palavra + "\\b", -1).length - 1;
            contagemPalavras.put(palavra, ocorrencias);
        }

        return contagemPalavras;
    }

    public int contarOcorrencias(String conteudo, String frase) {
        return conteudo.split("\\b" + frase + "\\b", -1).length - 1;
    }
}
