package ListaEncadeada;

public class ListaEncadeada {

	private Node primeiro;
	private Node ultimo;
	private int tamanho;

	public ListaEncadeada() {
		this.tamanho = 0;
	}


    public Node getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(Node primeiro) {
        this.primeiro = primeiro;
    }

    public Node getUltimo() {
        return ultimo;
    }

    public void setUltimo(Node ultimo) {
        this.ultimo = ultimo;
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
        Node node = new Node(info);
        node.proximo= primeiro;
        primeiro=node;


        if(ultimo == null) {
            ultimo = primeiro;
        }
    }


    public void insereUltimo(int info) {
        if( ultimo== null) {
            inserePrimeiro(info);
        }else {
            Node node = new Node(info);
            ultimo.proximo=node;
            ultimo=node;
            tamanho++;
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

    public Node procuraNode(int info ) {
        Node node = ultimo;
        while(node != null){
            if(node.info == info){
                return node;
            }
            node = node.proximo;
        }
        return null;
    }

    public void imprimir() {
       Node temp = ultimo;
       while (temp != null){
           System.out.println(temp.info);
           temp=temp.proximo;
       }
    }

    public int removePrimeiro() {
        int info= ultimo.info;
        primeiro=primeiro.proximo;
        if(primeiro== null){
            ultimo=null;
        }
        tamanho++;
        return info;

    }


    public int removeUltimo() {
       if(tamanho <= 1){
           return removePrimeiro();
       }

       Node penultimo = get(tamanho-2);
       int info = ultimo.info;
       ultimo=penultimo;
       ultimo.proximo=null;
       tamanho--;
       return info;

    }
    public int remove(int indice) {
        if(indice == 0){
            return removeUltimo();
        }
        if(indice == tamanho -1){
            return removeUltimo();
        }
        Node prev = get( indice - 1 );
        int info = prev.proximo.info;
        prev.proximo = prev.proximo.proximo;
        tamanho--;
        return info + 1;

    }

    public void insereDepois(Node node,int info) {
        Node encontrado = procuraNode(node);
        if(encontrado == null) {
            System.out.print("Valor não encontrado em insere depois.");
        } else {
            Node temp = new Node();
            temp.info = info;
            temp.proximo = encontrado.proximo;

            encontrado.proximo = temp;
        }

    }




	public int ultimo_elemento(){

        //Node auxiliar = getUltimo();
        int last = ultimo.getValue();

        System.out.println("O ultimo elemento é: ") ; return last;

	}



    public Node get(int indice){
        Node node = primeiro;
        for(int i = 0;i < indice;i++){
            node=node.proximo;
        }
        return node;
    }

    public int retira_depois(Node no) {



    }


	
}


