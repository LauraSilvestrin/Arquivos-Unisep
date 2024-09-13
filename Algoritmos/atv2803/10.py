"""Leia uma velocidade em km/h (quilômetros por hora) e apresente-a convertida
em m/s (metros por segundo). A fórmula de conversão é: 𝑀 =𝐾3.6, sendo 𝐾 a
velocidade em km/h e 𝑀 em m/s."""
n = float(input("Digite o valor em Km/h: "))
print(f"Em m/s: {n*3.6}")