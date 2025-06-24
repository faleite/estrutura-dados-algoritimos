package com.faleite.estruturadados.vetor.teste;

import com.faleite.estruturadados.pilha.Pilha;

public class Aula14 {

    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<Integer>();

        for (int i = 1; i <= 11; i++){
            pilha.emplilha(i);
        }

        System.out.println(pilha);
        System.out.println(pilha.tamanho());
    }
}
