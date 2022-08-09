/*3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)*/

package gustavo;

import java.util.Scanner;

public class ExercicioWhile 
{

	public static void main(String[] args) 
	{
		
		int idade,menor=0,maior=0,cont=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com a sua idade: ");
		idade = leia.nextInt();
		
		while (idade!=-99) 
		{
			
			if (idade<21) 
			{
				menor++;
			}
			else if (idade>50)
			{
				maior++;
			}
		
			System.out.println("\nEntre com sua idade: ");
			idade = leia.nextInt();	
		}
		System.out.println("\nO resultado de pessoas com menos de 21 anos é: "+menor+" e maiores de 50 anos é: "+maior);
		idade = leia.nextInt();
	}
	
}
