package ListaEncadeada;
/*
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


    public boolean vazia() {
        if(primeiro == null) {
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


    public void insere_ordenado(int info) {
        if(this.primeiro == null || info<this.primeiro.info){
            inserePrimeiro(info);
        }
        else{

            Node noAtual=primeiro;
            while(noAtual.proximo != null &&noAtual.proximo.info < info){
                noAtual = noAtual.proximo;
            }
            Node no_ordenado = new Node(info);
            no_ordenado.proximo= noAtual.proximo;
            noAtual.proximo=no_ordenado;
        }

    }




    public Node procuraNode(int info) {

        if(this.primeiro == null || info == this.primeiro.info){
            return primeiro;

        }

        Node noAtual=primeiro;
        while(noAtual != null && noAtual.info != info){
            noAtual = noAtual.proximo;
        }
        return noAtual;

    }

    public void imprimir() {
       Node temp = primeiro;
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
        return info;

    }

  	public int ultimo_elemento(){

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

    public int retira_depois(Node valorRecebido) {

        Node valorCaiFora = valorRecebido.proximo;
        valorRecebido.proximo = valorCaiFora.proximo;


       Node valorARemover = valorRemover.proximo;

        if(procuraNode(valorRemover.info)==null) {
            System.out.println("Valor não encontrado");
        }










        if(valorRemover!=null){
            valorRemover.proximo = valorARemover.proximo;
            return valorARemover.info;
        }
        //System.out.println("Foi removido o elemento");
         return valorARemover;
    }

}


*/