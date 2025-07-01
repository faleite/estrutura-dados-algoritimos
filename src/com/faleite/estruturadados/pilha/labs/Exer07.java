package com.faleite.estruturadados.pilha.labs;

import java.util.Stack;

public class Exer07 {

    public static void imprimeResultadoQualquerBase(int num, int base){
        System.out.println(num + " em base " + base + " é: " + convertQualquerBase(num, base));
    }

    public static void imprimeResultado(int num){
        System.out.println(num + " em binário é: " + convertBase10ToBase2(num));
    }

    public static String convertBase10ToBase2(int num){

        Stack<Integer> pilha = new Stack<>();
        //String resultado = new String();
        String resultado = "";
        int resto;

        while (num > 0){
            resto = num % 2;
            pilha.push(resto);
            num /= 2;
        }
        while (!pilha.isEmpty()){
            resultado += pilha.pop();
        }
        return resultado;
    }

    public static String convertQualquerBase(int num, int base){

        if (base > 16){
            throw new IllegalArgumentException();
        }

        Stack<Integer> pilha = new Stack<>();
        String resultado = "";
        int resto;
        String bases = "0123456789ABCDEF";

        while (num > 0){
            resto = num % base;
            pilha.push(resto);
            num /= base;
        }
        while (!pilha.isEmpty()){
            resultado += bases.charAt(pilha.pop());
        }
        return resultado;
    }

    public static void main(String[] args) {

        imprimeResultado(2);
        imprimeResultado(4);
        imprimeResultado(10);
        imprimeResultado(25);
        imprimeResultado(10035);

        imprimeResultadoQualquerBase(25, 16);
        imprimeResultadoQualquerBase(10035, 8);
        imprimeResultadoQualquerBase(10035, 16);

        imprimeResultadoQualquerBase(10035, 9);
    }
}
