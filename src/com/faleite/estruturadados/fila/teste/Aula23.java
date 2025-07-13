package com.faleite.estruturadados.fila.teste;

import java.util.LinkedList;
import java.util.Queue;

public class Aula23 {

    public static void main(String[] args) {

        // Lista encadeada que esta representando uma fila
        // Somente os métodos disponiveis na classe/interface Queue que poderão ser chamados
        // Isso garante o comportamento FIFO
        Queue<Integer> fila = new LinkedList<>();

        fila.add(1); // enqueue
        fila.add(2);

        System.out.println(fila); // [1, 2]
        System.out.println(fila.peek()); // 1 (método espiar)
        System.out.println(fila.remove()); // 1 (método dequeue - desenfileirar)
        System.out.println(fila); // [2]

    }
}
