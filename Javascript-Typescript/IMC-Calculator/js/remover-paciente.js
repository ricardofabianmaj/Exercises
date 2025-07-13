var tabela = document.getElementById('tabela-pacientes')

tabela.addEventListener('dblclick' , function(event) {
    var remover = event.target.parentNode
    remover.classList.add('removendo')
    setTimeout(function(){
        remover.remove()
    }, 300)
    
})