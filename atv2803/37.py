"""Leia um valor inteiro em segundos, e imprima-o em horas, minutos e segundos."""
segundos = int(input("Digite o valor em segundos: "))

horas = segundos // 3600
segundos_restantes = segundos % 3600
minutos = segundos_restantes // 60
segundos_finais = segundos_restantes % 60

print("O valor em horas, minutos e segundos é: {:02d}:{:02d}:{:02d}".format(horas, minutos, segundos_finais))