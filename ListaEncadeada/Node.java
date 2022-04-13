package node;

import node.Node;

public class Node {
	private Integer informacao;
	private Node proximo;
	
	public Node() {
		informacao = null;
		proximo = null;
	}
	
	public int getValue() {
		if(informacao == null) {
			return 0;
		}else {
			return informacao;
		}
	}
	
	public int topo() {
		if(this.informacao == null) {
			return 0;
		}
		if(this.proximo != null) {
			return this.proximo.topo();
		}else {
			return this.informacao;
		}
	}
	
	public boolean vazia() {
		if(this.informacao == null) {
			return true;
		}
		return false;
	}
	
	public void inserePrimeiro(int info){
		if(this.informacao == null) {
			this.informacao = info;
		}else {
			int temp = this.informacao;
			
			this.informacao = info;
			
			Node tempNode = new Node();
			tempNode.informacao = temp;
			tempNode.proximo = this.proximo;
			
			this.proximo = tempNode;
		}
	}
	
	public void insereDepois(Node node,int info) {
		Node encontrado = procuraNode(node);
		if(encontrado == null) {
			System.out.print("Valor não encontrado em insereDepois.");
		}else {
			Node temp = new Node();
			temp.informacao = info;
			temp.proximo = encontrado.proximo;
			
			encontrado.proximo = temp;
		}
	}
	
	public void insereUltimo(int info) {
		if(this.informacao == null) {
			this.informacao = info;
		}else {
			if(this.proximo == null) {
				this.proximo = new Node();
				this.proximo.informacao = info;
			}else {
				this.proximo.insereUltimo(info); 
			}
		}
	}
	
	public void insereOrdenado(int info) {
		if(this.informacao == null) {
			this.informacao = info;		
		}else {
			if(this.informacao > info) {
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
		if(this.informacao == null) {
			return null;
		}
		
		if(this.informacao.equals(node.informacao)) {
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
		if(this.informacao == null) {
			//System.out.print("Lista Vazia");
		}else {
			
			System.out.print(this.informacao + "\t");
			
			if(this.proximo != null) {
				this.proximo.imprimir();	
			}
		}
	}
	
	public Node removePrimeiro() {
		if(this.informacao == null) {
			return null;
		}else {
			if(this.proximo != null) {
				
				Node temp = new Node();
				temp.informacao = this.informacao;
				temp.proximo = this.proximo;
				
				this.informacao = this.proximo.informacao;
				
				if(this.proximo.proximo != null) {
					
					this.proximo = this.proximo.proximo;
				}
				
				return temp;
				
			}else {
				Node temp = new Node();
				temp.informacao = this.informacao;
				
				this.informacao = null;
				
				return temp;
			}
		}
	}
	
	public Node removeUltimo() {
		if(this.informacao == null) {
			return null;
		}else {
			Node depois = this.proximo;
			if(depois == null) {
				Node temp = new Node();
				temp.informacao = this.informacao;
				
				this.informacao = null;
				return temp;
			}else {
				if(depois.proximo == null) {
					Node temp = new Node();
					temp.informacao = this.proximo.informacao;
					
					this.proximo = null;
					return temp;
				}else {
					return this.proximo.removeUltimo();
				}
			}
		}
	}
	public Node remove(int info) {
		if(this.informacao == null) {
			return null;
		}else {
			if(this.informacao == info) {
				
				Node temp = new Node();
				temp.informacao = this.informacao;
				
				this.informacao = null;
				
				return temp;
			}else {
				Node depois = this.proximo;
				if(depois == null) {
					return null;
				}else {
					if(depois.informacao == info) {
						
						Node temp = new Node();
						temp.informacao = depois.informacao;
						temp.proximo = depois.proximo;
						
						 if(depois.proximo != null) {
							 this.proximo.informacao = depois.proximo.informacao;
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
	public static void main(String[] args) {
		Node  lista = new Node();
		lista.insereOrdenado(10);
		lista.insereOrdenado(3);
		lista.insereOrdenado(14);
		lista.insereOrdenado(11);
		lista.insereOrdenado(1);
		lista.insereOrdenado(7);
		
		lista.imprimir();
		
	}

}
