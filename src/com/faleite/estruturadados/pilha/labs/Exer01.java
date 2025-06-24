package com.faleite.estruturadados.pilha.labs;

import com.faleite.estruturadados.pilha.Pilha;

import java.util.Scanner;

public class Exer01 {

    public static void getNumber(Scanner scan, Pilha<Integer> pilha){
        boolean validData = false;
        Integer mumber = null;

        while (!validData){
            try {
                mumber = scan.nextInt();
                if (mumber % 2 == 0){
                    System.out.println("Empilhando o número " + mumber);
                    pilha.emplilha(mumber);
                } else {
                    if (pilha.estaVazia()){
                        System.out.println("Pilha Vazia!");
                    } else {
                        System.out.println("Número ímpar, desempilhando um elemento da pilha: "
                                            + pilha.desempilha());
                    }
                }
                validData = true;
            } catch (Exception e){
                System.out.println("Dados invalidos, tente novamente!");
                scan.nextLine();
            }
        }

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Pilha<Integer> pilha = new Pilha<Integer>();

        System.out.println("Insira dez números");

        for (int i = 1; i <= 10; i++){
            System.out.println("Digite o " + i + "º número: ");
            getNumber(scan, pilha);
        }
        while(!pilha.estaVazia()){
            System.out.println("Desempilhando o elemento " + pilha.desempilha() + " da pilha");
        }
        System.out.println("Pilha: " + pilha);
    }
}
