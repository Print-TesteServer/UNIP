Algoritmo "SEGURO DESEMPREGO"
//****************************************/
//* Aluno1: Luigi Taborda                */
//* Aluno2: Matheus dos Santos Ferreira  */
//* LPA e IPE                            */
//* Turma: CC2A39                        */
//* Prof. Eliane                         */
//****************************************/
Var
   Mes1, Mes2, Mes3, Total, Media : real
   Requisitos , Fechar_Programa:logico
   QuantosSalarios, SalarioPorMes,  Resposta, Trabalhador, VinculoEmpregaticio, Parcelas  : inteiro
   INSS, VendaDePescado, Dispensado, RendaPropria, Trabalhou, Resgatado, Contrato, Curso : inteiro
   SalariosDe6Meses, MesesDeTrabalho, Desempregado, Beneficio: inteiro

Inicio
   //Tipos de Trabalador R1 + R2
   enquanto (Fechar_Programa=falso) faça
      escreval("----------------Tipos de Trabalhadores-----------------")
      escreval("Em qual desses quadros o senhor(a) se encaixa:        |")
      escreval("[1]-Trabalhador Formal;                               |")
      escreval("[2]-Bolsa de Qualificação Social;                     |")
      escreval("[3]-Empregado Doméstico;                              |")
      escreval("[4]Pescador Artesanal;                                |")
      escreval("[5]-Trabalhador Resgatado.                            |")
      escreval("-------------------------------------------------------")
      leia (Trabalhador)
      escolha (Trabalhador)
         //Trabalhador Formal
      caso 1
         escreval("---------------------------------------------------")
         escreval("Foi dispensado sem justa causa?                   |")
         escreval("[1]-SIM | [2]-NÃO                                 |")
         escreval("---------------------------------------------------")
         leia(Dispensado)
         se (Dispensado=1) então
            escreval("-----------------------------------------------------------------------")
            escreval("Recebeu salários de pessoa jurídica ou pessoa física, no período      |")
            escreval("de 6 meses consecutivos, imediatamente anteriores à data de dispensa? |")
            escreval("[1]-SIM | [2]-NÃO                                                     |")
            escreval("-----------------------------------------------------------------------")
            leia(SalariosDe6Meses)
            se (SalariosDe6Meses=1) então
               escreval("--------------------------------------------------------")
               escreval("Está desempregado quando do requerimento do benefício? |")
               escreval("[1]-SIM | [2]-NÃO                                      |")
               escreval("--------------------------------------------------------")
               leia(Desempregado)
               se (Desempregado=1) então
                  escreval("-----------------------------------------------------------------------")
                  escreval("possui renda própria de qualquer natureza suficiente à sua manutenção |")
                  escreval("e a de sua família?                                                   |")
                  escreval("[1]-SIM | [2]-NÃO                                                     |")
                  escreval("-----------------------------------------------------------------------")
                  leia(RendaPropria)
                  se (RendaPropria=2) então
                     escreval("-----------------------------------------------------------------------------")
                     escreval("Foi empregado de pessoa jurídica ou de pessoa física equiparada à jurídica, |")
                     escreval("pelo menos 12 meses nos últimos 36 meses que antecedam a data de dispensa?  |")
                     escreval("[1]-SIM | [2]-NÃO                                                           |")
                     escreval("-----------------------------------------------------------------------------")
                     leia(MesesDeTrabalho)
                     se(MesesDeTrabalho=1) então
                        escreval("----------------------------------------------------------------------------")
                        escreval("Está em gozo de qualquer benefício previdenciário de prestação continuada, |")
                        escreval("com exceção do auxílio-acidente e pensão por morte?                        |")
                        escreval("[1]-SIM | [2]-NÃO                                                          |")
                        escreval("----------------------------------------------------------------------------")
                        leia(Beneficio)
                        se (Beneficio = 2)então
                           Requisitos <- verdadeiro
                        fimse
                     fimse
                  fimse
               fimse
            fimse
         fimse
      caso 2
         escreval("---------------------------------------------------")
         escreval("Está com contrato de trabalho suspenso?           |")
         escreval("[1]-SIM | [2]-NÃO                                 |")
         escreval("---------------------------------------------------")
         leia(Contrato)
         se (Contrato=1) então
            escreval("-------------------------------------------------------------------")
            escreval("Está devidamente matriculado em curso ou programa de qualificação |")
            escreval(" profissional oferecido pelo empregador?                          |")
            escreval("[1]-SIM | [2]-NÃO                                                 |")
            escreval("-------------------------------------------------------------------")
            leia(Curso)
            se (Curso=1) então
               Requisitos <- verdadeiro
            fimse
         fimse
      caso 3
         escreval("---------------------------------------------------")
         escreval("Foi dispensado sem justa causa?                   |")
         escreval("[1]-SIM | [2]-NÃO                                 |")
         escreval("---------------------------------------------------")
         leia(Dispensado)
         se (Dispensado=1) então
            escreval("--------------------------------------------------------")
            escreval("Está desempregado quando do requerimento do benefício? |")
            escreval("[1]-SIM | [2]-NÃO                                      |")
            escreval("--------------------------------------------------------")
            leia(Desempregado)
            se (Desempregado=1) então
               escreval("-----------------------------------------------------------------------")
               escreval("possui renda própria de qualquer natureza suficiente à sua manutenção |")
               escreval("e a de sua família?                                                   |")
               escreval("[1]-SIM | [2]-NÃO                                                     |")
               escreval("-----------------------------------------------------------------------")
               leia(RendaPropria)
               se (RendaPropria=2) então
                  escreval("----------------------------------------------------------------------------------")
                  escreval("Trabalhou, exclusivamente, como empregado doméstico, pelo período mínimo de      |")
                  escreval("15 meses nos últimos 24 meses que antecederam a data de dispensa que deu origem  |")
                  escreval("ao requerimento do seguro-desemprego?                                            |")
                  escreval("[1]-SIM | [2]-NÃO                                                                |")
                  escreval("----------------------------------------------------------------------------------")
                  leia(MesesDeTrabalho)
                  se(MesesDeTrabalho=1) então
                     escreval("----------------------------------------------------------------------------")
                     escreval("Está em gozo de qualquer benefício previdenciário de prestação continuada, |")
                     escreval("com exceção do auxílio-acidente e pensão por morte?                        |")
                     escreval("[1]-SIM | [2]-NÃO                                                          |")
                     escreval("----------------------------------------------------------------------------")
                     leia(Beneficio)
                     se (Beneficio = 2)então
                        Requisitos <- verdadeiro
                     fimse
                  fimse
               fimse
            fimse
         fimse
      caso 4
         escreval("---------------------------------------------------------------------")
         escreval("Possuiu inscrição no INSS como segurado especial? [1]-SIM | [2]-NÃO |")
         escreval("---------------------------------------------------------------------")
         leia(INSS)
         se (INSS=1) então
            escreval("--------------------------------------------------------------------------------")
            escreval("Possuiu comprovação de venda do pescado a adquirente pessoa jurídica ou        |")
            escreval("cooperativa, no período correspondente aos últimos 12 meses que antecederam ao |")
            escreval("início do defeso?                                                              |")
            escreval("[1]-SIM | [2]-NÃO                                                              |")
            escreval("--------------------------------------------------------------------------------")
            leia(VendaDePescado)
            se (VendaDePescado=1) então
               escreval("---------------------------------------------------------------------------------")
               escreval("Tem vínculo de emprego ou outra relação de trabalho ou outra fonte de renda     |")
               escreval("diversa da decorrente da atividade pesqueira?                                   |")
               escreval("e a de sua família?                                                             |")
               escreval("[1]-SIM | [2]-NÃO                                                               |")
               escreval("---------------------------------------------------------------------------------")
               leia(Desempregado)
               se (Desempregado=2) então
                  escreval("----------------------------------------------------------------------------")
                  escreval("Está em gozo de qualquer benefício previdenciário de prestação continuada, |")
                  escreval("com exceção do auxílio-acidente e pensão por morte?                        |")
                  escreval("[1]-SIM | [2]-NÃO                                                          |")
                  escreval("----------------------------------------------------------------------------")
                  leia(Beneficio)
                  se (Beneficio=2)então
                     Requisitos <- verdadeiro
                  fimse
               fimse
            fimse
         fimse
      caso 5
         escreval("---------------------------------------------------------------------")
         escreval("Possuiu inscrição no INSS como segurado especial? [1]-SIM | [2]-NÃO |")
         escreval("---------------------------------------------------------------------")
         leia(INSS)
         se (INSS=1) então
            escreval("--------------------------------------------------------------------------------")
            escreval("Foi resgatado do regime de trabalho forçado ou da condição                     |")
            escreval("análoga à de escravo em decorrência de ação de fiscalização do MTE?            |")
            escreval("[1]-SIM | [2]-NÃO                                                              |")
            escreval("--------------------------------------------------------------------------------")
            leia(Resgatado)
            se (Resgatado=1) então
               escreval("--------------------------------------------------------")
               escreval("Está desempregado quando do requerimento do benefício? |")
               escreval("[1]-SIM | [2]-NÃO                                      |")
               escreval("--------------------------------------------------------")
               leia(Desempregado)
               se (Desempregado=1) então
                  escreval("----------------------------------------------------------------------------")
                  escreval("Está em gozo de qualquer benefício previdenciário de prestação continuada, |")
                  escreval("com exceção do auxílio-acidente e pensão por morte?                        |")
                  escreval("[1]-SIM | [2]-NÃO                                                          |")
                  escreval("----------------------------------------------------------------------------")
                  leia(Beneficio)
                  se (Beneficio=2)então
                     escreval("-----------------------------------------------------------------------")
                     escreval("possui renda própria de qualquer natureza suficiente à sua manutenção |")
                     escreval("e a de sua família?                                                   |")
                     escreval("[1]-SIM | [2]-NÃO                                                     |")
                     escreval("-----------------------------------------------------------------------")
                     leia(RendaPropria)
                     se (RendaPropria=2) então
                        Requisitos <- verdadeiro
                     fimse
                  fimse
               fimse
            fimse
         fimse
      fimescolha
      se (Requisitos = verdadeiro ) então
            escreval("---------------------------REQUISITOS CUMPRIDOS--------------------------------")
            escreval(" ")
            escreval("-------------------------------CONTINUANDO-------------------------------------")
         senão
            escreval("-------------------------REQUESITOS NÂO CUMPRIDOS------------------------------")
         fimse
         //Quantidade de Parcelas  R3
         se(Requisitos= Verdadeiro) então
            escreval(" ")
            escreval("-------------------------------------------------------------------------------")
            escreval(" Sálarios recebido nos ultimos 3 meses:                                       |")
            escreval("[1]- 3 Salários                                                               |")
            escreval("[2]- 2 Sálários                                                               |")
            escreval("[3]- 1 Salário                                                                |")
            escreval("[4]- 0 Nenhum                                                                 |")
            escreval("---------------------------Quantidade de parcelas------------------------------")
            leia(QuantosSalarios)
            se (QuantosSalarios=1) então
               escreval("3 Salários")
               SalarioPorMes <- 3
            fimse
            se (QuantosSalarios=2)então
               escreval("2 Salários")
               SalarioPorMes <- 2
            fimse
            se (QuantosSalarios=3) então
               escreval("1 Salário")
               SalarioPorMes <- 1
            fimse
            se (QuantosSalarios=4) então
               escreval("Nenhum")
               SalarioPorMes <- 0
            fimse
            escreval("-------------------------------------------------------------------------------")
            escreval("A assistência financeira é concedida em no máximo cinco parcelas,             |")
            escreval("de forma contínua ou alternada, a cada período aquisitivo de dezesseis meses. |")
            escreval("-------------------------------------------------------------------------------")
            escreval("É preciso comprovar vínculo empregatício                                      |")
            escreval("Quanto Meses?                                                                 |")
            escreval("[1]- 6 a 11 Meses - nos últimos 3 anos;                                       |")
            escreval("[2]- 12 a 23 Mese - nos últimos 3 anos;                                       |")
            escreval("[3]- Minimo 24 Meses - nos últimos 3 anos;                                    |")
            escreval("[4]- Nenhum                                                                   |")
            escreval("-------------------------------------------------------------------------------")
            leia(VinculoEmpregaticio)
            se (VinculoEmpregaticio=1) então
               escreval("Você receberá 3 Parcelas")
               Parcelas <- 3
            fimse
            se (VinculoEmpregaticio=2)então
               escreval("Você receberá 4 Parcelas")
               Parcelas <- 4
            fimse
            se (VinculoEmpregaticio=3) então
               escreval("Você receberá 5 Parcelas")
               Parcelas <- 5
            fimse
            se (VinculoEmpregaticio=4) então
               escreval("Nenhum")
               Parcelas <- 0
            fimse
            se (Parcelas>=1) então
               escreval("--------------------------------------------------------------------------------------------------------")
               escreval("Período aquisitivo é o limite de tempo que estabelece a carência para recebimento do benefício.        |")
               escreval(" Assim, a partir da data da última dispensa que habilitar o trabalhador a receber o Seguro-Desemprego, |")
               escreval("deve-se contar os dezesseis meses que compõem o período aquisitivo.                                    |")
               escreval("--------------------------------------------------------------------------------------------------------")
               //Calculo do beneficio R4
               escreval(" ")
               escreval("-----------------------------------------Calculo do beneficio------------------------------------------|")
               escreval("Digite o Salario recebido no antepenúltimo Mês:                                                        |")
               leia(Mes3)
               escreval("Digite o Salario recebido no Penúltimo Mês:                                                            |")
               leia(Mes2)
               escreval("Digite o Salario recebido no Ultimo Mês:                                                               |")
               leia(Mes1)
               escreval("--------------------------------------------------------------------------------------------------------")
            fimse
            se(Parcelas<>0) então
               Media <- (Mes1 + Mes2 + Mes3)/3
               escreval(" ")
               escreval("-------------------------------------------------Média--------------------------------------------------")
            fimse
            se(Media>=1045.00) e (Media<=1222.77) então
               Total <- (Media * 0.8)
            fimse
            se(Media>=1222.78) e (Media<=2038.15) então
               Total <- 978.22 + (Media *0.5)
            fimse
            se(Media>2038.15)então
               Total <- 1385.91
            fimse
         fimse
      se(Requisitos=Verdadeiro) e (Parcelas<>0) e (Total>1045.00)  então
         escreval(" O seu BENEFICIO é de: ", Parcelas, " parcelas de ", Total)
      fimse
      se(Requisitos=Verdadeiro) e (Parcelas<>0) e (Total<1045.00) então
         escreval(" O seu BENEFICIO é de: ", Parcelas, " parcelas de 1045.00")
      fimse
      se (Parcelas=0) e (Requisitos=Verdadeiro) então
         escreval("-------------------------REQUESITOS NÂO CUMPRIDOS------------------------------")
      fimse
      escreval("Deseja fechar o programa?")
      escreval("[1]-SIM [2]-NÃO")
      leia(Resposta)
      se (Resposta=1) então
         Fechar_Programa <- Verdadeiro
      fimse
   fimenquanto
Fimalgoritmo