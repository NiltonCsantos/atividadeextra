package org.no;

public class NoDuplo<T> {
    public T dado;
    public NoDuplo <T> prox;
    public NoDuplo <T> ant;

    public NoDuplo(T novoDado){
        this.dado=novoDado;
    }

}
