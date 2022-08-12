/*14) A locadora de carros precisa da sua ajuda para cobrar seus serviços. Escreva 
um programa que pergunte a quantidade de Km percorridos por um carro alugado e a 
quantidade de dias pelos quais ele foi alugado. Calcule o preço total a pagar, 
sabendo que o carro custa R$90 por dia e R$0,20 por Km rodado.*/

package gustavo;

import java.util.Scanner;

public class zGuanabara10 
{
	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);
		
		int dias,kms;
		double precoporkm,precoDia,total;
			
		System.out.println("\nQuantidade de dias em que o carro foi utilizado: ");
		dias = leia.nextInt();
		
		System.out.println("\nQuantidade de KM percorridos pelo carro: ");
		kms = leia.nextInt();
		
		precoporkm=(kms*0.20);
		precoDia=(dias*90);
		total=(precoDia+precoporkm);
		
		System.out.println("\nVocê terá que pagar R$"+total);
	}
}
