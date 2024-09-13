"""Faça um programa para converter uma letra maiúscula em letra minúscula. Use a
tabela ASCII para resolver o problema."""
letra_maiuscula = input("Digite uma letra maiuscula: ")

valor_ascii = ord(letra_maiuscula)
    
valor_ascii_minusculo = valor_ascii + 32
    
letra_minuscula = chr(valor_ascii_minusculo)


print(f"A letra minúscula correspondente a {letra_maiuscula} é {letra_minuscula}.")