package com.faleite.estruturadados.vetor.teste;

import com.faleite.estruturadados.vetor.Vetor;

public class Aula02 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(2);

       /* try {
            vetor.adicionar("Elemento 1");
            vetor.adicionar("Elemento 2");
            vetor.adicionar("Elemento 3");
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        vetor.adiciona("Elemento 1");
        vetor.adiciona("Elemento 2");
        vetor.adiciona("Elemento 3");
    }
}
