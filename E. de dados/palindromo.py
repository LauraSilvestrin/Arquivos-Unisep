class Pilha:
    def __init__(self):
        self.items = []

    def empilhar(self, item):
        self.items.append(item)

    def desempilhar(self):
        if not self.esta_vazia():
            return self.items.pop()
        return None

    def esta_vazia(self):
        return len(self.items) == 0

def verificar_palindromo(s):
    pilha = Pilha()
    for char in s:
        pilha.empilhar(char)

    inverso = ""
    while not pilha.esta_vazia():
        inverso += pilha.desempilhar()

    return s == inverso

def main():
    string = input('Digite uma string: ').strip()
    if verificar_palindromo(string):
        print(f'"{string}" e um palindromo.')
    else:
        print(f'"{string}" nao e um palindromo.')

if __name__ == "__main__":
    main()
