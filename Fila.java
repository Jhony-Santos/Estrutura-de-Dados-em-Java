

import java.util.Arrays;

public class Fila {
    public int primeiro;
    public int ultimo;
    public int dados[];
    public int contador;// responsável por verificar se a fila está vazia

    public int[] getVetor() {
        return this.dados;
    }

    public Fila(int tamanho) { // preciso saber o tamanho do vetor para utilizar na função filaCheia;
        this.dados = new int[tamanho];
        this.contador = 0;
        this.ultimo = -1;
        this.primeiro = 0;
    }

    public boolean filaCheia() {
        return contador == dados.length; // retorna true se atingiu o limite de armazenamento;
    }

    public boolean filaVazia() {
        return contador == 0;//retorna true se a pilha estiver vazia;
    }

    public int insere(int E) {
        if (this.filaCheia() == true) {
            System.out.println("CARA A PILHA JÁ ESTÁ CHEIA CHARA");
            return 0;// como esta retornando aqui, nao precisa do else, e tbm ja garante q a fila nao esta cheia nos metos abaixo
        }
        if (this.ultimo == -1) { // É a primeira vez que está ocorrendo uma inserção;
            this.dados[primeiro] = E;//não se preocupar, pois defini o que o primeiro elemento entrará na posição 0;
            ultimo = incrementar(ultimo);
            contador = contador + 1;
            System.out.println("O primeiro elemento foi inserido na posição: " + primeiro);
            return E;
        } else {
            ultimo = incrementar(ultimo);
            this.dados[ultimo] = E;
            System.out.println("O último elemento foi inserido na posição: " + ultimo);
            contador = contador + 1;
            return E;
        }
    }

    public int remove() {// a fila estando cheia ou não, desde que esteja com itens;
        if (filaVazia() == false) {
            int itemRemovido = this.dados[primeiro];// excluo o elemento que se encontra no índice primeiro
            System.out.println("removemos o item na posição " + primeiro);
            primeiro = incrementar(primeiro); //atualizo o índice primeiro, que passa a ser o próximo item do vetor
            contador = contador - 1;
            return primeiro;
        } else { // filaVazia == true;
            System.out.println("NÃO HÁ O QUE REMOVER, POIS A FILA ESTÁ VAZIA");
            return 0;
        }
    }

    public int incrementar(int parametro) {
        if (parametro == this.dados.length - 1) {
            return 0;
        } else {
            return parametro = parametro + 1;
        }
    }

    public int mostrarPrimeiro() {
        return this.dados[primeiro];
    }


    public void mostrarElementos() {
        int first = this.primeiro;
        System.out.println(this.dados[first]);

        for (int mostrador = 1; mostrador < this.contador; mostrador++) {
            first = this.incrementar(first);
            System.out.println(this.dados[first]);

        }

    }


    public static void main(String[] args) {

        Fila fila = new Fila(4); // vetor de 5 posições


        fila.insere(44);
        fila.insere(45);
        fila.insere(46);
        fila.insere(104);

        fila.remove();
        fila.remove();
        fila.remove();


        fila.insere(101);
        fila.insere(102);
        fila.insere(103);


        //System.out.println(file.mostrarPrimeiro());

        fila.mostrarElementos();


        System.out.println(fila.filaVazia());
        //System.out.println(file.filaCheia());
        System.out.println(fila.contador);


    }


}


