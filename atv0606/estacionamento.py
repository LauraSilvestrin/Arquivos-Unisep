# Autor: Laura Silvestrin
# Data de criação: 09/06/2024

"""
Desenvolva uma aplicação Python que utilize ao menos 2 coleções e funções, para que seja possível realizar o cadastro de veículos em um estacionamento com o seguinte menu:
1 - Estacionar veículo
2 - Retirar veículo
3 - Veículos estacionados
4 - Está estacionado?
0 - Sair
Deve gravar a placa do veículo que será a chave, marca, modelo, cor e proprietário.
"""

# Lista para armazenar dicionários de veículos estacionados
estacionamento = []

# Função para estacionar um veículo no estacionamento.
def estacionar_veiculo(placa, marca, modelo, cor, proprietario):
    # Verifica se o veículo já está estacionado
    for veiculo in estacionamento:
        if veiculo['placa'] == placa:
            print("Veículo já está estacionado.")
            return
    
    # Adiciona o veículo à lista de estacionamento
    estacionamento.append({
        'placa': placa,
        'marca': marca,
        'modelo': modelo,
        'cor': cor,
        'proprietario': proprietario
    })
    print("Veículo estacionado com sucesso.")

# Função para retirar um veículo do estacionamento.
def retirar_veiculo(placa):
    global estacionamento
    estacionamento = [veiculo for veiculo in estacionamento if veiculo['placa'] != placa]
    print("Veículo retirado com sucesso.")

# Função para imprimir os veículos estacionados.
def veiculos_estacionados():
    for veiculo in estacionamento:
        print(f"{veiculo['placa']}: {veiculo}")

# Função para verificar se um veículo está estacionado.
def esta_estacionado(placa):
    for veiculo in estacionamento:
        if veiculo['placa'] == placa:
            print("Veículo está estacionado.")
            return
    print("Veículo não está estacionado.")

# Função do menu principal
def menu():
    while True:
        print("""
        1 - Estacionar veículo
        2 - Retirar veículo
        3 - Veículos estacionados
        4 - Está estacionado?
        0 - Sair
        """)
        opcao = input("Escolha uma opção: ")
        if opcao == '1':
            placa = input("Digite a placa do veículo: ")
            marca = input("Digite a marca do veículo: ")
            modelo = input("Digite o modelo do veículo: ")
            cor = input("Digite a cor do veículo: ")
            proprietario = input("Digite o nome do proprietário: ")
            estacionar_veiculo(placa, marca, modelo, cor, proprietario)
        elif opcao == '2':
            placa = input("Digite a placa do veículo para retirar: ")
            retirar_veiculo(placa)
        elif opcao == '3':
            veiculos_estacionados()
        elif opcao == '4':
            placa = input("Digite a placa do veículo para verificar: ")
            esta_estacionado(placa)
        elif opcao == '0':
            break
        else:
            print("Opção inválida. Tente novamente.")

# Verifica se este script é o ponto de entrada principal
if __name__ == "__main__":
    menu()
