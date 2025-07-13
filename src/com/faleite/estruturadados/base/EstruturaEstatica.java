package com.faleite.estruturadados.base;

public class EstruturaEstatica<T> {

    protected T[] elementos;
    protected int tamanho;

    public EstruturaEstatica(int capacidade){
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public EstruturaEstatica() {
        this(10);
    }

    protected boolean adiciona(T elemento) {

        this.aumentaCapacidade();

        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }

        return false;
    }

    protected boolean adiciona(int posicao, T elemento) {

        if (posicao < 0 || posicao > this.tamanho){
            throw new IllegalArgumentException("Posição inválida");
        }

        this.aumentaCapacidade();

        for (int i = this.tamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];

        }

        this.elementos[posicao] = elemento;
        this.tamanho++;

        return true;
    }

    protected int busca(T elemento){

        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }

    protected T busca(int posicao){

        if (!(posicao >= 0 && posicao < this.tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }

        return this.elementos[posicao];
    }

    protected void remove(int posicao) {
        if (!(posicao >= 0 && posicao < this.tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }

        for (int i = posicao; i < this.tamanho - 1; i++) {
            this.elementos[i] = this.elementos[i + 1];
        }
        this.tamanho--;
    }

    protected boolean remove(T elemento) {

        int elemIndex = busca(elemento);
        if (elemIndex > -1) {
            this.remove(elemIndex);
            return true;
        }
        return false;
    }

    @SuppressWarnings("unchecked")
    private void aumentaCapacidade() {

        if (this.tamanho == this.elementos.length) {
            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++){
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }

    }

    public int tamanho() {

        return this.tamanho;
    }

    public boolean estaVazia(){
        return this.tamanho == 0;
    }

    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < this.tamanho -1; i++) {
            s.append(elementos[i] + ", ");
        }

        if (this.tamanho > 0) {
            s.append(elementos[this.tamanho -1]);
        }

        s.append("]");

        return s.toString();
    }
}
