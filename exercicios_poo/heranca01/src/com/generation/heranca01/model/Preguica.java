package com.generation.heranca01.model;

public class Preguica extends Animal {

	public Preguica(String nome, int idade) {
		super(nome, idade);
	}

	@Override
	public void som() {
		System.out.println("Som de pregui�a...");
	}

	@Override
	public void acao() {
		System.out.println("Subindo em �rvores...");
	}

}
