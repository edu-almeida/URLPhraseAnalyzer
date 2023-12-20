package com.desafiosillion;

import com.desafiosillion.util.Executor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um URL válido: ");
        String url = scanner.nextLine();

        System.out.print("Insira uma frase composta por N palavras: ");
        String frase = scanner.nextLine();

        // Criar instância da classe Executor e chamar o método executar
        Executor executor = new Executor();
        executor.executar(url, frase);
    }
}