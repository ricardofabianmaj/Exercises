import java.util.Scanner;

public class Program {
    public static void barrinha(){
        System.out.println("====================================================");
    }
    public static int ShowMenu(Scanner scanner){
        barrinha();
        System.out.println("MENU do ELEVADOR");
        barrinha();
        System.out.println("[1] Adicionar Pessoa no elevador...");
        System.out.println("[2] Remover pessoa no elevador...");
        System.out.println("[3] Subir andar...");
        System.out.println("[4] Descer andar...");
        System.out.println("[5] Mostrar caracteristicas do elevador...");
        System.out.println("[6] Fechar...");
        barrinha();
        
        int opcao = scanner.nextInt();
        return opcao;
    }

    public static void main(String[] args){
        System.out.println(" ");
        barrinha();
        System.out.println("Welcome to Elevator Program");
        barrinha();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos andares possui o prédio: ");
        int temp_andares = scanner.nextInt();

        System.out.print("Qual a quantidade de pessoas que o elevador pode suportar: ");
        int temp_capacidade = scanner.nextInt();

        Elevador novoElevador = new Elevador(temp_andares, temp_capacidade);

        boolean control = true;

        while(control){
            int op = ShowMenu(scanner); // Passando scanner para o menu
            switch (op) {
                case 1:
                    novoElevador.setPessoasPresentes(1);
                    novoElevador.getPessoasPresentes();
                    break;
                case 2:
                    novoElevador.setPessoasPresentes(2);
                    novoElevador.getPessoasPresentes();
                    break;
                case 3:
                    novoElevador.setAndarAtual(1);
                    novoElevador.getAndarAtual();
                    break;
                case 4:
                    novoElevador.setAndarAtual(2);
                    novoElevador.getAndarAtual();
                    break;
                case 5:
                    barrinha();
                    System.out.println("DESCRIÇÃO DO ELEVADOR");
                    novoElevador.getAndarAtual();
                    novoElevador.getAndares();
                    novoElevador.getPessoasPresentes();
                    novoElevador.getCapacidade();
                    break;
                case 6:
                    control = false;
                    barrinha();
                    System.out.println("Encerrando Programa do Elevador...");
                    barrinha();
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }

        scanner.close();
    }
}
