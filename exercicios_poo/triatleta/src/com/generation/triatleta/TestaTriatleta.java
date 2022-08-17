package com.generation.triatleta;

public class TestaTriatleta {

	public static void main(String[] args)
	{
		Triatleta triatleta = new Triatleta("Kelvyn");
		
		triatleta.aquecer();
		triatleta.nadar();
		triatleta.correr();
		triatleta.correrDeBicicleta();
		triatleta.cansou();
	}
	
}
