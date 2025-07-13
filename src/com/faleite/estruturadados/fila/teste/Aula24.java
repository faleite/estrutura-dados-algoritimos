package com.faleite.estruturadados.fila.teste;

import com.faleite.estruturadados.fila.FilaComPrioridade;

public class Aula24 {

    public static void main(String[] args) {
        FilaComPrioridade<Integer> fila = new FilaComPrioridade<>();

        fila.enfileira(1);
        fila.enfileira(3);
        fila.enfileira(2);

        System.out.println(fila); // [1, 2, 3]

        FilaComPrioridade<Paciente> fila2 = new FilaComPrioridade<>();

        fila2.enfileira(new Paciente("A", 2));
        fila2.enfileira(new Paciente("C", 1));
        fila2.enfileira(new Paciente("B", 3));

        System.out.println(fila2);
        // [Paciente{nome='C', prioridade=1}, Paciente{nome='A', prioridade=2}, Paciente{nome='B', prioridade=3}]

        System.out.println(fila2.desinfileirar()); // Paciente{nome='C', prioridade=1}
        System.out.println(fila2); // [Paciente{nome='A', prioridade=2}, Paciente{nome='B', prioridade=3}]
    }
}
