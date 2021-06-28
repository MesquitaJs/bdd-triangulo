# language: pt
Funcionalidade: Verificar se um triangulo e valido e a qual tipo ele corresponde

  Cenario: Lados inseridos nao formam um triangulo
    Dado que um triangulo foi inicializado
    Quando os numeros 2, 6, 8 sao informados
    Entao a verificacao nao e valida

  Cenario: Lados inseridos formam um triangulo equilatero
    Dado que um triangulo foi inicializado
    Quando os numeros 40, 40, 40 sao informados
    Entao eles formam um triangulo do tipo equilatero

  Cenario: Lados inseridos formam um triangulo isosceles
    Dado que um triangulo foi inicializado
    Quando os numeros 40, 30, 40 sao informados
    Entao eles formam um triangulo do tipo isosceles

  Cenario: Lados inseridos formam um triangulo escaleno
    Dado que um triangulo foi inicializado
    Quando os numeros 16, 20, 30 sao informados
    Entao eles formam um triangulo do tipo escaleno
