"""Faça a leitura de três valores e apresente como resultado a soma dos quadrados dos
três números lidos."""
n1, n2, n3 = {float(x) for x in input("Digite os tres numeros separados por espaço: ").split()}
print(f"O quadrado do primeiro valor é: {n1**2} \n O quadrado do segundo valor é: {n2**2} \n O quadrado do terceiro valor é: {n3**2} \n")