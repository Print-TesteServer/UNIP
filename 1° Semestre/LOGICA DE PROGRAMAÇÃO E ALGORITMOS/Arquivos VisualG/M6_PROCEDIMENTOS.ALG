Algoritmo "Procedimentos"
// Disciplina   : [Linguagem e Lógica de Programação]

// voz de comando: escreva o menu
procedimento escrevaMenu()
inicio
   escreval(" Operações ")
   escreval("[1] Fatorial ")
   escreval("[2] Area da Circunferência ")
   escreval("[3] Equação de 2o. grau" )
   escreva(" Digite a opção desejada [1/2/3]: " )
fimprocedimento

// Pergunta: Qual é o fatorial de n?
funcao fatorial(n : inteiro) : inteiro  // n é o parâmetro de entrada
var                                     // da função
    i, fat : inteiro                    // variáveis i e fat são var locais
inicio
    fat<-1
    para i de 1 até n passo 1 faça
        fat<-fat*i
    fimpara
    retorne fat
fimfuncao

//função que retorna o número do PI
função fPI() : real
inicio
      retorne 3.1415926535898
fimfuncao


//Pergunta: Qual é a área da circunferência?
funcao area(raio: real) : real  // Para responder, é necessário saber o raio
inicio                          // logo, raio é o parâmetro de entrada
      retorne fPI()*raio*raio
fimfuncao

// Pergunta: Qual é o valor do delta?
funcao delta(a, b, c : inteiro) : inteiro  //cada função tem apenas 1 retorna
inicio
      retorne b*b-4*a*c
fimfuncao

//
procedimento equacao2grau(a, b, c: inteiro)
var d : inteiro
inicio
     d <- delta(a,b,c)
     se (d>0) então
            escreval(" 1a. raiz é ", ((-1*b+raiz(d))/(2*a))))
            escreval(" 2a. raiz é ", ((-1*b-raiz(d))/(2*a))))
     senão
            escreva(" Não existem raízes reais ")
     fimse
fimprocedimento


//bloco de programa principal
Var
   opcao, n, r, a, b, c : inteiro
Inicio
   escrevaMenu()        // voz de comando <=> ordem <=> procedimento
   leia(opcao)

   escolha (opcao)
   caso 1
         escreva(" Você escolheu a opção 1, calcular o Fatorial de N")
         escreva(" então, digite um valor para N: ")
         leia(n)
         escreva(" Fatorial de n = ", fatorial(n))
   caso 2
        escreva(" Você escolheu calcular o Raio da Circunferência!")
        escreval(" então, digite o Raio: ")
        leia(r)
        escreva(" Área da circunferencia de raio ", r, " = ", area(r))
   caso 3
        escreval(" Você escolheu calcular a Equação de 2o grau")

        escreva(" A: ")
        leia(a)
        escreva(" B: ")
        leia(b)
        escreva(" C: ")
        leia(c)
        equacao2grau(a,b,c)
   outrocaso
        escreva("Opcao Invalida!")
   fimescolha
Fimalgoritmo