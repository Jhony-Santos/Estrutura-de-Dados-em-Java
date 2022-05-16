package ArvoreBinaria;

// grau: é um número de filhos que determinado nó possui

public class AVL {

    public No raiz;

    public void insere_elemento (int dado) {
        No no= new No(dado);
        if (raiz == null) {
            System.out.println(dado + " inserido na raiz");
            raiz = no;
        } else {
            No pai = encontrarPai(dado, raiz);
            no.setPai(pai);
            if (pai.getDado() > dado) {
                System.out.println(dado + " inserido a esquerda de " + pai.getDado());
                pai.setEsquerdo(no);
            } else if(pai.getDado() < dado) {
                System.out.println(dado + " inserido a direita de " + pai.getDado());
                pai.setDireito(no);
            }
            fator_balanceamento(no.getDado(), pai, 1);
        }
    }

    public No encontrarPai(int valor, No no){
        if (valor < no.getDado() && no.getEsquerdo() != null) {
            return encontrarPai(valor, no.getEsquerdo());
        } else if(valor > no.getDado() && no.getDireito() != null) {
            return encontrarPai(valor, no.getDireito());
        } else {
            return no;
        }
    }


    public void fator_balanceamento(int valor, No pai, int flag) {
        if (pai != null) {
            if(flag == 1) {
                if (valor > pai.getDado()) {
                    pai.setfator_balanceamento(pai.getfator_balanceamento() - 1);
                    if (pai.getDado() < -1) {
                        if(pai.getDireito() != null && pai.getDireito().getfator_balanceamento() > 0) {
                            System.out.println("rotacao esquerda dupla em " + pai.getDado());
                            pai = rotacaoEsquerdaDupla(pai);
                        } else if(pai.getDireito() != null && pai.getDireito().getfator_balanceamento() <= 0) {
                            System.out.println("rotacao esquerda simples em " + pai.getDado());
                            pai = rotacaoEsquerdaSimples(pai);
                        }
                    }
                    if (pai.getPai() != null && pai.getfator_balanceamento() != 0) {
                        fator_balanceamento(pai.getDado(), pai.getPai(), flag);
                    }
                } else if (valor < pai.getDado()) {
                    pai.setfator_balanceamento(pai.getfator_balanceamento() + 1);
                    if (pai.getfator_balanceamento() > 1) {
                        if(pai.getEsquerdo() != null && pai.getEsquerdo().getfator_balanceamento() < 0) {
                            System.out.println("rotacao direita dupla em " + pai.getDado());
                            pai = rotacaoDireitaDupla(pai);
                        } else if(pai.getEsquerdo() != null && pai.getEsquerdo().getfator_balanceamento() >= 0) {
                            System.out.println("Teste rotacao direita simples em " + pai.getDado() + "(" + pai.getfator_balanceamento() + ")" );
                            pai = rotacaoDireitaSimples(pai);
                        }
                    }
                    if (pai.getPai() != null && pai.getfator_balanceamento() != 0) {
                        fator_balanceamento(pai.getDado(), pai.getPai(), flag);
                    }
                }
            } else if(flag == -1) {
                if (valor > pai.getDado()) {
                    pai.setfator_balanceamento(pai.getfator_balanceamento() + 1);
                    if (pai.getfator_balanceamento() > 1) {
                        if(pai.getEsquerdo() != null && pai.getEsquerdo().getfator_balanceamento() < 0) {
                            System.out.println("rotacao direita dupla em " + pai.getDado());
                            pai = rotacaoDireitaDupla(pai);
                        } else {
                            System.out.println("rotacao direita simples em " + pai.getDado());
                            pai = rotacaoDireitaSimples(pai);
                        }
                    }
                    if (pai.getPai() != null && pai.getfator_balanceamento() == 0) {
                        fator_balanceamento(pai.getDado(), pai.getPai(), flag);
                    }
                } else {
                    pai.setfator_balanceamento(pai.getfator_balanceamento() - 1);
                    if (pai.getfator_balanceamento() < -1) {
                        if(pai.getDireito() != null && pai.getDireito().getfator_balanceamento() > 0) {
                            System.out.println("rotacao esquerda dupla em " + pai.getDado());
                            pai = rotacaoEsquerdaDupla(pai);
                        } else {
                            System.out.println("rotacao esquerda simples em " + pai.getDado());
                            pai = rotacaoEsquerdaSimples(pai);
                        }
                    }
                    if (pai.getPai() != null && pai.getfator_balanceamento() == 0) {
                        fator_balanceamento(pai.getDado(), pai.getPai(), flag);
                    }
                }
            }
        }
        System.out.println("No:" + pai.getDado() + "Fb: " + pai.getfator_balanceamento());
    }

    // APLICANDO ROTAÇÕES

    public No rotacaoEsquerdaSimples(No inicial) {
        No direito = inicial.getDireito();
        direito.setPai(inicial.getPai());
        inicial.setDireito(direito.getEsquerdo());

        if (inicial.getDireito() != null) {
            inicial.getDireito().setPai(inicial);
        }

        direito.setEsquerdo(inicial);
        inicial.setPai(direito);

        if (direito.getPai() != null) {
            if (direito.getPai().getDireito() == inicial) {
                direito.getPai().setDireito(direito);
            }
            else if (direito.getPai().getEsquerdo() == inicial) {
                direito.getPai().setEsquerdo(direito);
            }
        }

        if (inicial.getDado() == this.raiz.getDado()) {
            raiz = direito;
        }

        inicial.setfator_balanceamento(inicial.getfator_balanceamento() + 1 - Math.min(direito.getfator_balanceamento(), 0));
        direito.setfator_balanceamento(direito.getfator_balanceamento() + 1 + Math.max(inicial.getfator_balanceamento(), 0));

        return direito;
    }


