/*12) Crie um programa que leia o preço de um produto, calcule e mostre o seu 
PREÇO PROMOCIONAL, com 5% de desconto.*/

package gustavo;

import java.util.Scanner;

public class zGuanabara8 
{
	public static void main(String[] args)
	{
		Scanner leia = new Scanner (System.in);
		
		double preco,promo;
		
		System.out.println("\nDigite o preço da mercadoria: ");
		preco = leia.nextDouble();
		
		promo=(preco*0.95);
		
		System.out.println("\nO preço da mercadoria com 5% de desconto é de: R$"+promo);
		
	}
	
}
