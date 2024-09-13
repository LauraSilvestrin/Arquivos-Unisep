"""Receba a altura do degrau de uma escada e a altura que o usuário deseja alcançar
subindo a escada. Calcule e mostre quantos degraus o usuário deverá subir para
atingir seu objetivo."""
altura_degrau = float(input("Digite a altura do degrau: "))
altura_objetivo = float(input("Digite a altura desejada: "))
num_degraus = int(altura_objetivo / altura_degrau)


print(f"Para atingir uma altura de {altura_objetivo} metros com degraus de {altura_degrau} metros, você precisará subir {num_degraus} degraus.")