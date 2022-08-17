/*19) Crie um algoritmo que leia o nome e as duas notas de um aluno, calcule a sua 
média e mostre na tela. No final, analise a média e mostre se o aluno teve ou 
não um bom aproveitamento (se ficou acima da média 7.0).*/

package gustavo;

import java.util.Scanner;

public class zGuanabara12 
{
	public static void main(String[] args)
	{
		double n1,n2,media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite a primeira nota: ");
		n1 = leia.nextDouble();
		System.out.println("\nDigite a segunda nota: ");
		n2 = leia.nextDouble();
		media = (n1+n2)/2;
		System.out.println("\nA média final foi de: "+media);
		
		if (media>=7) 
			{
				System.out.println("\nVocê teve um bom aproveitamento!");
			}
		else
			{
				System.out.println("\nVocê NÃO teve um bom aproveitamento!");
			}
	}
}
