nome = input("Por favor, informe seu nome: ")
altura = float(input("Por favor, informe sua altura em cm: "))
peso = float(input("Por favor, informe seu peso em kg: "))

altura = altura / 100

imc = peso / (altura ** 2)

if imc < 18.5:
    categoria = "Abaixo do Peso (Pegue suplementos do Cariani)"
elif 18.5 <= imc < 25:
    categoria = "Peso Ideal (Para Bens)"
elif 25 <= imc < 30:
    categoria = "Sobrepeso"
elif 30 <= imc < 35:
    categoria = "Obesidade Grau 1"
elif 35 <= imc < 40:
    categoria = "Obesidade Grau 2"
else:
    categoria = "Obesidade Grau 3 (Dr. Nowzaradan te espera)"

print(f"Nome: {nome}")
print(categoria)
