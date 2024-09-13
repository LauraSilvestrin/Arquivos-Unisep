# Escreva um programa que receba como entrada o valor do saque realizado pelo cliente
# de um banco e retorne quantas notas de cada valor serão necessárias para atender ao
# saque com a menor quantidade de notas possível. Serão utilizadas notas de 200, 100,
# 50, 20, 10, 5, 2 e 1 real.

valor_do_saque = int(input("Digite o valor do saque: "))

notas = [200, 100, 50, 20, 10, 5, 2, 1]
quantidade_notas = 0
indice = 0

while valor_do_saque > 0 and indice < len(notas):
    nota = notas[indice]
    if valor_do_saque >= nota:
        quantidade_notas = valor_do_saque // nota
        valor_do_saque -= quantidade_notas * nota
        print(f"Notas de R${nota}: {quantidade_notas}")
    indice += 1
