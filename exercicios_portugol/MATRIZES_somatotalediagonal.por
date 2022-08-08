programa
{
	
	funcao inicio()
	{
		real user [3][3], somaVal = 0.0, somaDiag = 0.0
		para(inteiro i=0;i<3;i++)
		para(inteiro j=0;j<3;j++)
		{
			escreva("Entre com um número: ")
			leia(user [i][j])
			somaVal += user[i][j]
			se(i == j)
			{
				somaDiag += user[i][j]
			}
		}
	escreva("\n",somaVal)
	escreva("\n",somaDiag)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 331; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {user, 6, 7, 4};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */