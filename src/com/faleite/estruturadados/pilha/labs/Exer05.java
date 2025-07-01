package com.faleite.estruturadados.pilha.labs;

import java.util.Stack;

public class Exer05 {

    public static boolean isPalindromo(String frase){

        Stack<Character> pilha = new Stack<Character>();

        if (frase.isEmpty()) {
            return false;
        }

        for (int i = 0; i < frase.length(); i++){
            pilha.push(frase.charAt(i));
        }

        for (int i = 0; i < frase.length(); i++){
            if (pilha.pop() != frase.charAt(i)){
                return false;
            }
        }

        return true;

        /*String novaFrase = "";
        while (!pilha.isEmpty()) {
            novaFrase += pilha.pop();
        }

        if (novaFrase.equalsIgnoreCase(frase)){
            return true;
        }

        return false;*/

    }

    public static void imprimeResultado(String palavra){
        System.out.println(palavra + " é um palindromo? " + isPalindromo(palavra));
    }

    public static void main(String[] args) {

       imprimeResultado("AABCCBAA");
       imprimeResultado("ADDFDDA");
       imprimeResultado("ABFFBBB");
       imprimeResultado("Maria");

    }
}
