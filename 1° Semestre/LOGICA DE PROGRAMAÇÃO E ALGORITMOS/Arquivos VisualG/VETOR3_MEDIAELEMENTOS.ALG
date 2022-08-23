Algoritmo "Vetor3_MediaElementos"
Var
  media : real
  Nota: vetor[0..3] de real
  i : inteiro

Inicio
  media<-0
  para i de 0 ate 3 passo 1 faca
     escreva("Nota", i+1, " = ")
     leia(Nota[i])
     media<-media+Nota[i]
  fimpara
  media<-media/4
  escreva("Media Anual = ", media)
Fimalgoritmo