# Trilha de Fila e Pilha

Nesta trilha veremos conceitos e a aplicação das estruturas de dados Fila e Pilha, pra que são utilizados, como devemos aplicar e exemplos práticos.

## O que são dados?

Dados representam uma unidade ou um elemento de **informação** que pode ser acessado através de uma variável. Eles podem conter **vários tipos** diferentes:

- **Int**
- **Float**
- **String**
- **Boolean**

## E estrutura de dados?

As estruturas de dados definem a **organização**, **métodos de acesso** e opções de **processamento** para a informação manipulada pelo programa. Ou seja, cada estrutura de dados tem um **conjunto de métodos próprios** para realizar operações como:

- **Inserir** ou **excluir** elementos
- **Buscar** e **localizar** elementos
- **Ordenar** (classificar) elementos de acordo com alguma ordem especificada

A estrutura de dados pode ter algumas características:

- Ser **lineares** ou **não lineares**
- Serem **homogêneas** ou **heterogêneas**
- Serem **estáticas** ou **dinâmicas**

## O que é PILHA?

A pilha, ou *stack*, é uma **estrutura** onde o elemento a ser removido do conjunto é sempre o mesmo: aquele que foi inserido por último. Esse tipo de política de remoção é conhecida como **LIFO**, isto é, last in, first out (**O último que entra é o primeiro que sai**).

## Para que utilizamos Pilhas?

**Gestão de Memória**: Em linguagens de programação, pilhas são frequentemente utilizadas para gerenciar a memória de forma eficiente. Por exemplo, em linguagens como C e C++, as variáveis locais e os endereços de retorno das funções são armazenados na pilha de execução do programa.

**Navegação de Histórico**: Em sistemas de software, como navegadores da web e aplicativos móveis, pilhas são usadas para gerenciar a navegação entre diferentes telas ou páginas. Cada nova tela ou página visitada é empilhada sobre a anterior, permitindo que o usuário volte para telas anteriores pressionando o botão "voltar".

Agora, podemos dar exemplos práticos de onde utilizamos a estrutura de Pilha?

- **Desfazer** e **Refazer** em Editores de Texto
- **Gerenciamento** de **notificações**
- Gestão de **transições de estado**
- **Navegação entre telas**

## Métodos utilizados?

Métodos Básicos da implementação de Pilha

- **Adicionar:** Este método é usado para adicionar um elemento à pilha
- **Remover:** Este método é usado para remover um elemento da pilha

Métodos frequentemente implementados ou utilizados em conjunto com uma estrutura de dados de pilha:

- **Pegar Topo:** Este método permite ver o elemento no topo da pilha sem removê-lo
- **Está Vazio:** Este método verifica se a pilha está vazia, ou seja, se não contém nenhum elemento
- **Tamanho:** Este método retorna o número de elementos atualmente na pilha

## Como aplicar?

```java
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

    public void empilhar(Object elemento) {
        if (tamanho == capacidade) {
            throw new IllegalStateException("A pilha está cheia.");
        }
        topo++;
        elementos[topo] = elemento;
        tamanho++;
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
```

## E o que é FILA?

A Fila, ou *queue*, tem uma estrutura **semelhante** à pilha, porém com uma diferença conceitual importante: o paradigma por trás da fila é o **FIFO** - First In, First Out, ou “**O primeiro a entrar é o primeiro a sair**”.

## Para que utilizamos Filas?

**Fila de atendimento em um banco**: Em um banco, os clientes que chegam são atendidos em ordem de chegada. Eles formam uma fila, onde o primeiro cliente a chegar é o primeiro a ser atendido pelo caixa. Isso garante um processo justo e organizado de atendimento aos clientes.

**Processamento de tarefas em um sistema operacional**: Em sistemas operacionais multitarefa, os processos são executados em uma ordem específica. Os processos prontos para execução são colocados em uma fila de prontidão, onde o escalonador do sistema seleciona o próximo processo a ser executado com base em um algoritmo de escalonamento, como o FIFO (First In, First Out).

Agora, podemos dar exemplos práticos de onde utilizamos a estrutura de Fila?

- **Sistema de reserva** de passagens
- **Balanço de carga** em servidores
- **Sistema de triagem** em serviços de emergência
- **Fila de mensagens** de texto

## Métodos utilizados?

Métodos Básicos da implementação de Fila

- **Adicionar:** Este método é usado para adicionar um elemento à fila
- **Remover:** Este método é usado para remover um elemento da fila

Métodos comumente implementados ou utilizados com a estrutura de dados de fila:

- **Pegar Primeiro:** Este método permite ver o elemento na frente da fila sem removê-lo
- **Está Vazio:** Este método verifica se a fila está vazia, ou seja, se não contém nenhum elemento
- **Tamanho:** Este método retorna o número de elementos atualmente na fila

## Como aplicar?

```java
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

    public void adicionar(Object elemento) {
        if (tamanho == capacidade) {
            throw new IllegalStateException("A fila está cheia.");
        }
        fim = (fim + 1) % capacidade;
        elementos[fim] = elemento;
        tamanho++;
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
```

## Pré-requisitos:

**Conhecimento em Programação Java:** É essencial ter conhecimento em programação orientada a objetos (POO) em Java para entender e implementar as estruturas de dados de fila e pilha.

**Ambiente de Desenvolvimento Integrado (IDE):** Um ambiente de desenvolvimento como Eclipse, IntelliJ IDEA ou NetBeans é altamente recomendado para facilitar a criação, edição e execução dos programas Java.

**JDK (Java Development Kit):** Você precisará do JDK instalado em sua máquina. Recomenda-se usar o JDK 8, 11 ou 17, que são versões LTS (Long-Term Support) estáveis e amplamente suportadas.

### Tecnologias e Versões:

**Java SE (Standard Edition):**
   - Versão: JDK 8, JDK 11 ou JDK 17 (LTS)
   - Site Oficial: [Oracle JDK](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)

**IDE (Ambiente de Desenvolvimento Integrado):**
   - Exemplos: Eclipse, IntelliJ IDEA, NetBeans
   - Versões: Eclipse 2021-09, IntelliJ IDEA 2021.3, NetBeans 12.5
   - Sites Oficiais:
     - [Eclipse](https://www.eclipse.org/downloads/)
     - [IntelliJ IDEA](https://www.jetbrains.com/idea/download/)
     - [NetBeans](https://netbeans.apache.org/download/nb125/index.html)

## Documentações que falam sobre Pilha e Fila:

- [Estruturas de dados: uma introdução | Alura](https://www.alura.com.br/artigos/estruturas-de-dados-introducao)
- [www.inf.ufpr.br](https://www.inf.ufpr.br/gregio/CI1001/PilhaFila.pdf)
- [computerscience360.wordpress.com](https://computerscience360.wordpress.com/wp-content/uploads/2018/02/algoritmos-teoria-e-prc3a1tica-3ed-thomas-cormen.pdf)

## Resultados esperados ##