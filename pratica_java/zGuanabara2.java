/*3) Crie um programa que leia o nome e o salário de um funcionário, mostrando no 
final uma mensagem.
Ex:
Nome do Funcionário: Maria do Carmo
Salário: 1850,45
O funcionário Maria do Carmo tem um salário de R$1850,45 em Junho.*/

package gustavo;

import java.util.Scanner;

public class zGuanabara2 
{
	public static void main(String[] args)
	{
		String nome;
		float salario;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nNome do funcionário: ");
		nome = leia.nextLine();
		System.out.printf("Salário: ");
		salario = leia.nextFloat();
		
		System.out.println("\nO funcionário "+nome+" tem um salário de R$"+salario+" em Junho.");	
	}
}
