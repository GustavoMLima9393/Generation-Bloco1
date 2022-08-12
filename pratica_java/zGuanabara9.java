/*13) Faça um algoritmo que leia o salário de um funcionário, calcule e mostre o 
seu novo salário, com 15% de aumento.*/

package gustavo;

import java.util.Scanner;

public class zGuanabara9 
{
	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);
		
		double salario,aume;
		
		System.out.println("\nDigite o seu salário atual: ");
		salario = leia.nextDouble();
		
		aume=(salario*0.15)+salario;
		
		System.out.println("\nO seu salário aumentou em 15% e agora é de: "+aume);
	}
}
