var Botao = document.querySelector('#adicionar-paciente')

function limpar(){
    document.getElementById('Inome').value = ''
    document.getElementById('Ipeso').value = ''
    document.getElementById('Ialtura').value = ''
    document.getElementById('Ipercen').value = ''
}

Botao.addEventListener('click', function () {
    

    var form = document.getElementById('formulario')
    var lista = document.querySelector('#tabela-pacientes')
    
    var NomeDc = document.createElement('td')
    var PesoDc = document.createElement('td')
    var AlturaDc = document.createElement('td')
    var PercentDc = document.createElement('td')
    var ImcDc = document.createElement('td')
    var StatusDc = document.createElement('td')
    

    NomeDc.textContent = form.Inome.value
    PesoDc.textContent = form.Ipeso.value
    AlturaDc.textContent = form.Ialtura.value
    PercentDc.textContent = form.Ipercen.value
    ImcDc.textContent = CalcularIMC(form.Ipeso.value, form.Ialtura.value)
    StatusDc.textContent = calcularStatus(ImcDc.textContent)
    

    NomeDc.classList.add('info-nome')
    PesoDc.classList.add('info-peso')
    AlturaDc.classList.add('info-altura')
    PercentDc.classList.add('info-gordura')
    ImcDc.classList.add('info-imc')
    StatusDc.classList.add('info-status')

    var Novo = document.createElement('tr')
    Novo.classList.add('paciente')
   
    Novo.appendChild(NomeDc)
    Novo.appendChild(PesoDc)
    Novo.appendChild(AlturaDc)
    Novo.appendChild(PercentDc)
    Novo.appendChild(ImcDc)
    Novo.appendChild(StatusDc)

    if (!validarPeso(PesoDc.textContent)) {
        Novo.classList.add("paciente-invalido")
        PesoDc.textContent = 'Peso Inválido'
        ImcDc.textContent = '0'
    }
    if (!validarAltura(AlturaDc.textContent)) {
        if(!('paciente-invalido' in Novo.classList)){
            Novo.classList.add('paciente-invalido')
        }
        ImcDc.textContent = '0'
        AlturaDc.textContent = 'Altura Inválida'
    }
    
    if (NomeDc.textContent.length == 0 || PesoDc.textContent.length == 0 || AlturaDc.textContent.length == 0 || PercentDc.textContent.length == 0){
        document.querySelector('#erro-add').innerHTML = 'Preencha todos os campos'
    } else {
        lista.appendChild(Novo)
        limpar()
    }
}    
)