package com.faleite.estruturadados.pilha.labs;

import com.faleite.estruturadados.pilha.Pilha;

import java.util.Stack;

public class Exer06 {

    final static String ABRE = "([{";
    final static String FECHA = ")]}";

    public static boolean checarExpressao(String expressao){

        Stack<Character> pilha = new Stack<>();
        int index = 0;
        char simbolo, topo;

        while (index < expressao.length()){
            simbolo = expressao.charAt(index);

            if (ABRE.indexOf(simbolo) > -1){
                pilha.push(simbolo);
            } else if (FECHA.indexOf(simbolo) > -1) {
                if (pilha.isEmpty()){
                    return false;
                }
                topo = pilha.pop();
                if (ABRE.indexOf(topo) != FECHA.indexOf(simbolo)){
                    return false;
                }
            }
            index++;
        }
        return pilha.isEmpty();
    }

    public static void imprimeResultado(String expr){
        System.out.println(expr + " Tem a expressão correta? " + checarExpressao(expr));
    }
    public static void main(String[] args) {

        imprimeResultado("((A+B)");
        imprimeResultado("A+B(");
        imprimeResultado("A+B");
        imprimeResultado(")A+B( - C");
        imprimeResultado("(A+B)) - (C + D");
        imprimeResultado("((A+B)+D)");

        imprimeResultado("A + B");
        imprimeResultado("A + B + (C - D)");
        imprimeResultado("{[()]}[](){()}");
        imprimeResultado("{[(]}[](){()}");
        imprimeResultado("A + B + C - D");

        imprimeResultado("[()]");


    }
}