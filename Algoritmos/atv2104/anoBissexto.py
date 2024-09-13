ano = int(input("Digite o ano que deseja verificar: "))
bissexto = False
mensagem = ''
if ano % 4 == 0:
    if ano % 100 == 0:
        if ano % 400 == 0:
            mensagem = "é bissexto porque é divisível por 400."
            bissexto = True
        else:
            mensagem = "não é bissexto porque é divisível por 100, mas não por 400."
    else:
        mensagem = "é bissexto porque é divisível por 4, mas não por 100."
        bissexto = True
else:
    mensagem = "não é bissexto porque não é divisível por 4."

if bissexto:
    print(f"O ano {ano} {mensagem} Portanto, possui 366 dias.")
else:
    print(f"O ano {ano} {mensagem} Portanto, possui 365 dias.")
