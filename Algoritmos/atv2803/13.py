"""Leia uma distância em quilômetros e apresente-a convertida em milhas. A fórmula de
conversão é: 𝑀 = 𝐾1.61, sendo K a distância em quilômetros e M em milhas."""
n = float(input("Digite o valor em quilometros: "))
print(f"Valor em milhas: {n / 1.61}")