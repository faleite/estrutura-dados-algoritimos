package com.faleite.estruturadados.pilha.labs;


import java.util.Stack;

public class Exer04 {

    public static void main(String[] args) {

        Stack<Livro> livros = new Stack<Livro>();

        //isEmpty()
        System.out.println("Pinha de livros criada, pilha esta vazia? " + livros.isEmpty());

        System.out.println("Empilhando livros na pilha:");
        for (int i = 1; i <= 6; i++){
            Livro livro = new Livro(("Livro" + i), ("isbn" + i), (1990+i), ("Autor" + i));
            //push()
            livros.push(livro);
        }

        //size()
        System.out.println(livros.size() + " livros foram empilhados");

        System.out.println("Espiando o topo da pilha:");
        //peek()
        System.out.println(livros.peek());


        System.out.println("Desempilhando livros da pilha:");
        while (!livros.isEmpty()) {
            //pop()
            System.out.println("Desempilhando " + livros.pop());
        }

        System.out.println("Pinha de livros criada, pilha esta vazia? " + livros.isEmpty());
    }

}
