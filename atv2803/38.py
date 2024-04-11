"""Faça um programa que leia o horário (hora, minuto e segundo) do início e a duração
em segundo, de uma experiência atômica bélica. O programa deve resultar com o
novo horário (hora, minuto e segundo) do término da mesma."""

hora_inicio = int(input("Digite a hora de início: "))
minuto_inicio = int(input("Digite o minuto de início: "))
segundo_inicio = int(input("Digite o segundo de início: "))
duracao = int(input("Digite a duração da experiência em segundos: "))

inicio_em_segundos = hora_inicio * 3600 + minuto_inicio * 60 + segundo_inicio

termino_em_segundos = inicio_em_segundos + duracao

hora_termino = termino_em_segundos // 3600
minuto_termino = (termino_em_segundos % 3600) // 60
segundo_termino = termino_em_segundos % 60

print("O horário do término da experiência é: {:02d}:{:02d}:{:02d}".format(hora_termino, minuto_termino, segundo_termino))