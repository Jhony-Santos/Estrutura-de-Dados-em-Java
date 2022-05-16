package ArvoreBinaria;

import java.sql.SQLOutput;

public class Tree {

    Node root = null;
    int size=0;


    void insert(int info, Node place){ // inserindo pela primeira vez

        if (place == null) {
            root = new Node(info);

        } else if (info < place.info){ // devo inserir na esquerda

            if (place.left == null){
                System.out.print(" " + info);
                place.left=new Node(info);
            } else {
                insert(info,place.left);
            }

        } else if (info > place.info){ //devo inserir na direita
            if(place.right == null){
                System.out.print(" " + info);
                place.right=new Node(info);
            } else {
                insert(info, place.right);
            }
        }
    }


    void preOrder(Node place) {
        System.out.print(" " + place.info);
        if(place.left != null){
            preOrder(place.left);
        }
        if(place.right != null){
            preOrder(place.right);
        }
    }

    void inOrder(Node place){
        if(place.left!=null){
            inOrder(place.left);
        }
        System.out.print(" " + place.info );
        if(place.right != null){
            inOrder(place.right);
        }
    }

    void posOrder(Node place){
        if(place.left != null){
            posOrder(place.left);
        }
        if(place.right != null){
            posOrder(place.right);
        }
        System.out.print(" " + place.info);
    }



}

// COMENTÁRIOS

/*

a diferença entre o pre-order e o inorder se dá no momento de imprimir os elementos, no preOrder é imprimido antes, já no
    inOrder é imprimido depois


remoção:
    - não tem filho
    - tem filho apenas de um lado
    - tem filhos de ambos os lados



*/