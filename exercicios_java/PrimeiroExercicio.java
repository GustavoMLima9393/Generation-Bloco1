//1- Faça um programa que receba três inteiros e diga qual deles é o maior.

package gustavo;

import java.util.Scanner;

public class PrimeiroExercicio {

	public static void main(String[] args) {
		
		double nota1,nota2,nota3;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o primeiro número inteiro: ");
		nota1 = leia.nextDouble();
		System.out.println("\nDigite o segundo número inteiro: ");
		nota2 = leia.nextDouble();
		System.out.println("\nDigite o terceiro número inteiro: ");
		nota3 = leia.nextDouble();
		
		if(nota1>nota2 && nota1>nota3) {
			System.out.println("\nO primeiro número é o maior");
		}else if(nota2>nota1 && nota2>nota3){
			System.out.println("\nO segundo número é o maior");
		}else if(nota3>nota1 && nota3>nota2){
			System.out.println("\nO terceiro número é o maior");
		}
	}
}
