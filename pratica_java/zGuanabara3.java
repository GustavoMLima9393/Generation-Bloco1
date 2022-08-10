/*4) Desenvolva um algoritmo que leia dois números inteiros e mostre o somatório 
entre eles.
Ex:
Digite um valor: 8
Digite outro valor: 5
A soma entre 8 e 5 é igual a 13.*/

package gustavo;

import java.util.Scanner;

public class zGuanabara3 
{
	public static void main(String[] args)
	{
		int n1,n2,soma;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite um valor: ");
		n1=leia.nextInt();
		System.out.println("\nDigite outro valor: ");
		n2=leia.nextInt();
		soma = (n1+n2);
		System.out.println("\nA soma entre "+n1+" e "+n2+" é igual a "+soma+".");
	}
}
