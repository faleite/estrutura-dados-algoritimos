package com.faleite.estruturadados.vetor.teste;

import com.faleite.estruturadados.pilha.Pilha;

public class Aula17 {

    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<Integer>();

        pilha.emplilha(1);
        pilha.emplilha(2);
        pilha.emplilha(3);

        System.out.println(pilha);

        System.out.println("Desempilhando elemento " + pilha.desempilha());

        System.out.println(pilha);
    }
}
