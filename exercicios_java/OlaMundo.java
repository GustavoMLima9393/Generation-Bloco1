package gustavo;

import java.util.Scanner;

public class OlaMundo {

	public static void main(String[] args) {
		
		String nome = "Gustavo Macedo";
		int idade = 29,op;
		double altura = 1.82,nota1,nota2,nota3,media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nVamos apresentar os dados do Gustavo");
		System.out.println("\nNome do participante: "+nome);
		System.out.println("\nIdade do participante: "+idade+" anos de vida");
		System.out.println("\nAltura do participante: "+altura);
		
		System.out.println("\nEntre com a primeira nota: ");
		nota1 = leia.nextDouble();
		System.out.println("\nEntre com a segunda nota: ");
		nota2 = leia.nextDouble();
		System.out.println("\nEntre com a terceira nota: ");
		nota3 = leia.nextDouble();
		
		media = (nota1+nota2+nota3)/3;
		System.out.println("\nMédia aritmética: "+media);
		System.out.printf("\nMédia aritmética: %.2f",media);
		
		if(media>=7 && media<=10) {
			System.out.println("\nAluno aprovado!");
		}else if(media>=5 && media<7){
			System.out.println("\nAluno de Exame!");
		}else {
			System.out.println("\nAluno Reprovado!");
		}
		
		System.out.println("\nLista de filmes");
		System.out.println("\n1- Beleza Americana");
		System.out.println("\n2- Os Vingadores");
		System.out.println("\n3- Homem-Aranha");
		System.out.println("\n4- Venom");
		System.out.println("\nDigite a sua opção: ");
		op = leia.nextInt();
		switch(op) {
		case 1:
			System.out.println("\nBeleza Americana");
			break;
		case 2:
			System.out.println("\nOs Vingadores");
			break;
		case 3:
			System.out.println("\nHomem-Aranha");
			break;
		case 4:
			System.out.println("\nVenom");
			break;
			default:
				System.out.println("\nOpção inválida!");
		}
		nota1 = Math.sqrt(nota2);
		nota2 = Math.pow(nota3, 3);
	}

}
