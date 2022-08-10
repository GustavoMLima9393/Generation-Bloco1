/*2- Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados.*/


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
            System.out.printf("Entre com um número: ");
            array[i] = input.nextInt();

        }
        	for(int i =0; i<array.length;i++) 
      {
            if(array[i] %2 == 0) 
        {
            System.out.println("É par: "+array[i]);
            somaPar += array[i];
        }
            else 
        {
           contImpar++;
           System.out.println("É ímpar: "+array[i]);
        }
      }

        System.out.println("A soma dos pares foi de: "+somaPar);
        System.out.println("A quantidade de ímpares digitados foi de: "+contImpar);
    }

}
