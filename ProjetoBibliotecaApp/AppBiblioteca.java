package bibliotecaapp;

import java.util.Scanner;

public class AppBiblioteca {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner entradaString = new Scanner(System.in);

        int menu;
        double vInicial, vFinal;

        Livro objLivro;

        String titulo, autor, genero;
        float preco;

        do {
            exibirMenu();
            menu = entrada.nextInt();
            // Cadastro do livro
            switch (menu) {
                case 1: 
                    System.out.println("Digite o titulo: ");
                    titulo = entradaString.nextLine();
                    System.out.println("Digite o autor: ");
                    autor = entradaString.nextLine();
                    System.out.println("Digite o genero: ");
                    genero = entradaString.nextLine();
                    System.out.println("Digite o preco: ");
                    preco = entrada.nextFloat();

                    objLivro = new Livro(titulo, autor, genero, preco);

                    // Guardar no ArrayList
                    Acervo.adicionar(objLivro);

                    break;
                case 2:
                    System.out.println("===> LISTAGEM LIVROS ");
                    System.out.println(Acervo.listar());
                    break;
                case 3:
                    System.out.println("===> EXCLUSAO DO LIVRO  ");
                    System.out.println("Digite o titulo do livro ");
                    titulo = entradaString.nextLine();

                    if (Acervo.getListaLivros().isEmpty()) {
                        System.out.println("Nao ha livros no acervo!");
                    } else {
                        if (Acervo.remover(titulo)) {
                            System.out.println("Livro removido com sucesso!");
                        } else {
                            System.out.println("Titulo nao encontrado!");
                        }
                    }
                    break;
                case 4:
                    System.out.println("===> PESQUISAR PELO GENERO ");
                    System.out.println("Digite o genero: ");
                    genero = entradaString.nextLine();
                    System.out.println("Existem " + Acervo.pesquisar(genero)
                            + " Livro(s) do genero " + genero);
                    break;
                case 5:
                    System.out.println("===> PESQUISAR POR FAIXA DE PRECO");
                    System.out.println("Digite a faixa de preco inicial e a final: ");
                    vInicial = entrada.nextDouble();
                    vFinal = entrada.nextDouble();

                    System.out.println("Existem " + Acervo.pesquisar(vInicial, vFinal)
                            + " livro(s) com preco entre R$ " + vInicial + " e R$ " + vFinal);
                    break;
                case 6:
                    System.out.println("===> TOTAL EM R$ DE LIVROS NO ACERVO");
                    System.out.println("O total e: R$ " + String.format("%.2f", Acervo.calcularTotalAcervo()));
                    break;
                case 7:
                    System.out.println("SAINDO...");
                    break;
                default:
                    System.out.println("OPCAO DE MENU INVALIDA!");
            }
        } while (menu != 7);
    }

    static void exibirMenu() {
        System.out.println("---------- LIVRO ----------");
        System.out.println("1 - CADASTRAR");
        System.out.println("2 - LISTAR");
        System.out.println("3 - EXCLUIR LIVRO");
        System.out.println("4 - PESQUISAR POR GENERO");
        System.out.println("5 - PESQUISAR POR FAIXA DE PRECO");
        System.out.println("6 - CALCULAR TOTAL DO ACERVO");
        System.out.println("7 - SAIR");
        System.out.println("===> ESCOLHA UMA OPCAO:");
    }
}
