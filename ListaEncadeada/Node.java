package ListaEncadeada;


public class Node {

	int info;
	Node proximo;


    public Node(){}

    public Integer getInfo() {
        return info;
    }

    public void setInfo(Integer info) {
        this.info = info;
    }

    public Node getProximo() {
        return proximo;
    }

    public void setProximo(Node proximo) {
        this.proximo = proximo;
    }

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

    @Override
    public String toString() {
        return "Node{" +
                "info=" + info +
                ", proximo=" + proximo +
                '}';
    }
}



