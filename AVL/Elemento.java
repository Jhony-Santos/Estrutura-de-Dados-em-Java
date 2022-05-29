// Trabalho desenvolvido, revisado e refatorado por:
// JHONATAN BATISTA DOS SANTOS E VINICIUS CARVAHO LEPREVOST

package AVL;

public class Elemento {

    private String info;
    private int dado;

    public Elemento(String info, int dado){
        this.info = info;
        this.dado = dado;
    }

    public void setValor(int valor){
        this.dado = valor;
    }
    public int getValor(){
        return this.dado;
    }

    public String getInfo() {
        return info;
    }
}

