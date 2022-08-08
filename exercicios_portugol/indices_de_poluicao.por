programa
{
	
	funcao inicio()
	{
		real a
		escreva("\nIndice de poluição: ")
		leia(a)

		se (a>=0.05 e a<=0.25)
		{
			escreva("\nIndice de poluição aceitável")
		}
		senao se (a>=0.3 e a<0.4)
		{
			escreva("\nIndústrias do 1º grupo devem suspender suas atividades")
		}
		senao se (a>=0.4 e a<0.5)
		{
			escreva("\nIndústrias do 1º e 2º grupo devem suspender suas atividades")
		}
		senao se (a>=0.5)
		{
			escreva("\nTodos os grupos devem paralisar suas atividades")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 197; 
 * @PONTOS-DE-PARADA = 6;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */