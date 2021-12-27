# Bootcamp Cognizant Java

## Estruturas de Dados em Java: Pilhas e Filas

### Stack / Pilha
É uma estrutura de dado que segue o padrão LIFO (Last In First Out). A referência do nó fica apontada sempre para o item "abaixo" e a referência do nó do primeiro item da pilha 
aponta para null.

#### Métodos Pilha
* top(): busca a referência do primeiro nó da pilha (item no topo);
* pop(): exclui o item do topo da lista;
* push(): adiciona item no topo da pilha;
* isEmpty(): verifica se a referência que aponta para o topo da pilha é null.

### Queue / Fila
É uma estrutura de dado que segue o padrão FIFO (First In First Out). A referência do nó atual fica sempre apontada para o próximo nó.
aponta para null

#### Métodos Fila
* enqueue(): adiciona nó da Fila;
* dequeue(): exclui o primeiro nó da Fila;
* isEmpty(): verifica se a referência que aponta para o início da Fila é null.

## Estruturas de Dados em Java: Listas

### Listas Encadeadas
É uma estrutura de dados linear e dinâmica composta por vários nós que estão interligados e suas respectivas referências apontadas para o próximo item da lista.

#### Métodos Lista Encadeada
* size(): retorna tamanho da lista;
* isEmpty(): verifica se a referência que aponta para o início da Fila é null;
* add(): adiciona item da lista;
* getNo(): busca nó específico pelo índice;
* get(): retorna conteúdo do nó pelo índice;
* remove(): exclui nó pelo índice.

### Listas Duplamente Encadeadas
É uma estrutura de dados ligada que consiste de um conjunto de registros sequencialmente ligados chamados de nós e é uma extensão da lista simplesmente ligada.

#### Métodos Lista Encadeada
* size(): retorna tamanho da lista;
* isEmpty(): verifica se a referência que aponta para o início da Fila é null;
* add(): adiciona item da lista;
* add(index): adiciona item da lista em índice específico;
* getNo(): busca nó específico pelo índice;
* get(): retorna conteúdo do nó pelo índice;
* remove(): exclui nó pelo índice.

### Listas Circulares
É uma espécie de lista simples ou duplamente encadeada, mas que possui uma característica adicional para o deslocamento na lista: ela não tem fim.

#### Métodos Lista Circular
* size(): retorna tamanho da lista;
* isEmpty(): verifica se a referência que aponta para o início da Fila é null;
* add(): adiciona item da lista;
* getNo(): busca nó específico pelo índice;
* get(): retorna conteúdo do nó pelo índice;
* remove(): exclui nó pelo índice.

