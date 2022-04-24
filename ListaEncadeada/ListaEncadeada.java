package ListaEncadeada;

/*
* primeiro
* ultimo
*
*
*
* */

public class ListaEncadeada {

	private Node primeiro;
	private Node ulitmo;
	private Node lista;

	public ListaEncadeada() {
		lista = null;
	}

	public int topo() {
		if(lista == null) {
			return 0;
		}else {
			return lista.topo();
		}
	}
	
	public boolean existe(int valor) {
		if(lista == null) {
			return false;
		}else {
			Node procura = new Node();
			procura.inserePrimeiro(valor);
			
			if(lista.procuraNode(procura) == null) {
				return false;
			}else {
				return true;
			}
		}
	}
	
	public void inserePrimeiro(int info) {
		if(lista == null) {
			lista = new Node();
		}
		lista.inserePrimeiro(info);
	}
	public void insereDepois(Node node,int info) {
		if(lista == null) {
			lista = new Node();
		}
		lista.insereDepois(node,info);
	}
	public void insereUltimo(int info) {
		if(lista == null) {
			lista = new Node();
		}
		lista.insereUltimo(info);
	}
	public void insereOrdenado(int info) {
		if(lista == null) {
			lista = new Node();
		}
		lista.insereOrdenado(info);
	} 
	public void imprime() {
		if(lista == null) {
			//System.out.println("\nLista Vazia");
		}else {
			lista.imprimir();
		}
	}
	public Node removePrimeiro() {
		if(lista == null) {
			return null;
		}
		return lista.removePrimeiro();
	}
	public Node removeUltimo() {
		if(lista == null) {
			return null;
		}
		return lista.removeUltimo();
	}
	public Node remove(int info) {
		if(lista == null) {
			return null;
		}else {
			return lista.remove(info);
		}
	}
	
	
}
