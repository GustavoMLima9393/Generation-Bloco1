package com.generation.heranca01.model;

public class Cavalo extends Animal {

	public Cavalo(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void som() {
		System.out.println("Relinchando...");
	}

	@Override
	public void acao() {
		System.out.println("Correndo...");
	}
}