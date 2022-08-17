package com.generation.funcionario;

import com.generation.funcionario.model.DadosFuncionario;

public class Menu 
{
	public static void main(String[] args)
	{
		DadosFuncionario f1 = new DadosFuncionario (12589, "Andreza Pabula", "45796312589", "Rua Ajuda Luciano", "andrezaluciano@gmail.com", 965874589, 136578945);
		f1.visualizar();
		DadosFuncionario f2 = new DadosFuncionario (12896, "Gustavo Lima", "45745698589", "Rua Tubarão Branco", "gustavoluciano@gmail.com", 965875879, 145236945);
		f2.visualizar();
	}
}
