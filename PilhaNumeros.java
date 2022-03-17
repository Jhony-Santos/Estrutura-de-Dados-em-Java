
/*

public class Pilha {

        public int topo;
        private int max;
        public int[] numbers;

        public Pilha(int tamanho){
            this.topo=-1;
            this.numbers= new int[10];
            this.max=tamanho;
        }


        public int mostrarTopo(){
            return this.numbers[topo];
        }

        public boolean pilhaCheia(){
            return topo == this.numbers.length -1;
        }

        public boolean pilhaVazia(){
            return topo == -1;
        }

        public int empilhar(int elemento){

            if(this.pilhaCheia()==false)
            {
                topo+=1;
                this.numbers[topo]=elemento;
                return topo;
            }else
            {
                System.out.println("Pilha cheia");
                return 0;
            }
        }

        public int desempilha(){
            if(this.pilhaVazia()==false)
            {
                int valorTopo=numbers[topo];
                topo-=1;
                System.out.println("O valor desempilhado foi " + valorTopo);
                return valorTopo;
            }
            else{
                return 0;
            }


        }







}
*/