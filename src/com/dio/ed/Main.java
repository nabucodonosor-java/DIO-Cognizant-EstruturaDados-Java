package com.dio.ed;

public class Main {

	public static void main(String[] args) {
		
	
		NoGeneric<String> no1 = new NoGeneric<>("Conte?do n? 1");
		
		NoGeneric<String> no2 = new NoGeneric<>("Conte?do n? 2");
		no1.setProximoNo(no2);
		
		NoGeneric<String> no3 = new NoGeneric<>("Conte?do n? 3");
		no2.setProximoNo(no3);
		
		NoGeneric<String> no4 = new NoGeneric<>("Conte?do n? 4");
		no3.setProximoNo(no4);
		
		System.out.println(no1);
		System.out.println(no1.getProximoNo().getProximoNo());
		
	}

}
