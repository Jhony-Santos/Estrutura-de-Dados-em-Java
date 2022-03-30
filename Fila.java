

public class Fila {
    public int primeiro;
    public int ultimo;
    public int dados[];
    public int tamanho;
    public int MAX;


    public int [] getVetor(){
        return this.dados;
    }

    public Fila(int tamanho)
    {
        this.dados = new int[tamanho];
        this.primeiro = 0;
        this.ultimo = -1;
        this.tamanho=0;
        this.MAX = tamanho;

    }

    public boolean filaVazia(){
        return this.tamanho == 0;
    }

    public boolean filaCheia(){
        return tamanho == dados.length;
    }


    public int insere(int E)
    {
        if (this.filaCheia() == true){
            System.out.println("A pilha está cheia Fabricio");
            return 0;
        }
        // ocorrendo a primeira inserção na array
        else if(this.ultimo == -1){
            this.dados[primeiro] = E;
            ultimo=incrementar(ultimo);
            tamanho+=1;
            System.out.println("O primeiro elemento foi inserido na posição: "+ primeiro);
            return E;
        }
        else{
            ultimo=incrementar(ultimo);
            this.dados[ultimo]=E;
            System.out.println("O último elemento foi inserido na posição: "+ ultimo);
            tamanho+=1;
            return E;
        }
    }

    // estando a pilha vazia ou não, desde esteja com elementos
    public int remove()
    {
        if(filaVazia()==false){
            int itemRemovido = this.dados[primeiro]; // excluo o elemento que está no primeiro índice
            System.out.println("Removido o item na posição: " + primeiro);
            primeiro=incrementar(primeiro);
            tamanho+=1;
            return primeiro;
        }
        else
        {
            System.out.println("Pilha vazia Fabricio, não há o que remover");
            return 0;
        }
    }


    public int incrementar(int parametro)
    {
        if(parametro==this.dados.length-1){
            return 0;
        }
        else {
            return parametro+=1;
        }

    }


    public int mostrarPrimeiro(){
        return this.dados[primeiro];
    }


    public void mostrarElementos(){
        int first = this.primeiro;
        System.out.println(this.dados[first]);

        for(int mostrador=1; mostrador < this.tamanho; mostrador++){
            first= this.incrementar(first);
            System.out.println(this.dados[first]);
        }

    }


    public static void main(String [] args) {

        Fila filaA = new Fila(4);
        filaA.insere(12);
        filaA.insere(35);
        filaA.insere(52);
        filaA.insere(64);

        Fila filaB = new Fila(5);
        filaB.insere(05);
        filaB.insere(15);
        filaB.insere(23);
        filaB.insere(55);



        Fila filamerge = null;
        filamerge=filamerge.merge(filaA, filaB);
        filamerge.mostrarElementos();

    }

        public Fila merge(Fila filaA, Fila filaB ){

            int tamanhoFilaC = filaA.tamanho + filaB.tamanho;
            Fila filaC = new Fila(tamanhoFilaC);



            for(int contador=0; contador < tamanhoFilaC; contador++ )
            {

                if(filaA.primeiro < filaB.primeiro)
                {
                    filaC.insere(filaA.primeiro);
                    filaA.remove();
                    //filaC.insere(filaA.remove());

                }
                else if ( filaA.primeiro >= filaB.primeiro){
                    filaC.insere(filaB.primeiro);
                    filaB.remove();

                    //filaC.insere(filaB.remove());
                }
                else if(filaA.filaVazia()){

                    for (int i=0;i>filaB.tamanho;i++){
                        filaC.insere(filaB.primeiro);
                        filaB.remove();
                        //filaC.insere(filaB.remove());
                    }
                }
                else if (filaB.filaVazia()){
                    for(int i=0;i > filaA.tamanho;i++){

                        filaC.insere(filaA.primeiro);
                        filaA.remove();
                        //filaC.insere(filaA.remove());

                    }



                }

            }

            return filaC;
        }

    }



