"""Leia uma distância em milhas e apresente-a convertida em quilômetros. A fórmula de
conversão é: 𝐾 = 1.61 ∗ 𝑀, sendo K a distância em quilômetros e M em milhas."""
n = float(input("Digite o valor em milhas: "))
print(f"Valor em Km: {n * 1.61}")