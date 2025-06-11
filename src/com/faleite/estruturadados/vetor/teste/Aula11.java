package com.faleite.estruturadados.vetor.teste;

import com.faleite.estruturadados.vetor.Lista;
import com.faleite.estruturadados.vetor.VetorObjetos;

public class Aula11 {

    public static void main(String[] args) {

       /* VetorObjetos vetor = new VetorObjetos(2);

        vetor.adiciona(1);
        vetor.adiciona("Elemento tipo String");

        System.out.println(vetor); // out: [1, Elemento tipo String]*/

        Lista<String> vetor = new Lista<String>(1);

        vetor.adiciona("String testing");
        vetor.adiciona("" + 1);
        // vetor.adiciona(1); // erro

    }
}
