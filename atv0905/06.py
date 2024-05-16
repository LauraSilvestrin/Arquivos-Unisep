# Faça um programa que leia 10 inteiros positivos, ignorando não positivos, e imprima
# sua média.
cont = 0
soma = 0
while True:
    i = int(input("Digite um numero: "))
    if i >= 0:
        soma += i
        cont += 1
    if cont == 10:
        break