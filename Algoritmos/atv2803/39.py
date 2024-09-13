"""Leia um número inteiro e imprima a soma do sucessor de seu triplo com o antecessor
de seu dobro."""
n = int(input("Digite um valor inteiro: "))

sucessor_triplo = (n * 3) + 1
antecessor_dobro = (n * 2) - 1

print(f"soma do sucessor de seu triplo com o antecessor de seu dobro {sucessor_triplo + antecessor_dobro}")