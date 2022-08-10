/*9) Faça um algoritmo que leia quanto dinheiro uma pessoa tem na carteira (em R$) 
e mostre quantos dólares ela pode comprar. Considere US$1,00 = R$3,45.*/

package gustavo;

import java.util.Scanner;

public class zGuanabara7 
{
	public static void main(String[] args)
	{
		Scanner leia = new Scanner (System.in);
		
		double dinheiro,dolares;
		
		System.out.printf("\nDigite o quanto de dinheiro você tem na carteira: ");
		dinheiro = leia.nextDouble();
		dolares=(dinheiro)/3.45;
		System.out.printf("\nVocê tem R$"+dinheiro+" e pode comprar US$"+dolares);
	}
}
