"""Leia uma temperatura em graus Kelvin e apresente-a convertida em graus Celsius. A
fórmula de conversão é: 𝐶 = 𝐾 − 273.15, sendo 𝐶 a temperatura em Celsius e 𝐾 a
temperatura em Kelvin."""

kelvin = float(input())

celsius = kelvin - 273.15

print(f"{kelvin} Kelvin é igual a {celsius} Celsius.")