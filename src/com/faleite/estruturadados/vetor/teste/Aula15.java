package com.faleite.estruturadados.vetor.teste;

import com.faleite.estruturadados.pilha.Pilha;

public class Aula15 {

    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<Integer>();

        System.out.println(pilha.estaVazia());

        pilha.emplilha(1);

        System.out.println(pilha.estaVazia());
    }
}
