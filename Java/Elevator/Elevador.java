public class Elevador {
    private int totalAndares;
    private int pessoasPresentes = 0;
    private int andarAtual = 0;  // térreo
    private int capacidade;

    public Elevador(int totalAndares, int capacidade) {
        this.totalAndares = totalAndares;
        this.capacidade = capacidade;
    }

    // Mostrar total de andares
    public void getAndares(){
        System.out.println("Quantidade de andares no prédio: " + totalAndares);
    }

    // Adicionar ou remover pessoas
    public void setPessoasPresentes(int x){
        if(x == 1){ // entra pessoa
            if(pessoasPresentes == capacidade){
                System.out.println("Elevador lotado...");
            } else {
                pessoasPresentes++;
            }
        } else if(x == 2){ // sai pessoa
            if(pessoasPresentes == 0){
                System.out.println("O elevador já está vazio...");
            } else {
                pessoasPresentes--;
            }
        }
    }

    public void getPessoasPresentes(){
        System.out.println("Total de Pessoas no elevador: " + pessoasPresentes);
    }

    // Subir ou descer andar
    public void setAndarAtual(int x){
        if(x == 1){ // subir
            if(andarAtual >= totalAndares){
                System.out.println("Você chegou no andar máximo...");
            } else {
                andarAtual++;
            }
        } else if(x == 2){ // descer
            if(andarAtual == 0){
                System.out.println("Você já está no térreo...");
            } else {
                andarAtual--;
            }
        }
    }

    public void getAndarAtual(){
        System.out.println("Andar Atual: " + andarAtual);
    }

    // Mostrar capacidade
    public void getCapacidade(){
        System.out.println("Capacidade do elevador: " + capacidade);
    }
}
