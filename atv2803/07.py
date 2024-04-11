"""Leia uma temperatura em graus Fahrenheit e apresente-a convertida em graus Celsius.
A fórmula de conversão é: 𝐶 = 5.0 ∗ (𝐹−32.0)9.0, sendo que 𝐹 a temperatura em
Fahrenheit e 𝐶 a temperatura em Celsius."""

temp_fahrenheit = int(input("Temperatura em fahrenheit: "))
celcius = ((5/9)*(temp_fahrenheit-32))
print(celcius)