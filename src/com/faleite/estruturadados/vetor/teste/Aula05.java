package com.faleite.estruturadados.vetor.teste;

import com.faleite.estruturadados.vetor.Vetor;

public class Aula05 {
    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.adicionar("Elemento 1");
        vetor.adicionar("Elemento 2");
        vetor.adicionar("Elemento 3");

        System.out.println(vetor.busca(0));

    }
}
