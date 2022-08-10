/*7) Crie um algoritmo que leia um número real e mostre na tela o seu dobro e a 
sua terça parte.
Ex: 
Digite um número: 3.5
O dobro de 3.5 é 7.0
A terça parte de 3.5 é 1.16666*/

package gustavo;

import java.util.Scanner;

public class zGuanabara6 
{
	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);
		
		double num,dob,ter;
		
		System.out.println("\nDigite um número: ");
		num=leia.nextDouble();
		
		dob=(num*2);
		ter=(num/3);
		
		System.out.printf("\nO dobro de "+num+" é: "+dob+".");
		System.out.printf("\nA terça parte de "+num+" é: %.2f%n",ter);
	}
}
