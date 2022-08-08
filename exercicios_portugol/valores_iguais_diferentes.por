/*26) Escreva um algoritmo que leia dois números inteiros e compare-os, mostrando
na tela uma das mensagens abaixo:
 - O primeiro valor é o maior
 - O segundo valor é o maior
 - Não existe valor maior, os dois são iguais
*/

programa
{
	
	funcao inicio()
	{
		inteiro n1,n2,maior

		escreva("\nDigite um número: ")
		leia(n1)
		escreva("\nDigite outro número:" )
		leia(n2)
		se (n2>n1)
		{
			escreva("\nO segundo número é maior") 
		}
		senao se (n2<n1)
		escreva("\nO primeiro número é maior")
		senao se (n2==n1)
		escreva("\nNão existe valor maior, os dois são iguais")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 579; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */