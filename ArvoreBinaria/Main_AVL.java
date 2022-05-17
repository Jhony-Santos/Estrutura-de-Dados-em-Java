package ArvoreBinaria;

import java.sql.SQLOutput;

public class Main_AVL {

    public static void main(String[] args) {
        AVL avl = new AVL();

        avl.insere_elemento(10);
        avl.insere_elemento(5);
        avl.insere_elemento(1);
        avl.insere_elemento(7);
        avl.insere_elemento(2);
        avl.insere_elemento(20);
        avl.insere_elemento(33);
        avl.insere_elemento(30);


        /*System.out.println("INORDER");
        avl.inOrder(avl.raiz);*/

        System.out.println("IN_ORDEM");
        avl.IN_ORDER(avl.raiz);

        System.out.println("PRÉ_ORDEM");
        avl.PRE_ORDER(avl.raiz);

        System.out.println("PÓS_ORDEM");
        avl.posOrder(avl.raiz);

        System.out.println(avl.raiz.getDado());





    }
}
