/*6- Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)*/

package gustavo;

import java.util.Scanner;

public class ExercicioDoWhile 
{
	public static void main(String[] args) 
	{
		int numero,media,somaNumero=0,cont=0;
		
		Scanner leia = new Scanner(System.in);
		
		do 	
		{
			System.out.println("\nDigite um n�mero: ");
			numero = leia.nextInt();
			
			if(numero!=0 && numero%3==0)
			
			{
				somaNumero+=numero;
				cont++;				
			}
		} 
		while(numero!=0);   
		
		media=somaNumero/cont;
		System.out.println("\nM�dia dos n�meros m�ltiplos de 3 �: "+media);
	}
}
