package com.faleite.estruturadados.vetor.labs;

import com.faleite.estruturadados.vetor.Lista;

import java.util.ArrayList;

public class Exer03 {

    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<String>();

        lista.add("A");
        lista.add("B");
        lista.add("C");
        lista.add("A");

        lista.remove("A");

        System.out.println(lista);

        Lista<String> mylist = new Lista<String>(4);

        mylist.adiciona("A");
        mylist.adiciona("B");
        mylist.adiciona("C");
        mylist.adiciona("A");

        mylist.remove("A");

        System.out.println(mylist);
    }
}
