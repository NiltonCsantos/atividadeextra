package org.lista;

public class Main {
    public static void main(String[] args) {

        ListaDupEnc<Integer> listaDupEnc= new ListaDupEnc<>();

        try {

            listaDupEnc.incluir(5,0);
            listaDupEnc.incluir(2,0);
            listaDupEnc.incluir(1,0);
            listaDupEnc.incluir(4,1);
            listaDupEnc.incluir(7,0);
            listaDupEnc.incluir(9,0);
            listaDupEnc.incluir(12,0);
            listaDupEnc.incluir(15,1);


            System.out.println(listaDupEnc);

            System.out.println("Teste\n");
//            listaDupEnc.listarContrario();


            System.out.println(listaDupEnc.subLista(6,7));


        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
