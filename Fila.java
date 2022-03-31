import java.sql.SQLOutput;
import java.util.Arrays;

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

    public void mostrarElementosDaFila() {
        for (int elemento : dados) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }

    public int filaPrimeiro() {
        return dados[primeiro];
    }

    public int filaUltimo(){
        return dados[ultimo];
    }


    public static Fila merge(Fila filaA, Fila filaB){

       Fila filaC = new Fila(filaA.tamanho + filaB.tamanho);

        int primeiroA = filaA.primeiro;
        int primeiroB = filaB.primeiro;
        int proximoC=0;


        while(primeiroA < filaA.tamanho && primeiroB < filaB.tamanho)
        {
            if (filaA.dados[primeiroA] <= filaB.dados[primeiroB]){
                filaC.dados[proximoC++]=filaA.dados[primeiroA++];
            } else {
                filaC.dados[proximoC++]=filaB.dados[primeiroB++];
            }
        }

        while(primeiroA < filaA.tamanho)
        {
            filaC.dados[proximoC++] = filaA.dados[primeiroA++];

        }

        while(primeiroB < filaB.tamanho)
        {
            filaC.dados[proximoC++] = filaB.dados[primeiroB++];
        }

        return filaC;


    }




    public static void main(String [] args) {

        Fila filaA = new Fila(7);
        filaA.insere(12);
        filaA.insere(35);
        filaA.insere(52);
        filaA.insere(64);




        Fila filaB = new Fila(5);
        filaB.insere(5);
        filaB.insere(15);
        filaB.insere(23);
        filaB.insere(55);
        filaB.insere(62);



        Fila filaC=Fila.merge(filaA,filaB );
        filaC.mostrarElementosDaFila();



    }

}



/* public Fila MergeFila(Fila filaA, Fila filaB ){

        int tamanhoFilaC = filaA.tamanho + filaB.tamanho;

        for(int contador=0; contador < (tamanhoFilaC-1); contador++ )
        {

            if(filaA.filaVazia()== false && filaB.filaVazia()== false){

                if(filaA.filaPrimeiro() < filaB.filaPrimeiro())
                {
                    this.insere(filaA.filaPrimeiro());
                    filaA.remove();

                }
                else if (filaA.filaPrimeiro() > filaB.filaPrimeiro()){
                    this.insere(filaB.filaPrimeiro());
                    filaB.remove();
                }

            }

            else if(filaA.filaVazia() == true){
               this.insere(filaB.filaPrimeiro());


            }
            else if (filaB.filaVazia() == true){
                this.insere(filaA.filaPrimeiro());
            }

        }

        return this;
    }*/