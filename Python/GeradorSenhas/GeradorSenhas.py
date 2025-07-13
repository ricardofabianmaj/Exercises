import random
from random import randint

tamanho = randint(13, 28)
def gerar_senha(comprimento):
    caracteres = '!"#$%&()*+,-./:;<=>?@[\]^_`{|}~0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ'
    senha = ''.join(random.choice(caracteres) for _ in range(comprimento))
    return senha

senha_gerada = gerar_senha(tamanho)
print(f"Senha gerada: {senha_gerada}")

