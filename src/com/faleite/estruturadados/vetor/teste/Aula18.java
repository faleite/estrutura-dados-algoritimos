package com.faleite.estruturadados.vetor.teste;

import com.faleite.estruturadados.pilha.Pilha;

import java.util.Stack;

public class Aula18 {

    public static void main(String[] args) {

        Pilha<Integer> pilha =  new Pilha<Integer>();

        Stack<Integer> stack = new Stack<Integer>();

        System.out.println(stack.isEmpty()); // out: true

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.isEmpty()); // out: false

        System.out.println(stack.size()); // out: 3

        System.out.println(stack); // out: [1, 2, 3]

        System.out.println(stack.peek()); // out: 3

        System.out.println(stack.pop()); // out: 3

        System.out.println(stack); // out: [1, 2]

    }
}
