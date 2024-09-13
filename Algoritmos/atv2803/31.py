"""Receba o salário-base de um funcionário. Calcule e imprima o salário a receber,
sabendo-se que esse funcionário em uma gratificação de 5% sobre o salário-base.
Além disso, ele paga 7% de imposto sobre o salário-base."""
salario_base = float(input())

gratificacao = salario_base * 0.05
imposto = salario_base * 0.07
salario_a_receber = salario_base + gratificacao - imposto

print(f"O salário a receber é: {salario_a_receber}")