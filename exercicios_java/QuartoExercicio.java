/*2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias.*/

package gustavo;

import java.util.Scanner;

public class QuartoExercicio {
	
		public static void main(String[] arge) {
			
			int anos,meses,dias,diafim;
			
			Scanner leia = new Scanner(System.in);
			
			System.out.println("\nDigite sua idade em dias: ");
			dias = leia.nextInt();
			
			anos = (dias / 365);
			meses = (dias % 365) / 30;
			diafim = (dias % 365) % 30;
			
			System.out.println("\nSua idade é "+anos+" anos, "+meses+" meses e "+diafim+" dias");
		}

}
