package gustavo;

import java.util.Scanner;

public class ExemploWhile {

	public static void main(String[] args) {
		
		int numero,somaNumero=0;
		
		try (Scanner leia = new Scanner(System.in)) {
			System.out.println("\nEntre com um n�mero: ");
			numero = leia.nextInt();//5
			
			while(numero!=0) {
				
				if(numero % 3 == 0) {
					somaNumero += numero;
				}
				System.out.println("\nEntre com um n�mero: ");
				numero = leia.nextInt();//0
				for(int x=1;x<=20;x++) {
					System.out.println("\n");
				}
			}
		}
		
		System.out.println("\nSomat�rio dos n�meros m�ltiplos de 3: "+somaNumero);

	}

}