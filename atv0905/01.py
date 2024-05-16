# Faça um programa que determine e mostre os cinco primeiros múltiplos de 3,
# considerando números maiores que 0.
i = 1
cont = 0
while True:
    if i % 3 == 0:
        print(f"{i} é multiplo de três")
        cont += 1
    i += 1
    if cont == 3:
        break