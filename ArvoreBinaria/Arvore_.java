package ArvoreBinaria;

public class Arvore_ {

    No_ raiz;

    public Arvore_(){
        raiz = null;
    }

    public void insere(int info){
        No_ novo = new No_(info);
    }

    public void in_Ordem(No_ raiz) {
        if (raiz != null) {
            in_Ordem(raiz.esquerda);
            System.out.println(raiz.info);
            in_Ordem(raiz.direita);
        }
    }

    public void pre_Ordem (No_ raiz) {
        if (raiz != null) {
            System.out.println(raiz.info);
            in_Ordem(raiz.esquerda);
            in_Ordem(raiz.direita);
        }
    }
}
