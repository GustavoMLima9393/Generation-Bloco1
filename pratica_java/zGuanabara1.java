/*2) Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boasvindas para ela:
Ex:
Qual é o seu nome? João da Silva
Olá João da Silva, é um prazer te conhecer!*/

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
		
		System.out.println("\nOlá "+nome+", é um prazer te conhecer!");
	}
}
