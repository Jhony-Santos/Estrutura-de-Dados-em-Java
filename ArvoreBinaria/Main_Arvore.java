package ArvoreBinaria;

import java.util.Random;

public class Main_Arvore {
    public static void main(String[] args) {


        Tree tree = new Tree();

        tree.insert(10,tree.root);
        tree.insert(8,tree.root);
        tree.insert(5,tree.root);
        tree.insert(9,tree.root);
        tree.insert(7,tree.root);
        tree.insert(18,tree.root);
        tree.insert(13,tree.root);
        tree.insert(20,tree.root);

        System.out.print("\nPRE-ORDER:");
        tree.preOrder(tree.root);

        System.out.print("\nIN-ORDER:");
        tree.inOrder(tree.root);

        System.out.print("\nPOS-ORDER:");
        tree.posOrder(tree.root);




    }
}

  /*tree.insert(um, tree.root);
        tree.insert(dois, tree.root);
        tree.insert(tres, tree.root);
        tree.insert(quatro, tree.root);
        tree.insert(cinco, tree.root);
        tree.insert(seis, tree.root);
        tree.insert(sete, tree.root);
        tree.insert(oito, tree.root);
        tree.insert(nove, tree.root);
        tree.insert(dez, tree.root);
        tree.insert(onze, tree.root);
        tree.insert(doze, tree.root);
        tree.insert(treze, tree.root);
        tree.insert(quatorze, tree.root);


    int um=1;
    int dois=2;
    int tres=3;
    int quatro=4;
    int cinco=5;
    int seis=6;
    int sete=7;
    int oito=8;
    int nove=9;
    int dez=10;
    int onze=11;
    int doze=12;
    int treze=13;
    int quatorze=14; */
