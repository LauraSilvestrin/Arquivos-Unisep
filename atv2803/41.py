""" Faça um programa para ler as dimensões de um terreno (comprimento e largura), com
como o preço do metro de tela. Imprima o custo para cercar este mesmo terreno com
tela."""

comprimento = float(input("Digite o comprimento do terreno em metros: "))
largura = float(input("Digite a largura do terreno em metros: "))
preco_por_metro = float(input("Digite o preço do metro de tela: "))

quantidade_tela = 2 * (comprimento + largura)

custo_total = quantidade_tela * preco_por_metro

print("O custo para cercar o terreno é de R$ {:.2f}".format(custo_total))