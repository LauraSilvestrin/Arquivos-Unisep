""". Sabendo que a formula para aprovação é: 𝐺1+(𝐺2∗2)3 ≥ 7.0, desenvolva uma aplicação
que leia as notas de G1 e G2 e apresente a média do semestre"""
g1 = float(input("Insira a nota G1: "))
g2 = float(input("Insira a nota G2: "))

media = (g1 + (g2 * 2)) / 3

print(f"A média do semestre é {media}")