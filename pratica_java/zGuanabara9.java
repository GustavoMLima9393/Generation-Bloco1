/*13) Fa�a um algoritmo que leia o sal�rio de um funcion�rio, calcule e mostre o 
seu novo sal�rio, com 15% de aumento.*/

package gustavo;

import java.util.Scanner;

public class zGuanabara9 
{
	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);
		
		double salario,aume;
		
		System.out.println("\nDigite o seu sal�rio atual: ");
		salario = leia.nextDouble();
		
		aume=(salario*0.15)+salario;
		
		System.out.println("\nO seu sal�rio aumentou em 15% e agora � de: "+aume);
	}
}
