package Java.LibrarySystem;

import java.util.ArrayList;
import java.util.Scanner;

public class LibrarySystem {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Livro> livros = new ArrayList<>();

    private static void barra() {
        System.out.println("=========================================");
    }

    private static int menu() {
        barra();
        System.out.println("LIBRARY SYSTEM");
        barra();
        System.out.println("[1] Cadastrar Livro...");
        System.out.println("[2] Listar Livros Disponíveis");
        System.out.println("[3] Realizar Empréstimo...");
        System.out.println("[4] Devolver Livro...");
        System.out.println("[5] Ver Livros Emprestados...");
        System.out.println("[6] Sair do Programa");
        System.out.print("Escolha uma opção: ");
        
        int op = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer
        return op;
    }

    private static void mostrarLivros() {
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
            return;
        }

        for (int i = 0; i < livros.size(); i++) {
            Livro livro = livros.get(i);
            System.out.println((i + 1) + ". [" + (livro.emprestado ? "X" : " ") + "] "
                    + livro.nome + " -- " + livro.autor);
        }
    }

    public static void main(String[] args) {
        barra();
        System.out.println("WELCOME TO LIBRARY SYSTEM");
        barra();

        boolean closeProgram = false;

        while (!closeProgram) {
            int op = menu();
            switch (op) {
                case 1:
                    barra();
                    System.out.println("CADASTRAR LIVRO");
                    barra();
                    System.out.print("Nome do livro: ");
                    String t_nome = scanner.nextLine();

                    System.out.print("Nome do autor: ");
                    String t_autor = scanner.nextLine();

                    System.out.print("Descrição do livro: ");
                    String t_desc = scanner.nextLine();

                    livros.add(new Livro(t_nome, t_autor, t_desc));
                    System.out.println("Livro cadastrado com sucesso!");
                    break;

                case 2:
                    barra();
                    System.out.println("LIVROS DISPONÍVEIS");
                    barra();
                    mostrarLivros();
                    break;

                case 3:
                    barra();
                    System.out.println("REALIZAR EMPRÉSTIMO");
                    barra();
                    mostrarLivros();
                    System.out.print("Digite o número do livro que deseja emprestar: ");
                    int emprestar = scanner.nextInt();
                    scanner.nextLine();

                    if (emprestar < 1 || emprestar > livros.size()) {
                        System.out.println("Índice inválido.");
                        break;
                    }

                    Livro livroEmp = livros.get(emprestar - 1);
                    if (livroEmp.emprestado) {
                        System.out.println("Este livro já está emprestado.");
                    } else {
                        livroEmp.emprestado = true;
                        System.out.println("Emprestando: " + livroEmp.nome);
                    }
                    break;

                case 4:
                    barra();
                    System.out.println("DEVOLVER LIVRO");
                    barra();
                    ArrayList<Integer> indicesEmprestados = new ArrayList<>();

                    for (int i = 0; i < livros.size(); i++) {
                        if (livros.get(i).emprestado) {
                            indicesEmprestados.add(i);
                            System.out.println(indicesEmprestados.size() + ". [X] "
                                    + livros.get(i).nome + " -- " + livros.get(i).autor);
                        }
                    }

                    if (indicesEmprestados.isEmpty()) {
                        System.out.println("Nenhum livro emprestado no momento.");
                        break;
                    }

                    System.out.print("Digite o número do livro que deseja devolver: ");
                    int escolha = scanner.nextInt();
                    scanner.nextLine();

                    if (escolha < 1 || escolha > indicesEmprestados.size()) {
                        System.out.println("Opção inválida.");
                        break;
                    }

                    int indiceReal = indicesEmprestados.get(escolha - 1);
                    livros.get(indiceReal).emprestado = false;
                    System.out.println("Livro devolvido com sucesso.");
                    break;

                case 5:
                    barra();
                    System.out.println("LIVROS EMPRESTADOS");
                    barra();
                    int cont = 0;
                    for (Livro livro : livros) {
                        if (livro.emprestado) {
                            cont++;
                            System.out.println(cont + ". [X] " + livro.nome + " -- " + livro.autor);
                        }
                    }
                    if (cont == 0) {
                        System.out.println("Nenhum livro emprestado.");
                    }
                    break;

                case 6:
                    closeProgram = true;
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida ou não implementada.");
                    break;
            }
        }

        scanner.close();
    }
}
