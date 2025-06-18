package com.faleite.estruturadados.vetor.labs;

import com.faleite.estruturadados.vetor.Lista;

import java.util.ArrayList;

public class Exer04 {

    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<String>();

        lista.add("A");
        lista.add("B");
        lista.add("C");
        lista.add("A");

        System.out.println(lista.get(3));

        Lista<String> mylist = new Lista<String>(4);

        mylist.adiciona("A");
        mylist.adiciona("B");
        mylist.adiciona("C");
        mylist.adiciona("A");

        System.out.println(mylist.obtem(4));
    }
}
