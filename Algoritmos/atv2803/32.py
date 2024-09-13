"""Escreva um programa de ajuda para vendedor. A partir de um valor total lido mostre:
a. O total a pagar com desconto de 10%;
b. O valor de cada parcela, no parcelamento de 3x sem juros;
c. A comissão do vendedor, caso de a venda ser a vista (5% sobre o valor com
desconto);
d. A comissão do vendedor, caso de a venda ser parcelada (5% sobre o valor
total)"""
valor_total = float(input("Digite o valor total: "))
total_com_desconto = valor_total * 0.9
    
valor_parcela = valor_total / 3
    
comissao_venda_vista = total_com_desconto * 0.05
    
comissao_venda_parcelada = valor_total * 0.05
    

print(f"O total a pagar com desconto de 10% é: {total_com_desconto}")
print(f"O valor de cada parcela, no parcelamento de 3x sem juros, é: {valor_parcela}")
print(f"A comissão do vendedor, caso a venda seja à vista, é: {comissao_venda_vista}")
print(f"A comissão do vendedor, caso a venda seja parcelada, é: {comissao_venda_parcelada}")