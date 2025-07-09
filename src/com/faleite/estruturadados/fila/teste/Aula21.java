package com.faleite.estruturadados.fila.teste;

import com.faleite.estruturadados.fila.Fila;

public class Aula21 {

    public static void main(String[] args) {

        Fila<Integer> fila = new Fila<>();

        fila.enfileira(3);
        fila.enfileira(1);
        fila.enfileira(2);

        System.out.println(fila.espiar());
    }
}
