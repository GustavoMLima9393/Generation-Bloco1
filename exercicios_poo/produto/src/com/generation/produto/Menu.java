package com.generation.produto;

import com.generation.produto.model.DadosProdutos;

public class Menu 
{
	public static void main(String[] args)
	{
		DadosProdutos p1 = new DadosProdutos("Celular", "Samsung", "Galaxy A51", "SIM", "128GB", "4GB");
		p1.visualizar();
		
		DadosProdutos p2 = new DadosProdutos("Celular", "Apple", "iPhone X", "SIM", "256GB", "3GB");
		p2.visualizar();
	}
}
