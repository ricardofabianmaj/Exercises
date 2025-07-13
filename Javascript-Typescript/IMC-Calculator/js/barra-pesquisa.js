var barraDePesquisa = document.querySelector('#barra-pesquisa');

barraDePesquisa.addEventListener('input', function(){
    var pacientes = document.querySelectorAll('.info-nome');
    var pesquisado = barraDePesquisa.value.toLowerCase();

    if (pesquisado.length === 0) {
        for(var cont = 0; cont < pacientes.length; cont++) {
            var paciente = pacientes[cont]
            paciente.parentNode.style.backgroundColor = 'white'
            paciente.parentNode.style.display = ''
        }
    } else {
        for(var c = 0; c < pacientes.length; c++) {
            var paciente = pacientes[c]
            if (paciente.textContent.toLowerCase().includes(pesquisado)){
                paciente.parentNode.style.backgroundColor = 'rgb(192, 186, 186)'
                paciente.parentNode.style.display = ''
            } else {
                paciente.parentNode.style.backgroundColor = ''
                paciente.parentNode.style.display = 'none'
            }
        }
    }
});
