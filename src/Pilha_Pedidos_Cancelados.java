

public class Pilha_Pedidos_Cancelados<T> {
    private No<T> topo;

    public Pilha_Pedidos_Cancelados() {
        this.topo = null;
    }

    public void empilhar(T dado) {
        No<T> novoNo = new No<>(dado);
        novoNo.setProximo(topo);
        topo = novoNo;
    }

    public T desempilhar() {
        if (topo == null) {
            return null;
        }
        T dado = topo.getDado();
        topo = topo.getProximo();
        return dado;
    }

    public void imprimirPilha() {
        No<T> atual = topo;
        while (atual != null) {
            System.out.print(atual.getDado() + " \n");
            atual = atual.getProximo();
        }
        System.out.println();
    }
}
