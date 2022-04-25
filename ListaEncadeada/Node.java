package ListaEncadeada;


public class Node {

	private int info;
	private Node proximo;
	


    public Node(int info){
        this.info = info;
    }

    public Node(int info, Node proximo){
        this.info=info;
        this.proximo=proximo;
    }







	
















	public static void main(String[] args) {
		Node  lista = new Node();
		lista.insereOrdenado(10);
		lista.insereOrdenado(3);
		lista.insereOrdenado(14);
		lista.insereOrdenado(11);
		lista.insereOrdenado(1);
		lista.insereOrdenado(7);
		lista.inserePrimeiro(0);
		lista.insereUltimo(12);
		lista.imprimir();
		String espaco=("\n");



		lista.retira_depois(lista.proximo);
		lista.imprimir();
		

		
	}

}



/*public int getValue() {
		if(info == null) {
			return 0;
		}else {
			return info;
		}
	}*/