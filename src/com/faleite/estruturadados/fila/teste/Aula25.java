package com.faleite.estruturadados.fila.teste;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Aula25 {

    public static void main(String[] args) {

        Queue<Integer> filaComPrioridade = new PriorityQueue<>();

        filaComPrioridade.add(2);
        filaComPrioridade.add(1);

        System.out.println(filaComPrioridade); // [1, 2]

        Queue<Paciente> filaComPrioridade2 = new PriorityQueue<>();

        filaComPrioridade2.add(new Paciente("A", 2));
        filaComPrioridade2.add(new Paciente("B", 1));

        System.out.println(filaComPrioridade2);
        // [Paciente{nome='B', prioridade=1}, Paciente{nome='A', prioridade=2}]

        Queue<Paciente2> filaComPrioridade3 = new PriorityQueue<>(
                new Comparator<Paciente2>() {
                    @Override
                    public int compare(Paciente2 p1, Paciente2 p2) {
                        return Integer.valueOf(p1.getPrioridade()).compareTo(p2.getPrioridade());

                        /*if (p1.getPrioridade() > p2.getPrioridade()){
                            return 1;
                        } else if (p1.getPrioridade() < p2.getPrioridade()) {
                            return -1;
                        }
                        return 0;*/
                    }
                }
        );

        filaComPrioridade3.add(new Paciente2("A", 2));
        filaComPrioridade3.add(new Paciente2("B", 1));

        System.out.println(filaComPrioridade3);
        // [Paciente{nome='B', prioridade=1}, Paciente{nome='A', prioridade=2}]
    }
}
