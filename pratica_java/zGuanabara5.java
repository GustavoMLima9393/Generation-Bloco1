/*6) Fa�a um programa que leia um n�mero inteiro e mostre o seu antecessor e seu 
sucessor.
Ex: 
Digite um n�mero: 9
O antecessor de 9 � 8
O sucessor de 9 � 10*/

package gustavo;

import java.util.Scanner;

public class zGuanabara5 
{
	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);
		
		int numero,ant,suc;
		
		System.out.println("\nDigite um n�mero: ");
		numero=leia.nextInt();
		
		ant=(numero-1);
		suc=(numero+1);
		
		System.out.println("\nO antecessor de "+numero+" � "+ant+".");
		System.out.println("\nO sucessor de "+numero+" � "+suc+".");
	}
}
