//1- Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.

package gustavo;

import java.util.Scanner;

public class PrimeiroExercicio {

	public static void main(String[] args) {
		
		double nota1,nota2,nota3;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o primeiro n�mero inteiro: ");
		nota1 = leia.nextDouble();
		System.out.println("\nDigite o segundo n�mero inteiro: ");
		nota2 = leia.nextDouble();
		System.out.println("\nDigite o terceiro n�mero inteiro: ");
		nota3 = leia.nextDouble();
		
		if(nota1>nota2 && nota1>nota3) {
			System.out.println("\nO primeiro n�mero � o maior");
		}else if(nota2>nota1 && nota2>nota3){
			System.out.println("\nO segundo n�mero � o maior");
		}else if(nota3>nota1 && nota3>nota2){
			System.out.println("\nO terceiro n�mero � o maior");
		}
	}
}
