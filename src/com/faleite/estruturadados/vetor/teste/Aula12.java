package com.faleite.estruturadados.vetor.teste;

import com.faleite.estruturadados.vetor.Lista;

import java.util.ArrayList;

public class Aula12 {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        // ADICIONAR
        arrayList.add("A");
        arrayList.add("C");

        System.out.println(arrayList); // [A, C]

        arrayList.add(1, "B");

        System.out.println(arrayList); // [A, B, C]

        // BUSCA
        boolean existe = arrayList.contains("A");
        if (existe){
            System.out.println("Elemento existe no arrray");
        } else {
            System.out.println("Elemento não existe no arrray");
        }

        int pos = arrayList.indexOf("D");
        if (pos > -1){
            System.out.println("Elemento existe no arrray " + pos);
        } else {
            System.out.println("Elemento não existe no arrray " + pos);
        }

        // Busca por posição
        System.out.println(arrayList.get(2)); // C
        //System.out.println(arrayList.get(4)); // como não existe retorna uma exception (IndexOutOfBoundsException)

        // Remover
        arrayList.remove(0);
        arrayList.remove("B");

        System.out.println(arrayList); // [C]

        //Descobrir Tamanho
        System.out.println(arrayList.size()); // 1
    }
}
