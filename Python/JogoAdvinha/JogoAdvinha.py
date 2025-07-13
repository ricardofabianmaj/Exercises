from random import randint

while True:
    hub = int(input('''
[1] Jogar 
[2] Sair do Jogo
                    
Escolha sua opção: '''))
    if (hub == 1):
        adivinhar = randint(1, 8)
        print('Estou pensando em um número entre 1 e 8')
        resp = int(input('Qual o seu palpite: '))

        if (resp == adivinhar):
            print(f'Você acertou, o número era {adivinhar} mesmo.')
        else:
            print(f'Você errou, o número era {adivinhar}')
    else:
        print("Encerrando...")
        break