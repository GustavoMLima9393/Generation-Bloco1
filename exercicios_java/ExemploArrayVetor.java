package gustavo;

import java.util.Scanner;

public class ExemploArrayVetor 
{
	public static void main(String[] args) 
	{
		float[] media = new float[3];
		float n1,n2,n3,somaMedia=0,mg;
		int x;
		Scanner leia = new Scanner(System.in);
				
		for(x=0;x<3;x++)
		{
			System.out.println("\nEntre com a primeira nota: ");
			n1 = leia.nextFloat();
			System.out.println("\nEntre com a segunda nota: ");
			n2 = leia.nextFloat();
			System.out.println("\nEntre com a terceira nota: ");
			n3 = leia.nextFloat();
			
			media[x] = (n1+n2+n3)/3;
			System.out.println("\nM�dia: "+media[x]);
			somaMedia += media[x];
		}
		mg = somaMedia/3;
		System.out.println("\nM�dia geral: "+mg);
		System.out.printf("\nM�dia geral: %.2f",mg);
	}
}
