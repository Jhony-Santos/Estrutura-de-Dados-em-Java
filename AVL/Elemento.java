package AVL;


    public class Elemento{

        private int dado;
        private String palavra;



        public Elemento(String palavra,int dado){
            this.dado = dado;
            this.palavra = palavra;
        }
        public Elemento(int dado){
            this.dado = dado;
        }
        public void setDado(int dado){
            this.dado = dado;
        }
        public String getPalavra(){
            return this.palavra;
        }
        public void setPalavra(String palavra){
            this.palavra = palavra;
        }
        public int getDado(){
            return this.dado;
        }
    }

