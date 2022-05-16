package ArvoreBinaria;

public class Main_Arvore {
    public static void main(String[] args) {


        Tree tree = new Tree();
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
        int quatorze=14;
        int quinze=15;


        System.out.print("\nPRE-ORDER:");
        tree.preOrder(tree.root);

        System.out.print("\nIN-ORDER:");
        tree.inOrder(tree.root);

        System.out.print("\nPOS-ORDER:");
        tree.posOrder(tree.root);




    }
}
