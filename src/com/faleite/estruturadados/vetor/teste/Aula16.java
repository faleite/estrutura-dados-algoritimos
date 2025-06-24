package com.faleite.estruturadados.vetor.teste;

import com.faleite.estruturadados.pilha.Pilha;

public class Aula16 {

    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<Integer>();

        System.out.println(pilha.topo());

        System.out.println(pilha);

        pilha.emplilha(1);
        pilha.emplilha(2);

        System.out.println(pilha.topo());

        System.out.println(pilha);
    }
}
