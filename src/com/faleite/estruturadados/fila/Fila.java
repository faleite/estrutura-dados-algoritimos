package com.faleite.estruturadados.fila;

import com.faleite.estruturadados.base.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica<T> {

    public Fila() {
        super();
    }

    public Fila(int capacidade) {
        super(capacidade);
    }

    public boolean enfileira(T elemento){
        /*
        this.elementos[this.tamanho] = elemento;
        this.tamanho++;
         */

        // this.elementos[this.tamanho++] = elemento;

        this.adiciona(elemento);

        return true;
    }

    public T espiar(){
        if (this.estaVazia()){
            return null;
        }

        return this.elementos[0];
    }

    public T desinfileirar(){

        final int POS = 0;

        if (this.estaVazia()){
            return null;
        }

        T elementoASerRemovido = this.elementos[POS];

        this.remove(POS);

        return elementoASerRemovido;
    }
}
