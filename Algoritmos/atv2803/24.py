"""Sejam 𝑏 e 𝑏 os catetos de um triangulo, onde a hipotenusa é obtida pela equação
ℎ𝑖𝑝𝑜𝑡𝑒𝑛𝑢𝑠𝑎 = √𝑎
2 + 𝑏². Faça um programa que receba os valores de 𝑎 e 𝑏 e calculo
o valor da hipotenusa através da equação. Imprima o resultado dessa operação."""

import math
a = float(input("Digite o valor de A: "))
b = float(input("Digite o valor de B: "))
hipotenusa = math.sqrt(a**2 + b**2)

# Imprime a hipotenusa
print(f"A hipotenusa do triângulo com catetos {a} e {b} é: {hipotenusa}")