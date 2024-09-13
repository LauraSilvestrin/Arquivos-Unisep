# Faça um programa que peça ao usuário digitar 10 valores e some-os;

soma = 0

for i in range(0, 10):
    n = int(input("Digite um numero: "))
    soma += n
print(soma)