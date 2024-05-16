"""O cardápio de uma lanchonete é dado abaixo. Prepare um algoritmo que leia a
quantidade de cada item que você consumiu e calcule a conta final.
a. Hambúrguer................. R$ 3,00
b. Cheeseburger.............. R$ 2,50
c. Fritas............................ R$ 2,50
d. Refrigerante ................. R$ 1,00
e. Milkshake..................... R$ 3,00"""


hamburgueres = int(input("Quantia de hamburgueres: "))
cheeseburgueres = int(input("Quantia de cheeseburgueres: "))
fritas = int(input("Quantia de fritas: "))
refrigerantes = int(input("Quantia de refrigerantes: "))
milkshakes = int(input("Quantia de milkshakes: "))

aux = (hamburgueres * 3.00) + (cheeseburgueres * 2.50) + (fritas * 2.50) + (refrigerantes * 1.00) + (milkshakes * 3.00)

print(f"Valor final da conta: {hamburgueres + cheeseburgueres + fritas + refrigerantes + milkshakes}")