/*15) Crie um programa que leia o número de dias trabalhados em um mês e mostre o 
salário de um funcionário, sabendo que ele trabalha 8 horas por dia e ganha R$25 
por hora trabalhada.*/

package gustavo;

import java.util.Scanner;

public class zGuanabara11 
{
	public static void main(String[] args)
	{
		double salario;
		int diasTrab,diaHoras;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nDigite quantos dias você trabalhou esse mês: ");
		diasTrab = leia.nextInt();
		diaHoras = (25*8);
		salario = (diasTrab*diaHoras);
		System.out.println("\nO salário desse mês é de R$"+salario);
	}
}
