/*5) Fa�a um programa que leia as duas notas de um aluno em uma mat�ria e mostre 
na tela a sua m�dia na disciplina.
Ex: 
Nota 1: 4.5
Nota 2: 8.5
A m�dia entre 4.5 e 8.5 � igual a 6.5*/

package gustavo;

import java.util.Scanner;

public class zGuanabara4 
{
	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);
		
		double n1,n2,media;
		
		System.out.println("\nDigite a primeira nota: ");
		n1 = leia.nextDouble();
		System.out.println("\nDigite a segunda nota: ");
		n2 = leia.nextDouble();
		media=(n1+n2)/2;
		System.out.println("\nA m�dia entre "+n1+" e "+n2+" � igual a "+media);
	}
}
