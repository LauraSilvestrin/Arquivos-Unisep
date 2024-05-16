"""Faça um programa que leia o valor da hora de trabalho em reais e número de horas
trabalhadas no mês. Imprima o valor a ser pago ao funcionário, adicionando 10% sobre
o valor calculado."""
valor_hora = 20  
horas_trabalhadas = 160  
salario_sem_adicional = valor_hora * horas_trabalhadas
salario_com_adicional = salario_sem_adicional * 1.10
print(f"O valor a ser pago ao funcionário é: {salario_com_adicional}")