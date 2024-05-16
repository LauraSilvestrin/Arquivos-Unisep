# Um funcionário receber aumento anual. Em 1995 foi contratado por 2000 reais. Em
# 1996 recebeu um aumento de 1,5%. A partir de 1997, os aumentos sempre
# correspondem ao dobro do ano anterior. Faça um programa que determine o salário
# atual do funcionário.

salario = 2000 
aumento = 1.5/100
salario += 2000 * aumento
for ano in range(1997, 2025):
    aumento *= 2
    salario += salario * aumento

print(salario) 