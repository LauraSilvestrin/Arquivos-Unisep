class Paciente:
    def __init__(self, nome, gravidade, ordem_chegada):
        self.nome = nome
        self.gravidade = gravidade
        self.ordem_chegada = ordem_chegada

    def __repr__(self):
        return f"Paciente: {self.nome}, Gravidade: {self.gravidade}"


def criterio_ordenacao(paciente):
    prioridade = {"critico": 1, "grave": 2, "leve": 3}
    return (prioridade[paciente.gravidade], paciente.ordem_chegada)


def ordenar_pacientes(lista_pacientes):
    return sorted(lista_pacientes, key=criterio_ordenacao)


def menu():
    print("----- Sistema de Agendamento -----")
    print("1 - Agendar atendimento")
    print("2 - Chamar próximo paciente")
    print("3 - Excluir agendamentos")
    print("4 - Listar agendamentos")
    print("5 - Sair do programa")


def main():
    lista_pacientes = []
    ordem_chegada = 0

    while True:
        menu()
        opcao = input("Escolha uma opção: ")

        if opcao == "1":
            nome = input("Digite o nome do paciente: ")
            gravidade = input("Digite a gravidade (Critico, Grave, Leve): ").lower()
            if gravidade in ["critico", "grave", "leve"]:
                ordem_chegada += 1
                paciente = Paciente(nome, gravidade, ordem_chegada)
                lista_pacientes.append(paciente)
                lista_pacientes = ordenar_pacientes(lista_pacientes)
                print(f"Paciente {nome} agendado com gravidade {gravidade}.")
            else:
                print("Gravidade inválida.")

        elif opcao == "2":
            if lista_pacientes:
                proximo_paciente = lista_pacientes.pop(0)
                print(
                    f"Chamando próximo paciente: {proximo_paciente.nome} com gravidade {proximo_paciente.gravidade}."
                )
            else:
                print("Nenhum paciente agendado.")

        elif opcao == "3":
            if lista_pacientes:
                lista_pacientes.clear()
                print("Todos os agendamentos foram excluídos.")
            else:
                print("Nenhum agendamento para excluir.")

        elif opcao == "4":
            print("----- Pacientes Agendados -----")
            if lista_pacientes:
                for paciente in lista_pacientes:
                    print(f"Paciente: {paciente.nome}, Gravidade: {paciente.gravidade}")
                print("-------------------------------")
            else:
                print("A fila de pacientes está vazia.")

        elif opcao == "5":
            print("Saindo do programa...")
            break

        else:
            print("Opção inválida.")


if __name__ == "__main__":
    main()
