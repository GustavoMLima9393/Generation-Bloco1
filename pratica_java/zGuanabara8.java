/*12) Crie um programa que leia o pre�o de um produto, calcule e mostre o seu 
PRE�O PROMOCIONAL, com 5% de desconto.*/

package gustavo;

import java.util.Scanner;

public class zGuanabara8 
{
	public static void main(String[] args)
	{
		Scanner leia = new Scanner (System.in);
		
		double preco,promo;
		
		System.out.println("\nDigite o pre�o da mercadoria: ");
		preco = leia.nextDouble();
		
		promo=(preco*0.95);
		
		System.out.println("\nO pre�o da mercadoria com 5% de desconto � de: R$"+promo);
		
	}
	
}
