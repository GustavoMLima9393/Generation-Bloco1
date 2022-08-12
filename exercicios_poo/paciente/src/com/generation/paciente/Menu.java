package com.generation.paciente;

import com.generation.paciente.model.DadosPacientes;

public class Menu 
{
	public static void main(String[] args)
	{
		DadosPacientes p1 = new DadosPacientes(1589, "356978145-23", "João Alberto da Silva", "Rua dos Vendedores", "Não possui", 936587896, "Covid-19", "Sulamérica");
		p1.visualizar();
		DadosPacientes p2 = new DadosPacientes(1595, "24587563112", "Luciano Silvestre da Costa", "Rua dos Compradores", "luciano_scosta89@gmail.com", 947859632, "Gripe", "Bradesco");
		p2.visualizar();
	
	}
	
}
