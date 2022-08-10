/*5) Faça um programa que leia as duas notas de um aluno em uma matéria e mostre 
na tela a sua média na disciplina.
Ex: 
Nota 1: 4.5
Nota 2: 8.5
A média entre 4.5 e 8.5 é igual a 6.5*/

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
		System.out.println("\nA média entre "+n1+" e "+n2+" é igual a "+media);
	}
}
