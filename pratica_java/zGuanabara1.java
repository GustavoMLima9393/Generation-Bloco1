/*2) Fa�a um programa que leia o nome de uma pessoa e mostre uma mensagem de boasvindas para ela:
Ex:
Qual � o seu nome? Jo�o da Silva
Ol� Jo�o da Silva, � um prazer te conhecer!*/

package gustavo;

import java.util.Scanner;

public class zGuanabara1 
{
	public static void main(String[] args)
	{
		String nome;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com seu nome: ");
		nome = leia.nextLine();
		
		System.out.println("\nOl� "+nome+", � um prazer te conhecer!");
	}
}
