package com.generation.clientes;

import com.generation.clientes.model.Clientes;

public class TestaCliente 
{

	public static void main(String[] args) 
	{
		Clientes c1 = new Clientes(1, "456897125-35", "Luís Guerreiro", "Praia", "luis_bora_povo@gmail.com", 912345687);
		c1.visualizar();
	}

}
