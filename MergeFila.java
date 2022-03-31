/*
public class MergeFila {

    public Fila MergeFila(Fila filaA, Fila filaB ){

        int tamanhoFilaC = filaA.tamanho + filaB.tamanho;
        Fila filaC = new Fila(tamanhoFilaC);



        for(int contador=0; contador < tamanhoFilaC; contador++ )
        {

            if(filaA.primeiro < filaB.primeiro)
            {
                filaC.insere(filaA.primeiro);
                System.out.println("inserindo em C o elemento " + filaA.dados[filaA.primeiro]);

            }
            else if ( filaA.primeiro >= filaB.primeiro){
                filaC.insere(filaB.remove());
            }
            else if(filaA.filaVazia()){

                for (int i=0;i>filaB.tamanho;i++){
                    filaC.insere(filaB.remove());
                }
            }
            else if (filaB.filaVazia()){
                for(int i=0;i > filaA.tamanho;i++){

                    filaC.insere(filaA.remove());

                }

            }

        }

        return filaC;
    }



}
*/