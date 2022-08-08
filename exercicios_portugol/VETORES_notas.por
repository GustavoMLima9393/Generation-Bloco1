/* 1. Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente. */
programa
{
	
	funcao inicio()
	{
		real maiorNota=0.0,num[5]
		inteiro x

		para(x=0;x<5;x++)
		{
			escreva("\nEntre com a nota: ")
			leia(num[x])
			escreva("\nA nota de: ",x+1, " foi de: ",num[x])
			se(maiorNota<num[x])
				{
				maiorNota = num[x]
				}
		}
		escreva("\nA maior nota da atividade foi: ",maiorNota)
	}
}	
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 395; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {num, 8, 21, 3};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */