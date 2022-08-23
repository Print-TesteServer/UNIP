Algoritmo "Exercicio8_MultiplaEscolha"
Var
  idade, peso: inteiro

Inicio
      escreva("Digite a sua idade: ")
      leia(idade)
      
      escreva("Digite o seu peso: ")
      leia(peso)
      
      escolha idade
          caso 1 ate 20
                            escreval("Jovem menor de 20 anos")
                            escolha peso
                                 caso 01 ate 60    escreva("grupo de risco 9")
                                 caso 61 ate 90    escreva("grupo de risco 8")
                                 outrocaso        escreva("grupo de risco 7")
                            fimescolha
          caso 21 ate 60
                            escreval("Adulto entre 21 e 50 anos")
                            escolha peso
                                 caso 01 ate 60    escreva("grupo de risco 6")
                                 caso 61 ate 90    escreva("grupo de risco 5")
                                 outrocaso         escreva("grupo de risco 4")
                            fimescolha
          outrocaso
                            escreval("Adultos e Idosos acima de 50 anos")
                            escolha peso
                                 caso 01 ate 60    escreva("grupo de risco 3")
                                 caso 61 ate 90    escreva("grupo de risco 2")
                                 outrocaso         escreva("grupo de risco 1")
                            fimescolha
Fimalgoritmo