/*3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/

package gustavo;

import java.util.Scanner;

public class TerceiroExercicio {

		public static void main(String[] arge) {
			
			int horas,minutos,segundos, umaHora = 3600,umMin = 60,umSeg = 1;
			
			Scanner leia = new Scanner(System.in);
			
			System.out.println("\nO evento da fábrica durou: ");
			System.out.println("\nHoras: ");
			horas = leia.nextInt();
			System.out.println("\nMinutos: ");
			minutos = leia.nextInt();
			System.out.println("\nSegundos: ");
			segundos = leia.nextInt();
			
			segundos+= (horas*umaHora)+(minutos*umMin)+(segundos%umSeg);
			System.out.println("\nO evento durou em segundos: "+segundos);
		}
}
