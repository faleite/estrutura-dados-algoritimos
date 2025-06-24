package com.faleite.estruturadados.pilha.labs;

import com.faleite.estruturadados.pilha.Pilha;

import java.util.Scanner;

public class Exer02 {

    public static void desempilha(Pilha<Integer> pilha){
        if (pilha.estaVazia()){
            System.out.println("A pilha esta vazia");
        } else {
            System.out.println("Desempilhando elemento " + pilha.desempilha());
        }
    }

    public static void getNumber(Scanner scan, Pilha<Integer> par, Pilha<Integer> impar){
        boolean validData = false;
        Integer number = null;

        while (!validData){
            try {
                number = scan.nextInt();
                if (number % 2 == 0){
                    if (number != 0) {
                        System.out.println("Empilhando o número " + number + " na pilha par");
                        par.emplilha(number);
                    } else {
                        desempilha(par);
                        desempilha(impar);
                    }
                } else {
                    System.out.println("Empilhando o número " + number + " na pilha ímpar");
                    impar.emplilha(number);
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
        Pilha<Integer> par = new Pilha<Integer>();
        Pilha<Integer> impar = new Pilha<Integer>();

        System.out.println("Insira dez números");

        for (int i = 1; i <= 10; i++){
            System.out.println("Digite o " + i + "º número: ");
            getNumber(scan, par, impar);
        }

        while(!par.estaVazia()){
            System.out.println("Desempilhando o elemento " + par.desempilha() + " da pilha par");
        }
        System.out.println("Pilha par: " + par);

        while(!impar.estaVazia()){
            System.out.println("Desempilhando o elemento " + impar.desempilha() + " da pilha impar");
        }
        System.out.println("Pilha impar: " + par);
    }
}
