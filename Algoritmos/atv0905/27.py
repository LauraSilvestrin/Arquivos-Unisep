# Faça um programa que some os termos de valor par da sequencia de Fibonacci, cujos
# valores não ultrapassem quatro milhões.

i = 1
while i < 4000000:
    if (i + (i-1))%2 == 0:
            i += (i-1)
print(i)