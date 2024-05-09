public class Fila {
    private Object[] elementos;
    private int tamanho;
    private int capacidade;
    private int inicio;
    private int fim;

    public Fila(int capacidade) {
        this.capacidade = capacidade;
        this.elementos = new Object[capacidade];
        this.tamanho = 0;
        this.inicio = 0;
        this.fim = -1;
    }

    public Object adicionar(Object elemento) {
        if (tamanho == capacidade) {
            throw new IllegalStateException("A fila está cheia.");
        }
        fim = (fim + 1) % capacidade;
        elementos[fim] = elemento;
        tamanho++;

        return elemento;
    }

    public Object remover() {
        if (tamanho == 0) {
            throw new IllegalStateException("A fila está vazia.");
        }
        Object removido = elementos[inicio];
        inicio = (inicio + 1) % capacidade;
        tamanho--;
        return removido;
    }

    public Object primeiro() {
        if (tamanho == 0) {
            throw new IllegalStateException("A fila está vazia.");
        }
        return elementos[inicio];
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public int tamanho() {
        return tamanho;
    }
}
