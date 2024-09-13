"""Peça ao usuário para digitar três valores inteiros e imprima a soma deles."""
a, b, c = [int(x) for x in input("Digite 3 numeros separados por espaço: ").split()]
print(f"Soma: {a + b + c}")
