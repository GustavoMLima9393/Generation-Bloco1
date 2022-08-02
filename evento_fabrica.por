programa
{
	
	funcao inicio()
	{
		inteiro umaHora = 3600, umMin = 60, umSeg = 1, horas, minutos, segundos
		escreva("\nEvento na fábrica durou: ")
		escreva("\nHoras: ")
		leia(horas)
		escreva("\nMinutos: ")
		leia(minutos)
		escreva("\nSegundos: ")
		leia(segundos)

		segundos+= (horas * umaHora) + (minutos * umMin) + (segundos % umSeg)
		escreva("O evento durou em segundos: ", segundos)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 379; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */