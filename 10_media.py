"""Sabendo que a média de aprovação é 7, e a formula para cálculo da
média consiste em a primeira avaliação com peso 1 e a segunda
avaliação com peso 2, sendo divido por 3, realize o cálculo de quanto
deve ser a nota da primeira avaliação para que o resultado seja a
aprovação. Elabore a fórmula para o cálculo e a representação do
algoritmo para o mesmo."""

nota_primeira_avaliacao = float(input("Digite a nota da primeira avaliação: "))
media_desejada = 7

nota_segunda_avaliacao = (media_desejada * 3 - nota_primeira_avaliacao) / 2
print(f"A nota necessária na segunda avaliação para que a média seja 7 é {nota_segunda_avaliacao}.")
