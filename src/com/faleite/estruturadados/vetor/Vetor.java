package com.faleite.estruturadados.vetor;

import java.util.Arrays;

public class Vetor {
    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade){
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    /*public void adicionar(String elemento){
        for (int i = 0; i < elementos.length; i++) {
            if (elementos[i] == null) {
                elementos[i] = elemento;
                break;
            }
        }
    }*/

    /*public void adicionar(String elemento) throws Exception {
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        } else {
            throw new Exception("Vetor já está cheio, não é possivel adionar mais elementos");
        }

    }*/

    public boolean adicionar(String elemento) {
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    public String busca(int posicao){
        if (!(posicao >= 0 && posicao < this.tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.elementos[posicao];
    }

    public int tamanho() {
         return this.tamanho;
    }

    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();
        s.append("{");
        for (int i = 0; i < this.tamanho -1; i++) {
            s.append(elementos[i] + ", ");
        }
        if (this.tamanho > 0) {
            s.append(elementos[this.tamanho -1]);
        }
        s.append("}");

        return s.toString();
    }

    /*@Override
    public String toString() {
        return "Vetor{" +
                "elementos=" + Arrays.toString(elementos) +
                ", tamanho=" + tamanho +
                '}';
    }*/
}
