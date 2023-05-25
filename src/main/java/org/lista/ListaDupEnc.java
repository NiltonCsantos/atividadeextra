package org.lista;


import org.no.NoDuplo;

public class ListaDupEnc<T extends Comparable<T>> extends Lista<T>{

    private NoDuplo<T> inicio;
    private int tamanho;


    @Override
    public void Lista() {
        super.Lista();
    }

    @Override
    public void incluir(T elemento) throws Exception {

        NoDuplo<T> novoDado= new NoDuplo<>(elemento);

        if (this.inicio==null){
            this.inicio=novoDado;
            this.tamanho++;
        }else{

            NoDuplo<T> aux= this.inicio;

            for (int i = 0; i <this.tamanho-1 ; i++) {

                aux=aux.prox;

            }

            aux.prox=novoDado;
            novoDado.ant=aux;

            this.tamanho++;
        }

    }

    @Override
    public void incluirInicio(T elemento) throws Exception {

        NoDuplo <T> dado= new NoDuplo<>(elemento);

        dado.prox=this.inicio;

        this.inicio.ant=dado;

        this.inicio=dado;

        this.tamanho++;

    }

    @Override
    public void incluir(T elemento, int posicao) throws Exception {



        if(this.inicio==null){

            incluir(elemento);

        } else if (posicao==0 && this.tamanho>0) {

            incluirInicio(elemento);

        }else  if (posicao>=this.tamanho || posicao<0){

            throw new Exception("posição inválida!");

        }  else{
            NoDuplo<T> aux= new NoDuplo<>(elemento);

            NoDuplo<T> novoDado= new NoDuplo<>(elemento);

            NoDuplo<T> anterior= null;

            aux=this.inicio;

            for (int i = 0; i<posicao-1 ; i++) {

                aux=aux.prox;

            }

            anterior=aux;

            aux=aux.prox;

            anterior.prox= novoDado;
            novoDado.ant=anterior;

            novoDado.prox=aux;
            aux.ant=novoDado;

            this.tamanho++;

        }

    }

    @Override
    public T get(int posicao) throws Exception {
        return null;
    }

    @Override
    public int get(T elemnto) throws Exception {
        return 0;
    }

    @Override
    public void remover(int posicao) throws Exception {

    }

    @Override
    public void limpar() {

    }

    @Override
    public int getTamanho() {
        return 0;
    }

    @Override
    public boolean contem(T elemento) throws Exception {
        return false;
    }

    @Override
    public Lista<T> subLista(int posInicial, int posFinal) throws Exception {

        if (posInicial>= this.tamanho || posFinal>= this.tamanho){
            throw new Exception("indíce inválido!");
        }

        if (posInicial<0 || posFinal<0){
            throw new Exception("indíce inválido!");
        }

        Lista listaAuxliar = new ListaDupEnc();

        NoDuplo<T> aux= this.inicio;


        if (posInicial>posFinal) {

            for (int i = 0; i <posInicial ; i++) {
                aux=aux.prox;
            }

            for (int i = posInicial; i >=posFinal ; i--) {

                listaAuxliar.incluir(aux.dado);
                aux=aux.ant;

            }


        }else{

            for (int i = 0; i <posInicial ; i++) {

                aux=aux.prox;

            }


            for (int i = posInicial; i <=posFinal ; i++) {

                listaAuxliar.incluir(aux.dado);
                aux=aux.prox;

            }

        }

        return listaAuxliar;
    }

}



