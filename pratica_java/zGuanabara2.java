/*3) Crie um programa que leia o nome e o sal�rio de um funcion�rio, mostrando no 
final uma mensagem.
Ex:
Nome do Funcion�rio: Maria do Carmo
Sal�rio: 1850,45
O funcion�rio Maria do Carmo tem um sal�rio de R$1850,45 em Junho.*/

package gustavo;

import java.util.Scanner;

public class zGuanabara2 
{
	public static void main(String[] args)
	{
		String nome;
		float salario;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nNome do funcion�rio: ");
		nome = leia.nextLine();
		System.out.printf("Sal�rio: ");
		salario = leia.nextFloat();
		
		System.out.println("\nO funcion�rio "+nome+" tem um sal�rio de R$"+salario+" em Junho.");	
	}
}
