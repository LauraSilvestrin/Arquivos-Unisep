"""Sabendo que a média de aprovação é 7, e a formula para cálculo da
média consiste em a primeira avaliação com peso 1 e a segunda
avaliação com peso 2, sendo divido por 3, realize o cálculo de quanto
deve ser a nota da segunda avaliação para que o resultado seja a
aprovação. Elabore a fórmula para o cálculo e a representação do
algoritmo para o mesmo."""

aluno = input("Aluno: ")
n1 = float(input("Nota 1:"))
media = 7
print(f"{aluno} precisa de {((media*3)-n1)/2} pontos para ser aprovado")