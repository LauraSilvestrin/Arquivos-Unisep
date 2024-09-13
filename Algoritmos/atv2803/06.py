"""Leia uma temperatura em graus Celsius e apresente-a convertida em graus Fahrenheit.
A fórmula de conversão é: 𝐹 = 𝐶 ∗ (9.0 5.0 ) + 32.0, sendo que 𝐹 a temperatura em
Fahrenheit e 𝐶 a temperatura em Celsius.
"""
temp_celsius = int(input("Temperatura em celcius: "))
fahrenheit = ((9/5)*temp_celsius)+32
print(fahrenheit)