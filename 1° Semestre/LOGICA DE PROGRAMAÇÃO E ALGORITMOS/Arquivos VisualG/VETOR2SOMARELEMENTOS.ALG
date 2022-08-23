Algoritmo "Vetor2SomarElementos"
Var
  i, soma : inteiro
  X: vetor[0..9] de inteiro
  
Inicio
  x[0]<-10
  soma<-X[0]
  para i de 1 ate 9 passo 1 faca
      X[i] <-(i+1)*10
      soma<-soma + X[i]
  fimpara
  
  escreva("Soma = ", soma)
  
Fimalgoritmo