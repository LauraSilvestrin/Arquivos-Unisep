"""Uma empresa de piscinas precisa saber qual o volume em que cada piscina terá em
M³, sendo que o usuário irá informar a largura, comprimento e profundidade."""
l, c, p = [float(x) for x in input("Informe a largura, comprimento e profundidade separados por espaço: ").split()]
print(f"M³: {l*c*p}")