package com.faleite.estruturadados.fila.teste;

import com.faleite.estruturadados.fila.Fila;

public class Aula20 {

    public static void main(String[] args) {

        Fila<Integer> fila = new Fila<>();

        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);

        System.out.println(fila.estaVazia());
        System.out.println(fila.tamanho());
        System.out.println(fila.toString());
    }
}
