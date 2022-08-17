package com.generation.heranca01.model;

public class Cachorro extends Animal {

	public Cachorro(String nome, int idade) {
		super(nome, idade);
	}

	@Override
	public void som() {
		System.out.println("AU! AU!");
	}

	@Override
	public void acao() {
		System.out.println("Correndo...");
	}
}