package ArvoreBinaria;

public class Arvore {

    No raiz;

    public Arvore(){
        raiz = null;
    }

    public void insere(int info){
        No novo = new No(info);
    }

    public void in_Ordem(No raiz) {
        if (raiz != null) {
            in_Ordem(raiz.esquerda);
            System.out.println(raiz.info);
            in_Ordem(raiz.direita);
        }
    }

    public void pre_Ordem (No raiz) {
        if (raiz != null) {
            System.out.println(raiz.info);
            in_Ordem(raiz.esquerda);
            in_Ordem(raiz.direita);
        }
    }
}
