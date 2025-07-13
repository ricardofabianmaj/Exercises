import java.util.ArrayList;
import java.util.Scanner;

public class Program {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Tarefa> tarefas = new ArrayList<>();

    public static void barra(){
        System.out.println("=====================================================");
    }

    public static void menu(){
        barra();
        System.out.println("MENU GERENCIADOR DE TAREFAS");
        barra();
        System.out.println("[1] Criar tarefa...");
        System.out.println("[2] Listar Tarefas...");
        System.out.println("[3] Marcar tarefa como concluída");
        System.out.println("[4] Excluir tarefa...");
        System.out.println("[0] Sair");
        barra();

        int op = scanner.nextInt();
        scanner.nextLine(); 

        switch (op) {
            case 1:
                System.out.print("Descrição da tarefa: ");
                String desc = scanner.nextLine();
                tarefas.add(new Tarefa(desc));
                break;
            case 2:
                for (int i = 0; i < tarefas.size(); i++) {
                    System.out.println(i + ": " + tarefas.get(i));
                }
                break;
            case 3:
                for (int i = 0; i < tarefas.size(); i++) {
                    System.out.println(i + ": " + tarefas.get(i));
                }
                System.out.print("Índice da tarefa: ");
                int idx = scanner.nextInt();
                if (idx >= 0 && idx < tarefas.size()) {
                    tarefas.get(idx).marcarConcluida();
                }
                break;
            case 4:
                System.out.print("Índice da tarefa: ");
                int rem = scanner.nextInt();
                if (rem >= 0 && rem < tarefas.size()) {
                    tarefas.remove(rem);
                }
                break;
            case 0:
                System.out.println("Saindo...");
                return;
            default:
                System.out.println("Opção inválida!");
        }

        menu(); 
    }

    public static void main(String[] args){
        System.out.println("Seja bem-vindo ao gerenciador de tarefas em Java");
        menu();
    }
}
