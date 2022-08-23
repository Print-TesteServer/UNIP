algoritmo "exercicios_caso_procedimento"

procedimento escrevaMenu()
inicio
   escreval(" Operações ")
   escreval("[1] Quadrado da diferença de dois números ")
   escreval("[2] Quadrado da soma de dois números ")
   escreval("[3] Soma do quadrado de dois números" )
   escreval("[4] Diferença do quadrado de dois números" )
   escreval("[5] Produto da soma com a diferença de dois números" )
   escreval("[6] Cálculo de um quadrado" )
   escreval("[7] Cálculo de um triângulo" )
   escreval("[8] Cálculo de um retângulo" )
   escreval("[9] Cálculo de um trapézio" )
   escreva(" Digite a opção desejada [1/2/3/4/5/6/7/8/9]: " )
fimprocedimento

//PROCEDIMENTO CASO 1
procedimento quadradodif(a, b : inteiro)
var
   c: inteiro
inicio
   c<- (a-b)*(a-b)
    escreva("O quadrado da diferença de",a,"e",b," = ", c)
fimprocedimento

//PROCEDIMENTO CASO 2
procedimento quadradosoma(a, b : inteiro)
var
   c: inteiro
inicio
   c<- (a+b)*(a+b)
    escreva("O quadrado da soma é de ",a,"e",b," = ", c)
fimprocedimento

//PROCEDIMENTO CASO 3
procedimento somaquadrado(a, b : inteiro)
var
   c: inteiro
inicio
   c<- (a*a)+(b*b)
   escreva("A soma do quadrado de ",a,"e",b," = ", c)
fimprocedimento

//PROCEDIMENTO CASO 4
procedimento difquadrado(a, b : inteiro)
var
   c: inteiro
inicio
   c<- (a*a)-(b*b)
    escreva("A diferença do quadrado de ",a,"e",b," = ", c)
fimprocedimento

//PROCEDIMENTO CASO 5
procedimento produto(a, b : inteiro)
var
   c: inteiro
inicio
   c<- (a-a)*(a+b)
    escreva("O produto da soma e diferença de",a," e",b," = ", c)
fimprocedimento

//PROCEDIMENTO CASO 6
procedimento fquadrado(a, b : inteiro)
var
   c: inteiro
inicio
   c<- a*b
    escreva("A figura geométrica de um quadrado de lados",a," e",b," = ", c)
fimprocedimento

//PROCEDIMENTO CASO 7
procedimento ftriangulo(base, altura : inteiro)
var
   c: real
inicio
   c<- (base * altura)/2
    escreva("A figura geométrica de um triângulo de base",base," e altura",altura," = ", c)
fimprocedimento

//PROCEDIMENTO CASO 8
procedimento fretangulo(base, altura : inteiro)
var
   c: real
inicio
   c<- base * altura
    escreva("A figura geométrica de um retângulo de base ",base," e altura",altura," = ", c)
fimprocedimento

//PROCEDIMENTO CASO 9
procedimento ftrapezio(basemen, basemai, altura: inteiro)
var
   c: real
inicio
   c<- ((basemai + basemen) * altura)/2
    escreva("A figura geométrica de um trapézio de base menor",basemen,", base maior",basemai," e altura",altura," = ", c)
fimprocedimento

var
   opcao,a , b, base, altura, basemai, basemen: inteiro
inicio
    escrevaMenu()
   leia(opcao)

   escolha (opcao)
   caso 1
         escreva("N1: ")
         leia(a)
         escreva("N2: ")
         leia(b)
         quadradodif(a,b)
   caso 2
         escreva("N1: ")
         leia(a)
         escreva("N2: ")
         leia(b)
         quadradosoma(a,b)

   caso 3
         escreva("N1: ")
         leia(a)
         escreva("N2: ")
         leia(b)
         somaquadrado(a,b)
   caso 4
         escreva("N1: ")
         leia(a)
         escreva("N2: ")
         leia(b)
         difquadrado(a,b)
   caso 5
         escreva("N1: ")
         leia(a)
         escreva("N2: ")
         leia(b)
         produto(a,b)
   caso 6
         escreva("Lado 1: ")
         leia(a)
         escreva("Lado 2: ")
         leia(b)
         fquadrado(a,b)
   caso 7
         escreva("Base: ")
         leia(base)
         escreva("Altura: ")
         leia(altura)
         ftriangulo(base, altura)
   caso 8
         escreva("Base: ")
         leia(base)
         escreva("Altura: ")
         leia(altura)
         fretangulo(base, altura)
   caso 9
         escreva("Base Menor: ")
         leia(basemen)
         escreva("Base Maior: ")
         leia(basemai)
         escreva("Altura: ")
         leia(altura)
         ftrapezio(basemen, basemai, altura)
   outrocaso
        escreva("Opcao Invalida!")
   fimescolha
fimalgoritmo
