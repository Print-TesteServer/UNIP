Algoritmo "Vetor6_ExercicioProposto7"

Var
   X, Y : vetor[0..4] de inteiro
   Z : vetor[0..9] de inteiro
   cont, contX, contY : inteiro
Inicio
   //preencher Vetor X
   para cont de 0 ate 4 passo 1 faca
       escreva("X[", cont, "] = ")
       leia(X[cont])
   fimpara

   //preencher vetor Y
   para cont de 0 ate 4 passo 1 faca
       escreva("Y[", cont, "] = ")
       leia(Y[cont])
   fimpara

   //preencher Vetor Z
   contX<-0
   contY<-0
   para cont de 0 ate 9 passo 1 faca
        se ((cont mod 2)=0) entao
           Z[cont]<-X[contX]
           contX<-contX+1
        senao
           Z[cont]<-Y[contY]
           contY<-contY+1
        fimse
   fimpara
   
   //escreva Vetor Z
   
   para cont de 0 ate 9 passo 1 faca
        escreval("Z[", cont, "] = ", Z[cont])
   fimpara
Fimalgoritmo