"""Calcule a média de um aluno na disciplina de ED. Para isso solicite o nome do aluno, a
nota da prova e a nota qualitativa. Sabe-se que a nota da prova tem peso 2 e a nota
qualitativa peso 1. Mostre a média como resultado."""

aluno = input("Aluno: ")
prova = float(input("Nota da prova: "))
qualitativa = float(input("Nota qualitativa: "))
print(f"Média final do aluno {aluno}: {(qualitativa + (prova*2))/3}")