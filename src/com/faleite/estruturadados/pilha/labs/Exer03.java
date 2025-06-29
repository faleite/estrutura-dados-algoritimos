package com.faleite.estruturadados.pilha.labs;

import com.faleite.estruturadados.pilha.Pilha;

public class Exer03 {

    public static void main(String[] args) {

        Pilha<Livro> livros = new Pilha<Livro>(20);

        //isEmpty()
        System.out.println("Pinha de livros criada, pilha esta vazia? " + livros.estaVazia());

        System.out.println("Empilhando livros na pilha:");
        for (int i = 1; i <= 6; i++){
            Livro livro = new Livro(("Livro" + i), ("isbn" + i), (1990+i), ("Autor" + i));
            //push()
            livros.emplilha(livro);
        }

        //size()
        System.out.println(livros.tamanho() + " livros foram empilhados");

        System.out.println("Espiando o topo da pilha:");
        //peek()
        System.out.println(livros.topo());


        System.out.println("Desempilhando livros da pilha:");
        while (!livros.estaVazia()) {
            //pop()
            System.out.println("Desempilhando " + livros.desempilha());
        }

        System.out.println("Pinha de livros criada, pilha esta vazia? " + livros.estaVazia());
    }
}
