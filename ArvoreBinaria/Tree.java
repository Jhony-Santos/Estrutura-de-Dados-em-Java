package ArvoreBinaria;

public class Tree {

    Node root = null;
    int size=0;


    void insert(int info, Node place){
        // inserindo pela primeira vez
        if (place == null) {
            root = new Node(info);
        }else if(info < place.info){
            // devo inserir na esquerda
            if(place.left == null){
                place.left=new Node(info);
            }else{
                insert(info,place.left);
            }
        }else if(info > place.info){
            //devo inserir na direita
            if(place.right== null){
                place.right=new Node(info);
            }else{
                insert(info, place.right);
            }
        }
    }


    void preOrder(Node place) {
        System.out.println(" " + place.info);
        if(place.left!=null){
            preOrder(place.left);
        }
        if(place.right!=null){
            preOrder(place.right);
        }
    }




}
