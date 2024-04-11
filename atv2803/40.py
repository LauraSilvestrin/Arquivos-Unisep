"""Três amigos jogaram na loteria. Caso eles ganhem, o prêmio deve ser repartido
proporcionalmente ao valor que cada um deu para a realização da aposta. Faça um
programa que leia quanto cada apostador investiu, o valor do prêmio, e imprima
quanto cada um ganharia do prêmio com base no valor investido."""
investimento1 = float(input("Digite o valor investido pelo primeiro apostador: "))
investimento2 = float(input("Digite o valor investido pelo segundo apostador: "))
investimento3 = float(input("Digite o valor investido pelo terceiro apostador: "))
premio = float(input("Digite o valor do prêmio: "))

investimento_total = investimento1 + investimento2 + investimento3

parte1 = (investimento1 / investimento_total) * premio
parte2 = (investimento2 / investimento_total) * premio
parte3 = (investimento3 / investimento_total) * premio

print("A parte do prêmio do primeiro apostador é de R$ {:.2f}".format(parte1))
print("A parte do prêmio do segundo apostador é de R$ {:.2f}".format(parte2))
print("A parte do prêmio do terceiro apostador é de R$ {:.2f}".format(parte3))