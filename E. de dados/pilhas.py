class Pilha:
    def __init__(self, tamanho):
        self.pilha = []
        self.tamanho = tamanho

    def empilhar(self, item):
        if len(self.pilha) < self.tamanho:
            self.pilha.append(item)
            print(f'Item {item} empilhado')
        else:
            print('Erro: Nao ha espaço na pilha para empilhar o item.')

    def desempilhar(self):
        if len(self.pilha) > 0:
            item = self.pilha.pop()
            print(f'Item {item} desempilhado com sucesso!')
        else:
            print('Erro: Nao ha elementos na pilha para desempilhar.')
    def imprimir_pilha(self):
        if len(self.pilha) > 0:
            print('Conteúdo da pilha:', self.pilha)
        else:
            print('A pilha está vazia.')

    def topo(self):
        if len(self.pilha) > 0:
            return self.pilha[-1]
        else:
            return 'A pilha está vazia.'

def main():
    tamanho_pilha = int(input('Digite o tamanho da pilha: '))
    pilha = Pilha(tamanho_pilha)

    while True:
        print('\nEscolha a operacao:')
        print('a) Empilhar')
        print('b) Desempilhar')
        print('c) Sair')
        operacao = input('Digite a operacao desejada (a/b/c): ').strip().lower()

        if operacao == 'a':
            item = input('Digite o item a ser empilhado: ')
            pilha.empilhar(item)
        elif operacao == 'b':
            pilha.desempilhar()
        elif operacao == 'c':
            print(f'O conteúdo no topo da pilha: {pilha.topo()}')
            break
        else:
            print('Operação invalida, tente novamente.')

if __name__ == "__main__":
    main()
