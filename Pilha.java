



public class Pilha {
    public int topo;//defino o topo
    public String[] vetor; //a expressão de entrada
    boolean confereInvalida=false;

    public Pilha(int tamanhoVetor){
        this.vetor = new String [tamanhoVetor];
        this.topo=-1;
    }

    public String mostrarTopo(){
        return this.vetor[topo];
    }
    public boolean pilhaCheia(){
           return topo==this.vetor.length-1;// se o topo for igual ao máximo então retorna true
    }
    public boolean pilhaVazia(){
           return topo==-1;  // retorna true se  pilha está vazia
    }
    public int empilha(String elemento){
       if(this.pilhaCheia()==false){
           topo=topo+1;
           this.vetor[topo]=elemento;
           return topo;
        }else{
           System.out.println("Não podemos mais empilhar Fabricio!!!!");
            return 0;
        }
    }
    public String desempilha(){
        if(this.pilhaVazia()==false){
            String valorTopo=vetor[topo];
            topo=topo-1;
            System.out.println("O valor desempilhado foi " + valorTopo);
           return valorTopo;

        } else {

            return null;
        }
    }
    public void conferirExpressao(){
        if(this.pilhaVazia()==true && this.confereInvalida==false){
            System.out.println("EXPRESSÃO VÁLIDA");
        }else{
            System.out.println("EXPRESSÃO INVÁLIDA");
        }
    }
    public static void main(String []args){

    String expressao="(((1+2)-3)*6)";
    //Pilha pilha=new Pilha(expressao.length());

    Pilha pilha = new Pilha(expressao.length());//instanciei a classe

    for(char c:expressao.toCharArray()){

        if((c=='('||c=='['||c=='{') && pilha.pilhaCheia()== false){
            pilha.empilha(String.valueOf(c));
            System.out.println("Valor empilhado " + c);
        }else if((c==')'||c==']' || c=='}') && pilha.pilhaVazia()== false){
            char Topo= pilha.desempilha().charAt(0);// pega o último valor da pilha
            if(Topo=='(' && c!=')'||Topo=='['&& c!=']'|| Topo=='{' && c!='}')
            {pilha.confereInvalida=true;}
        }else if(( c == ')' || c == ']' || c== '}')  &&  pilha.pilhaVazia()== true){
            pilha.confereInvalida=true;
            break;
        }

    }

    pilha.conferirExpressao();

    }


}







