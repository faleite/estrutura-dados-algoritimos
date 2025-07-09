package com.faleite.estruturadados.pilha.labs;

import java.util.Stack;

public class Exer08 {

    public static void torreHanoi(int numDiscos, Stack<Integer> original, Stack<Integer> dest, Stack<Integer> aux){

        if (numDiscos > 0){
            torreHanoi(numDiscos-1, original, aux, dest);
            dest.push(original.pop());
            System.out.println("-------");
            System.out.println("Original: " + original);
            System.out.println("Destino: " + dest);
            System.out.println("Auxiliar: " + aux);
            torreHanoi(numDiscos-1, aux, dest, original);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> original = new Stack<>();
        Stack<Integer> dest = new Stack<>();
        Stack<Integer> aux = new Stack<>();
        int numDiscos = 5;

        for (int i = numDiscos; i > 0; i--){
            original.push(i);
        }

        torreHanoi(numDiscos, original, aux, dest);
    }
}