package com.dio.ed.pilha;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Main Aula01
		 * 
		 * 
		NoGeneric<String> no1 = new NoGeneric<>("Conte�do n� 1");
		
		NoGeneric<String> no2 = new NoGeneric<>("Conte�do n� 2");
		no1.setProximoNo(no2);
		
		NoGeneric<String> no3 = new NoGeneric<>("Conte�do n� 3");
		no2.setProximoNo(no3);
		
		NoGeneric<String> no4 = new NoGeneric<>("Conte�do n� 4");
		no3.setProximoNo(no4);
		
		System.out.println(no1);
		System.out.println(no1.getProximoNo().getProximoNo());
		*/
		
		Pilha pilha = new Pilha();
		
		pilha.push(new No(1));
		pilha.push(new No(2));
		pilha.push(new No(3));
		pilha.push(new No(4));
		pilha.push(new No(5));
		
		System.out.println(pilha);
		
		pilha.pop();
		
		System.out.println(pilha);
		
		System.out.println("Topo da pilha: " + pilha.top());
	}

}
