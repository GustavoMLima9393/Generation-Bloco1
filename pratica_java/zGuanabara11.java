/*15) Crie um programa que leia o n�mero de dias trabalhados em um m�s e mostre o 
sal�rio de um funcion�rio, sabendo que ele trabalha 8 horas por dia e ganha R$25 
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
		
		System.out.println("\nDigite quantos dias voc� trabalhou esse m�s: ");
		diasTrab = leia.nextInt();
		diaHoras = (25*8);
		salario = (diasTrab*diaHoras);
		System.out.println("\nO sal�rio desse m�s � de R$"+salario);
	}
}
