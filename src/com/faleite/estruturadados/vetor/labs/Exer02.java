package com.faleite.estruturadados.vetor.labs;

import com.faleite.estruturadados.vetor.Lista;

import java.util.ArrayList;

public class Exer02 {

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();

        lista.add("B");
        lista.add("B");
        lista.add("A");
        System.out.println(lista.lastIndexOf("B"));

        Lista<String> myList = new Lista<>(3);

        myList.adiciona("B");
        myList.adiciona("B");
        myList.adiciona("A");
        System.out.println(myList.ultimoIndice("B"));
    }
}
