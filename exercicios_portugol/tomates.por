programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
		real peso, excesso, multa
		escreva ("Entre com o peso total dos tomates: ")
		leia(peso)


		se(peso > 50)
		{
			excesso = peso - 50
			multa = excesso * 4
			escreva("\nPeso ", mat.arredondar(peso, 1), "\nExcesso ", mat.arredondar(excesso, 1), "\nMulta ", mat.arredondar(multa, 1))
			
		}
		senao
		{
			excesso = 0
			multa = 0
			escreva("\nPeso ", mat.arredondar(peso, 1), "\nExcesso ", mat.arredondar(excesso, 1), "\nMulta ", mat.arredondar(multa, 1))
			}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 529; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */