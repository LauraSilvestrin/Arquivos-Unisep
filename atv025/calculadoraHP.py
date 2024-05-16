# Desenvolva uma calculadora estilo HP. Irá solicitar para o usuário informar a opção
# 1 - Adição
# 2- Subtração
# 3 - Multiplicação
# 4 - Divisão
# X - Sair
# Quando escolher uma das opções, irá receber os valores numéricos até o usuário digitar a
# letra P, posterior a isso exibirá o resultado do calculo escolhido, e voltará para o menu.
opcao = ""
while opcao.upper() != "X":
    print("Selecione uma opção: ")
    print("1 - Adição")
    print("2 - Subtração")
    print("3 - Multiplicação")
    print("4 - Divisão")
    print("X - Sair")
    opcao = input()

    n = ""
    resultado = 0
    if opcao.upper() != "X":
        match opcao:
            # soma
            case "1":
                resultado = 0
                while True:
                    n = input("Digite um número ou 'P': ")
                    if n.upper() != "P":
                        resultado += int(n)
                    else:
                        break

            # subtração
            case "2":
                cont = 0
                while True:
                    n = input("Digite um número ou 'P': ")
                    if n.upper() != "P":
                        n = int(n)
                        if cont == 0:
                            resultado = n
                        else:
                            resultado -= n
                        cont += 1
                    else:
                        break

            # multiplicação 
            case "3":
                resultado = 1
                while True:
                    n = input("Digite um número ou 'P': ")
                    if n.upper() != "P":
                        resultado *= int(n)
                    else:
                        break

            # divisão
            case "4":
                cont = 0
                while True:
                    n = input("Digite um número ou 'P': ")
                    if n.upper() != "P":
                        n = int(n)
                        if cont == 0:
                            resultado = n
                        else:
                            if n != 0:
                                resultado /= n
                        cont += 1
                    else:
                        break

        print(f"Resultado: {resultado}")
