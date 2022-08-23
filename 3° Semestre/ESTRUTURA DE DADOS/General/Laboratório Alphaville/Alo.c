#include <stdio.h>

int main(void)
{ 
    char caractere;
    int inteiro;
    long longo;  
    float real;
    char cadeia[100];
    int flag;
    
 // printf("Digite caractere\t");  
 // scanf( "%c", &caractere);
  printf("Digite inteiro\t");  
  scanf( "%d", &inteiro);
//  printf("Digite longo\t");  
 // scanf( "%ld", &longo);
 // printf("Digite real\t");  
 // scanf( "%f", &real);
 // printf("Digite cadeia de caractere\t");  
 // scanf( "%s", &cadeia[0]);
 
    if (inteiro > 100)
        printf("resultado operador relacional = maior"); 
    else
        printf("resultado operador relacional = menor ou igual"); 
  
  
//  printf("Valor do caractere %c\nValor inteiro %4d\nValor longo %ld\nValor Real %2.2f\n", caractere,inteiro,longo,real);
 // printf("%s\n",cadeia);
  getchar();	
  return 0;

}
