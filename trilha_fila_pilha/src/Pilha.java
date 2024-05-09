public class Pilha {
    private Object[] elementos;
    private int tamanho;
    private int capacidade;
    private int topo;

    public Pilha(int capacidade) {
        this.capacidade = capacidade;
        this.elementos = new Object[capacidade];
        this.tamanho = 0;
        this.topo = -1;
    }

    public Object empilhar(Object elemento) {
        if (tamanho == capacidade) {
            throw new IllegalStateException("A pilha está cheia.");
        }
        topo++;
        elementos[topo] = elemento;
        tamanho++;
        return elemento;
    }

    public Object desempilhar() {
        if (tamanho == 0) {
            throw new IllegalStateException("A pilha está vazia.");
        }
        Object removido = elementos[topo];
        topo--;
        tamanho--;
        return removido;
    }

    public Object topo() {
        if (tamanho == 0) {
            throw new IllegalStateException("A pilha está vazia.");
        }
        return elementos[topo];
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public int tamanho() {
        return tamanho;
    }
}
