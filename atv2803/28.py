"""Uma empresa contrata um encanador a R$ 30,00 por dia. Faça um programa que
solicite o número de dias trabalhados pelo encanador e imprima a quantia líquida que
deverá ser paga, sabendo-se que são descontados 11% de previdência social, e após
isso 8% para imposto de renda"""
dias_trabalhados = int(input())
valor_dia = 30.0
salario_bruto = valor_dia * dias_trabalhados
desconto_previdencia = salario_bruto * 0.11
salario_apos_previdencia = salario_bruto - desconto_previdencia
desconto_imposto = salario_apos_previdencia * 0.08
salario_liquido = salario_apos_previdencia - desconto_imposto

# Imprime o salário líquido do encanador
print(f"O valor líquido a ser pago ao encanador é: {salario_liquido}")