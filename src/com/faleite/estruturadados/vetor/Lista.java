package com.faleite.estruturadados.vetor;

import java.lang.reflect.Array;

public class Lista<T> {

    private T[] elementos;
    private int tamanho;


    // Primeira solução (melhor)
    public Lista(int capacidade){
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    // Segunda solução
    public Lista(int capacidade, Class<T> tipoClasse){
        this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
        this.tamanho = 0;
    }

    public boolean adiciona(T elemento) {

        this.aumentaCapacidade();

        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }

        return false;
    }

    public boolean adiciona(int posicao, T elemento) {

        if (!(posicao >= 0 && posicao < this.tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }

        this.aumentaCapacidade();

        /*
         * i = tamanho do vetor - 1
         * posicçao = a posição onde colocaremos o elemento
         * "Interamos i do final até o inicio ou do final até a posição desejada"
         * "Ao invés de incrementar temos que DECREMENTAR"
         *
         * 0 1 2 3 4 5 6 = tamanho é 5
         * B C E F G + +
         *
         * */

        // Mover todos os elementos
        for (int i = this.tamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];

        }

        // Adiciona o elemento na posição desejada
        this.elementos[posicao] = elemento;
        this.tamanho++;

        return true;
    }

    private void aumentaCapacidade() {

        if (this.tamanho == this.elementos.length) {
            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++){
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }

    }

    public Object busca(int posicao){

        if (!(posicao >= 0 && posicao < this.tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }

        return this.elementos[posicao];
    }

        /*public boolean contem(T elemento){

        for (int i = 0; i < this.elementos.length; i++){
            if (this.elementos[i].equals(elemento)){
                return true;
            }
        }
        return false;
    }*/

    public boolean contem(T elemento){

        return busca(elemento) > -1;
    }

    public int busca(T elemento){

        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }

    public int tamanho() {

        return this.tamanho;
    }

    /*
     * B G D E F -> posição a ser removida é 1 (G)
     * 0 1 2 3 4 -> tamanho é 5
     * vetor[1] = vetor[2]
     * vetor[2] = vetor[3]
     * vetor[3] = vetor[4]
     * */
    public void remove(int posicao) {
        if (!(posicao >= 0 && posicao < this.tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }

        for (int i = posicao; i < this.tamanho - 1; i++) {
            this.elementos[i] = this.elementos[i + 1];
        }
        this.tamanho--;
    }


/*    public int ultimoIndice(T elemento){

        int index = -1;
        for (int i = 0; i < this.elementos.length; i++){
            if (this.elementos[i].equals(elemento)){
                index = i;
            }
        }
        return index;
    }*/

    // Melhor forma é olhar de tras para frente
    public int ultimoIndice(T elemento){

        for (int i = this.elementos.length - 1; i >= 0; i--){
            if (this.elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
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
