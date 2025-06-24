package com.faleite.estruturadados;

import com.faleite.estruturadados.base.EstruturaEstatica;

public class Lista2<T> extends EstruturaEstatica<T> {

    public Lista2() {
        super();
    }

    public Lista2(int capacidade) {
        super(capacidade);
    }

    public boolean adiciona(T elemento) {
        return super.adiciona(elemento);
    }

    public boolean adiciona(int posicao, T elemento) {
        return super.adiciona(posicao, elemento);
    }

    public int busca(T elemento){
        return super.busca(elemento);
    }

    public T busca(int posicao){
        return super.busca(posicao);
    }

    public void remove(int posicao) {
      super.remove(posicao);
    }

    public boolean remove(T elemento) {
        return super.remove(elemento);
    }
}
