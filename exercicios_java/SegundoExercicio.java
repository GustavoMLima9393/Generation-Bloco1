/*3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:
 10-14 infantil
 15-17 juvenil
 18-25 adulto*/

package gustavo;

import java.util.Scanner;

public class SegundoExercicio {
	
		public static void main(String[] arge) {
			
			double idade;
			
			Scanner leia = new Scanner(System.in);
			
			System.out.println("\nDigite a sua idade: ");
			idade = leia.nextDouble();
			
			if(idade>=10 && idade<=14) {
				System.out.println("\nVocê está na categoria infantil!");
			}else if(idade>=15 && idade<=17){
				System.out.println("\nVocê está na categoria juvenil!");
			}else if(idade>=18 && idade<=25){
				System.out.println("\nVocê está na categoria adulto!");
			}else {
				System.out.println("\nSem categorias!");
			}
			
	}

}
