/*7) Crie um algoritmo que leia um n�mero real e mostre na tela o seu dobro e a 
sua ter�a parte.
Ex: 
Digite um n�mero: 3.5
O dobro de 3.5 � 7.0
A ter�a parte de 3.5 � 1.16666*/

package gustavo;

import java.util.Scanner;

public class zGuanabara6 
{
	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);
		
		double num,dob,ter;
		
		System.out.println("\nDigite um n�mero: ");
		num=leia.nextDouble();
		
		dob=(num*2);
		ter=(num/3);
		
		System.out.printf("\nO dobro de "+num+" �: "+dob+".");
		System.out.printf("\nA ter�a parte de "+num+" �: %.2f%n",ter);
	}
}
