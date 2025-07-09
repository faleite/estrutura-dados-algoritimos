package com.faleite.estruturadados.vetor.labs;

import com.faleite.estruturadados.vetor.Lista;

import java.util.ArrayList;

public class Exer01 {

    public static void main(String[] args) {
        ArrayList<String> lista1 = new ArrayList<>(2);
        System.out.println(lista1.contains("B"));

        Lista<String> lista = new Lista<String>(2);

        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");
        System.out.println(lista.contem("A"));
        System.out.println(lista.contem("B"));
        System.out.println(lista.contem("E"));
    }
}
