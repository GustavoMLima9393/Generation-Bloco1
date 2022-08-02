programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
		real media, soma=0, quantNum=0
		inteiro numero=0

		enquanto (numero>=0)
		{
			escreva("\nEntre com um número: ")
			leia(numero)
			se(numero>0)
		     {
				soma = soma+numero
				quantNum ++
		     }
		}
		media = soma/quantNum
		escreva("\nMédia dos valores lidos: ", mat.arredondar(media,2))
		escreva("\nSoma dos valores: ", soma)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 373; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */