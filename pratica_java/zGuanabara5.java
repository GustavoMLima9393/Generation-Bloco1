/*6) Faça um programa que leia um número inteiro e mostre o seu antecessor e seu 
sucessor.
Ex: 
Digite um número: 9
O antecessor de 9 é 8
O sucessor de 9 é 10*/

package gustavo;

import java.util.Scanner;

public class zGuanabara5 
{
	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);
		
		int numero,ant,suc;
		
		System.out.println("\nDigite um número: ");
		numero=leia.nextInt();
		
		ant=(numero-1);
		suc=(numero+1);
		
		System.out.println("\nO antecessor de "+numero+" é "+ant+".");
		System.out.println("\nO sucessor de "+numero+" é "+suc+".");
	}
}
