"""Faça um programa que leia um número inteiro positivo de três dígitos (de 100 a 999).
Gere outro numero formado pelos dígitos invertidos do número lido. Exemplo: 
Número Lido = 123
Número Gerado = 321"""
n = input("Digite um número: ")
str_n_invertido = n[::-1]

print(f"O número com os dígitos invertidos é: {str_n_invertido}")