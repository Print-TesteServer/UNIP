Algoritmo "Vetor4_SomaVetores"
Var
  i : inteiro
  A, B, C: vetor[0..9] de inteiro
Inicio
  //preencher o vetor A com valores de 10 a 100
  para i de 0 ate 9 passo 1 faca
      A[i]<-(i+1)*2
  fimpara
  
  //preencher o vetor B com valores digitados pelo teclado
  para i de 0 ate 9 passo 1 faca
       escreva("B[", i, "] = ")
       leia(B[i])
  fimpara

  //somando os vetores A e B
  para i de 0 ate 9 passo 1 faca
       C[i]<-A[i]+B[i]
       escreval("C[", i, "]= ", C[i])
  fimpara
Fimalgoritmo