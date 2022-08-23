Algoritmo "VetorExemplo01"
// Disciplina   : [Linguagem e Lógica de Programação]

Var
   vet: vetor[0..4] de inteiro
   i: inteiro
   
Inicio
   para i de 0 ate 4 passo 1 faca
       escreva("Vet[", i, "] = ")
       leia(vet[i])
   fimpara
   
   escreval("Os valores do vetor são:")
   para i de 0 ate 4 passo 1 faca
        escreval("Vet[", i, "] = ", vet[i])
   fimpara
Fimalgoritmo