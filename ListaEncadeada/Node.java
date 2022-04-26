package ListaEncadeada;


public class Node {

	int info;
	Node proximo;


    public Node(){}

    public Node(int info){
        this.info = info;
    }

    public Node(int info, Node proximo){
        this.info=info;
        this.proximo=proximo;
    }

    public int getValue() {
        if(info == 0) {
            return 0;
        } else {
            return info;
        }
    }






	


















}



/*public int getValue() {
		if(info == null) {
			return 0;
		}else {
			return info;
		}
	}*/