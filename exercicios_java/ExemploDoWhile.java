package gustavo;

import java.util.Scanner;

public class ExemploDoWhile {

	public static void main (String[] args) 
	{
		
		int valor,somaValor=0;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("\nEntre com um valor: ");
			valor = leia.nextInt();
			somaValor += valor;
			
		}while(somaValor<=300); // Falsa
		
		System.out.println("\nSomat�rio dos valores: "+somaValor);
		
	}
}
