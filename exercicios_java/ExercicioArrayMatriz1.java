/*3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores 
que 10 ela possui.*/


package gustavo;

import java.util.Scanner;

public class ExercicioArrayMatriz1 
{
	public static void main(String[] args) 
	{
		 int array [][] = new int [3][3];
	        int maior10=0;

	        Scanner input = new Scanner(System.in);
	        for(int i = 0; i<array.length;i++) 
	       {
	            for(int j = 0; j<array[i].length;j++) 
	            {
	                System.out.printf("Entre com um valor para a Array: ");
	                array[i][j] = input.nextInt();

	                if(array[i][j]>10) 
	                {
	                    maior10++;
	                }
	            }
	       }
	        System.out.println("A Array possui "+maior10+" valores maiores do que 10");
	  }

}
