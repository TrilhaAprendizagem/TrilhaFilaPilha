public class Main {
    public static void main(String[] args) {
        // Testando a fila
        Fila fila = new Fila(5);

        System.out.println("Adicionando: " + fila.adicionar("Elemento 1"));
        System.out.println("Adicionando: " + fila.adicionar("Elemento 2"));
        System.out.println("Adicionando: " + fila.adicionar("Elemento 3"));
        System.out.println("Adicionando: " + fila.adicionar("Elemento 4"));
        System.out.println("Adicionando: " + fila.adicionar("Elemento 5"));

        System.out.println("A fila está vazia? " + fila.estaVazia());

        System.out.println("Primeiro elemento da fila: " + fila.primeiro());
        System.out.println("Tamanho da fila: " + fila.tamanho());

        while (!fila.estaVazia()) {
            System.out.println("Removendo da fila: " + fila.remover());
        }

        System.out.println("A fila está vazia? " + fila.estaVazia());

        // Testando a pilha
        Pilha pilha = new Pilha(5);

        System.out.println("");
        System.out.println("Adicionando: " + pilha.empilhar("Elemento A"));
        System.out.println("Adicionando: " + pilha.empilhar("Elemento B"));
        System.out.println("Adicionando: " + pilha.empilhar("Elemento C"));

        System.out.println("A pilha está vazia? " + pilha.estaVazia());

        System.out.println("Topo da pilha: " + pilha.topo());
        System.out.println("Tamanho da pilha: " + pilha.tamanho());

        while (!pilha.estaVazia()) {
            System.out.println("Desempilhando da pilha: " + pilha.desempilhar());
        }

        System.out.println("A pilha está vazia? " + pilha.estaVazia());
    }
}
