package com.generation.aviao;

import com.generation.aviao.model.DadosAvioes;

public class Menu 
{
	public static void main(String[] args)
	{
		DadosAvioes a1 = new DadosAvioes("Boeing", "Boeing 737-400", "PR-AJY", "Azul Linhas A�reas", 168, "Todo o pa�s", "Pr�pria");
		a1.visualizar();
		
		DadosAvioes a2 = new DadosAvioes("Boeing", "Boeing 737 MAX 8", "PR-GEA", "Gol Linhas A�reas", 186, "Todo o pa�s", "Terceirizada");
		a2.visualizar();
		
		DadosAvioes a3 = new DadosAvioes("Airbus", "Airbus A320", "PD-TRE", "LATAM Airlines", 200, "Sudeste", "Terceirizada");
		a3.visualizar();
	}
}
