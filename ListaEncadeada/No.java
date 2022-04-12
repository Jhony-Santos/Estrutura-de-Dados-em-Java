package ListaEncadeada;

public class No {

    private int info; // informacao armazenada
    private No prox; // ponteiro para o próximo elemento

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public No getProx() {
        return prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }
}
