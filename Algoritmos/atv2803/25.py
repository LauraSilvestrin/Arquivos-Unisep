"""Leia a altura e raio de um cilindro circular e imprima o volume do cilindro. O volume de
um cilindro circular é calculado por meio da seguinte fórmula: 𝑉 = 𝜋 ∗ 𝑟𝑎𝑖𝑜² onde 𝜋 =
3.141592.
"""
import math

altura = float(input("Digite o valor da altura do cilindro: "))
raio = float(input("Digite o valor do raio: "))
volume = math.pi * raio**2 * altura

print(f"O volume do cilindro com altura {altura} e raio {raio} é: {volume}")