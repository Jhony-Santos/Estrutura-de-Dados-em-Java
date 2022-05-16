package ArvoreBinaria;

public class No {

    int dado;
    No pai;
    No esquerdo;
    No direito;
    int fator_balanceamento;


    public No(int dado){
        this.dado=dado;
        this.fator_balanceamento=0;
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public No getPai() {
        return pai;
    }

    public void setPai(No pai) {
        this.pai = pai;
    }

    public No getEsquerdo() {
        return esquerdo;
    }

    public void setEsquerdo(No esquerdo) {
        this.esquerdo = esquerdo;
    }

    public No getDireito() {
        return direito;
    }

    public void setDireito(No direito) {
        this.direito = direito;
    }

    public int getfator_balanceamento() {
        return fator_balanceamento;
    }

    public void setfator_balanceamento(int fator_balanceamento) {
        this.fator_balanceamento = fator_balanceamento;
    }
}
