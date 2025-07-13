var pacientes = document.querySelectorAll('.paciente');

function CalcularIMC(peso, altura) {
    return (peso / (altura * altura)).toFixed(2);
}
function validarAltura(alturaData) {
    var altura = alturaData
    var msgErro = document.querySelector('#erro-add')
    if (altura < 0 || altura > 3) {
        msgErro.innerHTML += `<p>Altura de ${altura}m inválida</p>`
        situação = false;
    } else { 
        situação = true;
    }
    return situação;
}
function validarPeso(pesoData){
    var peso = pesoData
    var msgErro = document.querySelector('#erro-add')
    if (peso < 0 || peso > 1000) {
        situação = false;
        msgErro.innerHTML += `<p>Peso de ${peso}kg inválido</p>`
    } else { 
        situação = true;
    }
    return situação;
}
function calcularStatus(imc){
    var dataIMC = imc
    var status = ''
    console.log(dataIMC);
    if (dataIMC < 18.5){
        status = 'Baixo Peso'
    } else if ((dataIMC > 18.5) && (dataIMC < 24.5)) {
        status = 'Normal'
    } else if ((dataIMC > 18.6) && (dataIMC < 30)) {
        status = 'Sobrepeso'
    } else if ((dataIMC > 30) && (dataIMC < 35)) {
        status = 'Obesidade (Grau I)'
    } else if ((dataIMC > 35) && (dataIMC < 40)) {
        status = 'Obesidade (Grau II)'
    } else if (dataIMC > 40) {
        status = 'Obesidade (Grau III)'
    } else {
        status = 'INVÁLIDO'
    }
    return status;
}

for (var c = 0; c < pacientes.length; c++) {
    var paciente = pacientes[c];
    var peso = parseFloat(paciente.querySelector('.info-peso').textContent);
    var altura = parseFloat(paciente.querySelector('.info-altura').textContent);
    var imcHTML = paciente.querySelector('.info-imc');
    var statusHTML = paciente.querySelector('.info-status');

    if (!validarPeso(peso) && !validarAltura(altura)) {
        paciente.querySelector('.info-peso').textContent = 'Peso Inválido';
        paciente.querySelector('.info-altura').textContent = 'Altura Inválida';
        paciente.classList = "paciente-invalido";
    } else if (!validarPeso(peso)) {
        paciente.querySelector('.info-peso').textContent = 'Peso Inválido';
        paciente.classList = "paciente-invalido";
    } else if (!validarAltura(altura)) {
        paciente.querySelector('.info-altura').textContent = 'Altura Inválida';
        paciente.classList = "paciente-invalido";
    } else {
        var IMC = CalcularIMC(peso, altura);
        imcHTML.textContent = IMC
        statusHTML.textContent = calcularStatus(IMC)
        
    }
}
