/*2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
� Os n�meros pares digitados;  
� A soma dos n�meros pares digitados; 
� Os n�meros �mpares digitados; 
� A quantidade de n�meros �mpares digitados.*/


package gustavo;

import java.util.Scanner;

public class ExercicioArray1 
{
	public static void main(String[] args)
	{
		int array[] = new int [6];
        int  contImpar=0, somaPar=0;
        Scanner input = new Scanner(System.in);

        for(int i = 0; i<array.length; i++) 
        {
            System.out.printf("Entre com um n�mero: ");
            array[i] = input.nextInt();

        }
        	for(int i =0; i<array.length;i++) 
      {
            if(array[i] %2 == 0) 
        {
            System.out.println("� par: "+array[i]);
            somaPar += array[i];
        }
            else 
        {
           contImpar++;
           System.out.println("� �mpar: "+array[i]);
        }
      }

        System.out.println("A soma dos pares foi de: "+somaPar);
        System.out.println("A quantidade de �mpares digitados foi de: "+contImpar);
    }

}
