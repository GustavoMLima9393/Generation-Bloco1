/* 31) [DESAFIO] Crie um jogo de JoKenPo (Pedra-Papel-Tesoura) */

programa
{
    inclua biblioteca Util-->uti

    funcao inicio()
    {
        inteiro x, y=uti.sorteia(0, 2)

        escreva("\nJOGADOR : Escolha com qual vai jogar: Papel [0], Pedra [1], Tesoura [2]:")
        leia(x)

        y=uti.sorteia(0, 2)
        escreva("\nComputador escolheu: ",y,".\n")

        se(x==y)
        {
            escreva("Empate!")
        }
        se(x==0 e y==2)
        {
            escreva("Vitória do Computador")
        }
        se(x==0 e y==1)
        {
            escreva("Vitória do Jogador")
        }
        se(x==2 e y==0)
        {
            escreva("Vitória do Jogador")
        }
        se(x==2 e y==1)
        {
            escreva("Vitória do Computador")
        }
        se(x==1 e y==0)
        {
            escreva("Vitória do Computador")
        }
        se(x==1 e y==2)
        {
            escreva("Vitória do Jogador")
        }
    }
}
                
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 288; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */