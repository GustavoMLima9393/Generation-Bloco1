package com.generation.array3;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		
		ArrayList <String> itens = new ArrayList<String>();
		
		itens.add("Perfume");
		itens.add("Hidratante");
		itens.add("Desodorante");
		itens.add("Creme");
		
		System.out.println(itens.toString());
		
		itens.remove(3);
		System.out.println(itens.toString());
		
		itens.set(1, "Batom");
		System.out.println(itens.toString());	
	}	
}