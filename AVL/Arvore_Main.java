

// Trabalho desenvolvido, revisado e refatorado por:
// JHONATAN BATISTA DOS SANTOS E VINICIUS CARVAHO LEPREVOST

package AVL;

import java.io.*;
import java.util.HashMap;

public class Arvore_Main {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        buscarTermo("C:\\Users\\jntd\\Downloads\\arquivos", "loraine");
    }


    public static void buscarTermo(String diretorio, String termo) throws IOException {

        System.out.println();
        System.out.println("-------------------------BUSCAR TERMO-------------------------");

        File directory = new File(diretorio);

        File[] list_arquivos = directory.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".txt");
            }
        });

        ArvoreAVL arvore = new ArvoreAVL();

        for (File arquivo: list_arquivos) {
            BufferedReader buffRead = new BufferedReader(new FileReader(arquivo));

            String linha;
            HashMap<String, Integer> palavra_map = new HashMap<>();

            while (true) {
                linha = buffRead.readLine();

                if (linha == null) break;

                for (String palavraLinha : linha.split(" ")) {
                    if (palavra_map.get(palavraLinha) == null) palavra_map.put(palavraLinha, 0);
                    palavra_map.put(palavraLinha, palavra_map.get(palavraLinha) + 1);
                }
            }

            buffRead.close();
            palavra_map.forEach((s, integer) -> {
                arvore.inserir(new Elemento(s,integer));
            });

            System.out.println(arquivo.getName() + ": " + (palavra_map.get(termo) != null ? palavra_map.get(termo) : "Termo não encontrado!"));
        }

        System.out.println("IN_ORDER");
        arvore.imprimirInOrdem();

        System.out.println();

        System.out.println("PRE_ORDER");
        arvore.imprimirPreOrdem();

        System.out.println();
        System.out.println("POS_ORDER");
        arvore.imprimirPosOrdem();

        System.out.println();
        System.out.println("Altura da árvore: " + arvore.calcularAltura());
        System.out.println("Valor da busca existe: " + arvore.busca(14));


        arvore.isEmpty();
        arvore.calcularAltura();


    }
}
