package ListaEncadeada;

class No{
    No no;
    int info;

}


public class ListaSimples {
    No comeco = null;
    int tamanho = 0;



    public int retirarInicio(){
        if(comeco == null){
            return null;
        }
        int info = comeco.info;
        tamanho--;
        return info;


    }




}
