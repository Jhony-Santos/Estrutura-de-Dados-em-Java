package ListaEncadeada;

public class ListaEncadeada {

    private int posicao = 0;
    private No no;

    public static void main(String[] args) {

        ListaEncadeada lista = new ListaEncadeada();

        lista.inserePrimeiro(5);
        lista.insereDepois(new No, 10);
        lista.insereUltimo(15);


    }



    public void inserePrimeiro(int info)
    {
        No novo = new No();
        novo.setInfo(info);
        novo.setProx(primeiro);



    }

    private boolean vazia(){
        return true;
    }

    public void insereDepois(No no, int info){};

    public void insereUltimo(int info){};

    public void insereOrdenado(int info){};

    public void mostraLista(){}

    public int retiraPrimeiro(){};

    public int retiraUltimo(){};

    public int retiradepois(No no){};

    public int ultimoElemento(){}

}



