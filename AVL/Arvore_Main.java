package AVL;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Arvore_Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader("C:\\Users\\jntd\\AppData\\Roaming\\JetBrains\\IntelliJIdea2021.3\\scratches\\scratch.txt"));

        String linha;
        String[] palavrasLinha;
        HashMap<String, Integer> agrupaPalavras = new HashMap<>();
        while(true) {
            linha = buffRead.readLine();
            if(linha != null){
                palavrasLinha = linha.split(" ");
                for (String palavraLinha :
                        palavrasLinha) {
                    if(agrupaPalavras.get(palavraLinha) == null){
                        agrupaPalavras.put(palavraLinha,0);
                    }
                    agrupaPalavras.put(palavraLinha,agrupaPalavras.get(palavraLinha)+1);
                }
            }else{
                break;
            }
        }
        buffRead.close();
        ArvoreAVL arvore = new ArvoreAVL();
        agrupaPalavras.forEach((s, integer) -> {
            arvore.inserir(new Elemento(s,integer));
        });
        System.out.println("IN_ORDER");
        arvore.imprimirInOrdem();

        System.out.println();

        System.out.println("PRE_ORDER");
        arvore.imprimirPreOrdem();

        System.out.println();
        System.out.println("POS_ORDER");
        arvore.imprimirPosOrdem();

        System.out.println(arvore.calcularAltura());
        System.out.println(arvore.busca(14));

        arvore.isEmpty();
        arvore.calcularAltura();
    }
    public static void main2(String[] args) {

        ArvoreAVL arvore = new ArvoreAVL();

        arvore.inserir(new Elemento(10));
        arvore.inserir(new Elemento(5));
        arvore.inserir(new Elemento(1));
        arvore.inserir(new Elemento(8));
        arvore.inserir(new Elemento(15));
        arvore.inserir(new Elemento(12));
        arvore.inserir(new Elemento(18));

        System.out.println("IN_ORDER");
        arvore.imprimirInOrdem();

        System.out.println();

        System.out.println("PRE_ORDER");
        arvore.imprimirPreOrdem();

        System.out.println();
        System.out.println("POS_ORDER");
        arvore.imprimirPosOrdem();

        System.out.println(arvore.calcularAltura());
        System.out.println(arvore.busca(14));

        arvore.isEmpty();
        arvore.calcularAltura();

    }
}
