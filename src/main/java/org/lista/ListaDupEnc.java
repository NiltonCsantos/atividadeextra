package org.lista;


import org.no.NoDuplo;

public class ListaDupEnc<T extends Comparable<T>> extends Lista<T>{

    private NoDuplo<T> inicio;

    private int tamanho;

    public NoDuplo<T> getInicio() {
        return inicio;
    }

    public void setInicio(NoDuplo<T> inicio) {
        this.inicio = inicio;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {

        String listaCompleta="";

        NoDuplo<T> aux= this.inicio;

        for (int i = 0; i <this.tamanho ; i++) {

            listaCompleta+=aux.dado+"\t";

            aux=aux.prox;

        }

        return  listaCompleta;

    }

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

    }

    @Override
    public void incluir(T elemento, int posicao) throws Exception {

        NoDuplo<T> aux= new NoDuplo<>(elemento);

        if(posicao==0 && this.tamanho==0){

            this.inicio=aux;
            setTamanho(this.tamanho+1);

        } else if (posicao==0 && this.tamanho>0) {

            aux.prox=this.inicio;

            this.inicio.ant=aux;

            this.inicio=aux;

            setTamanho(this.tamanho+1);

        } else  if (posicao>=this.tamanho || posicao<0){

            throw new Exception("posição inválida!");

        }else{

            NoDuplo<T> novoDado= new NoDuplo<>(elemento);

            NoDuplo<T> anterior= null;


            aux=this.inicio;

            for (int i = 0; i<posicao ; i++) {

                if (i==posicao-1){

                    anterior=aux;

                }

                aux=aux.prox;

            }

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

        NoDuplo<T> aux= this.inicio;
        int count=0;

        Lista listaAuxliar = new ListaDupEnc();

        for (int i = 0; i <posInicial ; i++) {

            aux=aux.prox;

        }



        for (int i = posInicial; i <=posFinal ; i++) {

            listaAuxliar.incluir(aux.dado);
            aux=aux.prox;

        }


        return listaAuxliar;
    }

    public void listarContrario(){

        NoDuplo<T> aux= this.inicio;

        for (int i = 0; i <this.tamanho-1; i++) {

            aux=aux.prox;

        }


        for (int i = this.tamanho; i >0 ; i--) {

            System.out.print(aux.dado+"\t");
            aux=aux.ant;

        }
    }
}

