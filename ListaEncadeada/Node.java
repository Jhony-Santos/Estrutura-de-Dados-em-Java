package ListaEncadeada;

import static jdk.nashorn.internal.runtime.regexp.joni.Syntax.Java;

public class Node {

	private Integer info;
	private Node proximo;
	
	public Node() {
		info = null;
		proximo = null;
	}
	
	public int getValue() {
		if(info == null) {
			return 0;
		}else {
			return info;
		}
	}
	
	public int topo() {
		if(this.info == null) {
			return 0;
		}
		if(this.proximo != null) {
			return this.proximo.topo();
		}else {
			return this.info;
		}
	}
	
	public boolean vazia() {
		if(this.info == null) {
			return true;
		}
		return false;
	}
	
	public void inserePrimeiro(int info){
		if(this.info == null) {
			this.info = info;
		}else {
			int temp = this.info;
			
			this.info = info;
			
			Node tempNode = new Node();
			tempNode.info = temp;
			tempNode.proximo = this.proximo;
			
			this.proximo = tempNode;
		}
	}
	

	public void insereUltimo(int info) {
		if(this.info == null) {
			this.info = info;
		}else {
			if(this.proximo == null) {
				this.proximo = new Node();
				this.proximo.info = info;
			}else {
				this.proximo.insereUltimo(info); 
			}
		}
	}
	
	public void insereOrdenado(int info) {
		if(this.info == null) {
			this.info = info;
		}else {
			if(this.info > info) {
				this.inserePrimeiro(info);
			}else {
				if(this.proximo == null) {
					this.insereUltimo(info);
				}else {
					this.proximo.insereOrdenado(info);	
				}
			}
		}
	}
	
	public Node procuraNode(Node node) {
		if(this.info == null) {
			return null;
		}
		
		if(this.info.equals(node.info)) {
			return this;
		}else {
			if(this.proximo == null) {
				return null;
			}else {
				return this.proximo.procuraNode(node);
			}
		}
	}
	
	public void imprimir() {
		if(this.info == null) {
			//System.out.print("Lista Vazia");
		}else {
			
			System.out.print(this.info + "\t");
			
			if(this.proximo != null) {
				this.proximo.imprimir();	
			}
		}
	}
	
	public Node removePrimeiro() {
		if(this.info == null) {
			return null;
		}else {
			if(this.proximo != null) {
				
				Node temp = new Node();
				temp.info = this.info;
				temp.proximo = this.proximo;
				
				this.info = this.proximo.info;
				
				if(this.proximo.proximo != null) {
					
					this.proximo = this.proximo.proximo;
				}
				
				return temp;
				
			}else {
				Node temp = new Node();
				temp.info = this.info;
				
				this.info = null;
				
				return temp;
			}
		}
	}
	
	public Node removeUltimo() {
		if(this.info == null) {
			return null;
		}else {
			Node depois = this.proximo;
			if(depois == null) {
				Node temp = new Node();
				temp.info = this.info;
				
				this.info = null;
				return temp;
			}else {
				if(depois.proximo == null) {
					Node temp = new Node();
					temp.info = this.proximo.info;
					
					this.proximo = null;
					return temp;
				}else {
					return this.proximo.removeUltimo();
				}
			}
		}
	}
	public Node remove(int info) {
		if(this.info == null) {
			return null;
		}else {
			if(this.info == info) {
				
				Node temp = new Node();
				temp.info = this.info;
				
				this.info = null;
				
				return temp;
			}else {
				Node depois = this.proximo;
				if(depois == null) {
					return null;
				}else {
					if(depois.info == info) {
						
						Node temp = new Node();
						temp.info = depois.info;
						temp.proximo = depois.proximo;
						
						 if(depois.proximo != null) {
							 this.proximo.info = depois.proximo.info;
							 this.proximo.proximo = depois.proximo.proximo;
						 }else {
							 this.proximo = null;
						 }
						 
						 return temp;
					}else {
						return this.proximo.remove(info);
					}
					
				}
			}
		}
	}

	public void insereDepois(Node node,int info) {
		Node encontrado = procuraNode(node);
		if(encontrado == null) {
			System.out.print("Valor não encontrado em insereDepois.");
		}else {
			Node temp = new Node();
			temp.info = info;
			temp.proximo = encontrado.proximo;

			encontrado.proximo = temp;
		}

	}




	public void remove_depois(Node no)
	{

		Node encontrar=procuraNode(no);
		if(encontrar == null) {
			System.out.print("Valor não encontrado");
		}
		else
		{
			if(no.proximo==null){
				System.out.println("Não é possível remover pois é o último nó");
			}
			else
			{
				//no.remove(no.proximo.info);
				//Node removido = no.remove(no.proximo.info);
				//System.out.println("Nó removido: " + removido.info);
			}

		}

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



		lista.remove_depois(lista.proximo);
		lista.imprimir();
		

		
	}

}
