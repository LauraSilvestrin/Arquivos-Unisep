"""Calcule a média de quatro números inteiros dados."""
n1, n2, n3, n4 = [float(x) for x in input("Digite 4 números separados por espaço: \n").split()]
print(f"Média: {(n1+n2+n3+n4)/4}")