    public No rotacaoDireitaSimples(No inicial) {
        No esquerdo = inicial.getEsquerdo();
        esquerdo.setPai(inicial.getPai());
        inicial.setEsquerdo(inicial.getDireito());

        if(inicial.getEsquerdo() != null) {
            inicial.getEsquerdo().setPai(inicial);
        }

        esquerdo.setDireito(inicial);
        inicial.setPai(esquerdo);

        if (esquerdo.getPai() != null) {
            if (esquerdo.getPai().getDireito() == inicial) {
                esquerdo.getPai().setDireito(esquerdo);
            }
            else if (esquerdo.getPai().getEsquerdo() == inicial) {
                esquerdo.getPai().setEsquerdo(esquerdo);
            }
        }

        if (inicial.getDado() == this.raiz.getDado()) {
            raiz = esquerdo;
        }

        inicial.setfator_balanceamento(inicial.getfator_balanceamento() - 1 - Math.max(esquerdo.getfator_balanceamento(), 0));
        esquerdo.setfator_balanceamento(esquerdo.getfator_balanceamento() - 1 + Math.min(inicial.getfator_balanceamento(), 0));
        return esquerdo;
    }



    public No rotacaoEsquerdaDupla(No no) {
        rotacaoDireitaSimples(no.getDireito());
        return rotacaoEsquerdaSimples(no);
    }

    // ROTAÇÃO DIREITA DUPLA
    public No rotacaoDireitaDupla(No no) {
        rotacaoEsquerdaSimples(no.getEsquerdo());
        return rotacaoDireitaSimples(no);
    }

    // REMOVER
    public void remover(int valor) {
        No aRemover = acharNo(raiz, valor);
        No pai = aRemover.getPai();

        if (aRemover != null) {
            /* Primeiro caso: aRemover nao tem filhos */
            if (aRemover.getEsquerdo() == null && aRemover.getDireito() == null) {
                if (aRemover.getDado() == raiz.getDado()) {
                    raiz = null;
                } else {
                    aRemover.setPai(null);
                    if (aRemover.getDado() == pai.getEsquerdo().getDado()) {
                        pai.setEsquerdo(null);
                    } else if (aRemover.getDado() == pai.getDireito().getDado()) {
                        pai.setDireito(null);
                    }
                }
            }
            /* Segundo caso: aRemover so tem o filho esquerdo */
            if (aRemover.getEsquerdo() != null && aRemover.getDireito() == null) {
                if (aRemover.getDado() == raiz.getDado()) {
                    raiz = aRemover.getEsquerdo();
                    aRemover.getEsquerdo().setPai(null);
                } else {
                    aRemover.setPai(null);
                    aRemover.getEsquerdo().setPai(pai);
                    if (aRemover.getDado() == pai.getEsquerdo().getDado()) {
                        pai.setEsquerdo(aRemover.getEsquerdo());
                    } else if (aRemover.getDado() == pai.getDireito().getDado()) {
                        pai.setDireito(aRemover.getEsquerdo());
                    }
                }
            }
            /* Terceiro caso: aRemover so tem o filho direito */
            if (aRemover.getEsquerdo() == null && aRemover.getDireito() != null) {
                if (aRemover.getDado() == raiz.getDado()) {
                    raiz = aRemover.getEsquerdo();
                    aRemover.getDireito().setPai(null);
                } else {
                    aRemover.setPai(null);
                    aRemover.getDireito().setPai(pai);
                    if (aRemover.getDado() == pai.getEsquerdo().getDado()) {
                        pai.setEsquerdo(aRemover.getDireito());
                    } else if (aRemover.getDado() == pai.getDireito().getDado()) {
                        pai.setDireito(aRemover.getDireito());
                    }
                }
            }
            /* Quarto caso: aRemover tem dois filhos */
            if (aRemover.getEsquerdo() != null && aRemover.getDireito() != null) {
                // remover sucessor, pegar chave dele e atribuir a aremover
                No sucessor = sucessor(aRemover);
                int aux_valor = sucessor.getDado();
                remover(aux_valor);
                aRemover.setDado(aux_valor);
            }
        } else {
            System.out.println("valor a remover não encontrado");
        }
    }

    // ACHAR NÓ
    public No acharNo(No no, int valor) {
        if(no.getDado() == valor) {
            return no;
        } else if(no.getDado() < valor && no.getDireito() != null) {
            return acharNo(no.getDireito(), valor);
        } else if(no.getDado() > valor && no.getEsquerdo() != null){
            return acharNo(no.getEsquerdo(), valor);
        } else {
            return null;
        }
    }

    // SUCESSOR
    public No sucessor(No no) {
        No sucessor = no.getDireito();
        while (sucessor.getEsquerdo() != null){
            sucessor = sucessor.getEsquerdo();
        }
        return sucessor;
    }

    // IN ORDER
    public void inOrder(No no) {
        if (no.getEsquerdo() != null) {
            inOrder(no.getEsquerdo());
        }
        System.out.println(no.getDado() + " (" + no.getfator_balanceamento() + ")");
        if (no.getDireito() != null) {
            inOrder(no.getDireito());
        }
    }


}
