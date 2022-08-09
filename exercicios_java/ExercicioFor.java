// 2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

package gustavo;

import java.util.Scanner;

public class ExercicioFor {

    public static void main(String[] args)
    {
        int numero, x, par=0, impar=0;

        Scanner leia = new Scanner (System.in);

        for (x=1;x<=10;x++)
        {
            System.out.println("\n Entre com um número: ");
            numero=leia.nextInt();

            if (numero%2==0)
            {
                par++;
            }
            if (numero%2!=0)
            {
                impar++;
            }
        }

        System.out.println("\nForam "+par+" pares e "+impar+" impares!");
    }

}