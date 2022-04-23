package tp_Aula5;

class NO {
    char info;
    NO dir;
    NO esq;

    NO(char a) {
        // construtor da classe tp_Aula5.NO
        info = a;
        dir = null;
        esq = null;
    }
}

public class ArvoreBinaria {

    NO BTree;

    ArvoreBinaria() {
        // construtor da classe ListaInteiros
        BTree = null;
    }

    public static void main(String[] args) {

        ArvoreBinaria BT = new ArvoreBinaria();
        BT.ColocaArvoreBinaria('5');
        BT.ColocaArvoreBinaria('3');
        BT.ColocaArvoreBinaria('4');
        BT.ColocaArvoreBinaria('2');
        BT.ColocaArvoreBinaria('7');
        BT.ColocaArvoreBinaria('6');

        //BT.Existe('4');
        //BT.Existe('2');
        boolean b = BT.Existe('6');
        if (b) System.out.println("Existe o elemento 6");
        BT.ExisteRecursivo('2', BT.BTree);

        BT.ERD();
    }

    void ColocaArvoreBinaria(char a) {
        NO tmp = BTree;
        if (tmp == null) {
            BTree = new NO(a);
            return;
        } else {
            while (tmp != null) {

                if (tmp.info < a) { // para coloca��o na sub- �rvore � direita
                    if (tmp.dir != null) tmp = tmp.dir;
                    else {
                        tmp.dir = new NO(a);
                        return;
                    }
                } else { // para coloca��o na sub- �rvore �esquerda
                    if (tmp.esq != null) tmp = tmp.esq;
                    else {
                        tmp.esq = new NO(a);
                        return;
                    }

                }
            }

        }
    }

    boolean Existe(char a) {

        NO p = BTree;
        while (p != null) {
            if (p.info < a) {
                System.out.println("info: " + p.info + " -> dir");
                p = p.dir;
            } else {
                if (p.info > a) {
                    System.out.println("info: " + p.info + " -> esq");
                    p = p.esq;
                } else {
                    System.out.println("info: " + p.info + " Encontrado");
                    return true;
                }
            }
        }
        System.out.println("N�o existe");
        return false;
    }

    void ERD() {

        InFixo(BTree);
        System.out.println(" ");
    }

    void InFixo(NO r) {
        if (r == null) return;
        InFixo(r.esq);
        System.out.print("-> " + r.info);
        InFixo(r.dir);
    }

    void ExisteRecursivo(char a, NO r) {

        System.out.println(r.info);

        if (r.info < a) if (r.dir != null) ExisteRecursivo(a, r.dir);
        else {
            System.out.println("Recursivo: n�o existe " + a);
            return;
        }
        else {

            if (r.info > a) if (r.esq != null) ExisteRecursivo(a, r.esq);
            else {
                System.out.println("Recursivo: n�o existe " + a);
                return;
            }
            else System.out.println("Recursivo: existe " + a);
        }
    }
}