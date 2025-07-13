# As informações das rotas abaixo foram colhidas no site oficial da STTP Campina Grande (https://sttp.campinagrande.pb.gov.br/transportes/onibus/linhas-de-onibus/)

rotas = [
    {'número': '003', 'rota': 'Leste - Centro', 'Intinerário': 'Centro > Castelo Branco > Glória'},
    {'número': '004', 'rota': 'Centro - Catolé', 'Intinerário': 'Centro > Catolé'},
    {'número': '004A', 'rota': 'Centro - Partage - Itararé', 'Intinerário': 'Integração > Partage > Campina'},
    {'número': '020', 'rota': 'Transversal - Centro/Ramadinha', 'Intinerário': 'Terminal do Chico Mendes > Ramadinha > Centro'},
    {'número': '022', 'rota': 'Transversal', 'Intinerário': 'Malvinhas > Trauma > IFPB > Centro Senac > UPA'},
    {'número': '044', 'rota': 'Aluizio Campos - Centro', 'Intinerário': 'Aluizio Campos > Centro'},
    {'número': '066', 'rota': 'Transversal - Oeste', 'Intinerário': 'Transversal > Oeste'},
    {'número': '077', 'rota': 'Cinza', 'Intinerário': 'Cinza'},
    {'número': '090A', 'rota': 'Radial', 'Intinerário': 'Catingueira > Centro > Catolé de Zé Ferreira - Via Rota 900'},
    {'número': '090B', 'rota': 'Radial', 'Intinerário': 'Catingueira > Altos de Campina'},
    {'número': '092', 'rota': 'Radial', 'Intinerário': 'Rodoviária > Centro > Major Veneziano'},
    {'número': '100', 'rota': 'Azul-Norte', 'Intinerário': 'UPA > Centro'},
    {'número': '101', 'rota': 'Norte Sul', 'Intinerário': 'Centro > Liberdade > Jardim Paulistano > DSM'},
    {'número': '110', 'rota': 'Azul Norte', 'Intinerário': 'UPA > Empada > Conceição > Centro'},
    {'número': '111', 'rota': 'Centrol-Sul', 'Intinerário': 'Centro > Sul > Liberdade > Jardim Paulistano > DSM'},
    {'número': '220', 'rota': 'Transversal', 'Intinerário': 'Centro > Hospital de Traumas > Colinas do Sol > Malvinas'},
    {'número': '245', 'rota': 'Interárea', 'Intinerário': 'Chico Mendes > Call Center > Partage Shopping'},
    {'número': '263', 'rota': 'Interárea', 'Intinerário': 'TCM > Bodocongó > UFCG > Centro'},
    {'número': '300B', 'rota': 'Leste - Centro -Terminal', 'Intinerário': 'UEPB > UFCG > Centro'},
    {'número': '303', 'rota': 'Leste - Oeste', 'Intinerário': 'Santo Antonio > UFCG > UEPB'},
    {'número': '333', 'rota': 'Leste - Oeste', 'Intinerário': 'Santo Antonio > TIC > UEPB > Santo'},
    {'número': '404', 'rota': 'Circular Sul', 'Intinerário': 'Amigão > Sandra Cavalcante > Centro > Santa Rosa > Catolé'},
    {'número': '444', 'rota': 'Circular Sul', 'Intinerário': 'Amigão > Centro > Santa Rosa > Amigão'},
    {'número': '500', 'rota': 'Centro - UFCG', 'Intinerário': 'UFCG > Prata > Centro > Pedregal'},
    {'número': '505', 'rota': 'Grande Circular', 'Intinerário': 'Rodoviária > Centro > Araxá > UFCG'},
    {'número': '555', 'rota': 'Grande Circular', 'Intinerário': 'Rodoviária > Partage > Araxá > UFCG'},
    {'número': '636', 'rota': 'UEPB - Chico Mendes', 'Intinerário': 'Terminal Chico Mendes > UEPB'},
    {'número': '660', 'rota': 'Transversal', 'Intinerário': 'Centro > Chico Mendes > Santa Bárbara'},
    {'número': '770', 'rota': 'Cinza', 'Intinerário': 'Ronaldo Cunha Lima > Centro'},
    {'número': '900', 'rota': 'Radial', 'Intinerário': 'Palmeira Imperial > Novo Cruzeiro > Centro'},
    {'número': '902', 'rota': 'Radial', 'Intinerário': 'Centro > Estreito > Centro'},
    {'número': '903A', 'rota': 'Multirão', 'Intinerário': 'Multirão > Centro > Multirão'},
    {'número': '903B', 'rota': 'São José da Mata', 'Intinerário': 'Distrito de São José da Mata'},
    {'número': '909', 'rota': 'Radial', 'Intinerário': 'Conj. Cabos e Soldados > Centro > Presidente Médice'},
    {'número': '910', 'rota': 'Radial -Distrital', 'Intinerário': 'Jenipapo > Cuités > Centro > Continental'},
    {'número': '922', 'rota': 'Radial', 'Intinerário': 'Portal Sudoeste > Centro > Acácio Figueiredo'},
    {'número': '944', 'rota': 'Preta-Industrial', 'Intinerário': 'Centro > Complexo Judiciário > Bairro do Ligeiro'},
    {'número': '955', 'rota': 'Galante', 'Intinerário': 'Centro > Galante > Rua Paraná'}
]
def VerRotas():
    print('-='*15)
    print('ROTAS DE ÔNIBUS DISPONÍVEIS EM CAMPINA GRANDE')
    for c in range(0, len(rotas)):
        print(f'[{c}]. {rotas[c]["número"]} - {rotas[c]["rota"]}')
    print('-='*15)

def VerIntinerario():
    VerRotas()
    while True:
        respVI = int(input('De qual numeração você deseja ver o itinerário? (Digite o número da lista referente ao ônibus, não o número do ônibus) '))
        if 0 <= respVI < len(rotas):
            print('-=' * 15)
            print(f'Intinerário do Ônibus {rotas[respVI]["número"]}: {rotas[respVI]["Intinerário"]}')
            print('-=' * 15)
            break
        else:
            print('Por favor, digite um número válido.')

def AdicionarRota():
    NovoNumero = int(input('Digite o Número do Ônibus da Nova Rota: '))
    NovoRota = str(input('Digite o Nome da Nova Rota: '))
    NovoIntinerario =  str(input('Digite o Intinerario da Nova Rota: '))

    Novo = {
        'número': NovoNumero,
        'rota': NovoRota,
        'Intinerário':NovoIntinerario
    }
    rotas.append(Novo)

def ExcluirRota():
    VerRotas()
    while True:
        respER = int(input('Digite a numeração do ônibus que você deseja excluir a rota? (Digite o número da lista referente ao ônibus, não o número do ônibus): '))
        if 0 <= respER < len(rotas):
            print('-='*15)
            print(f'Excluindo rota: {rotas[respER]["número"]} - {rotas[respER]["rota"]}')
            print('Rota Removida')
            print('-='*15)
            rotas.remove(rotas[respER])
            break
        else:
            print(f' Rota {respER} não existe, por favor, digite um número válido.')

while True:
    print('''
[1] Ver Rotas
[2] Ver Intinerário de Certa Rota
[3] Adicionar Rota
[4] Excluir Uma Rota
[5] Sair
''')
    resp = int(input('Digite sua Opção: '))
    if (resp == 1):
        VerRotas()
    elif (resp == 2):
        VerIntinerario()
    elif (resp == 3):
        AdicionarRota()
    elif (resp == 4):
        ExcluirRota()
    elif (resp == 5):
        print('Encerrando')
        break
    else:
        print('Digite um valor válido')