package bibliotecaapp;

import java.util.ArrayList;

public class Acervo {
    private static ArrayList<Livro> listaLivros = new ArrayList<>();

    public static ArrayList<Livro> getListaLivros() {
        return listaLivros;
    }

    static public void adicionar(Livro l) {
        listaLivros.add(l);
    }

    static public String listar() {
        StringBuilder saida = new StringBuilder();
        int i = 1;
        for (Livro l : listaLivros) {
            saida.append("\n----------- LIVRO Numero ").append(i++).append(" ---------\n");
            saida.append(l.imprimir()).append("\n");
        }
        return saida.toString();
    }

    static public int pesquisar(String genero) {
        int qtd = 0;

        for (Livro l : listaLivros) {
            if (l.getGenero().equalsIgnoreCase(genero)) {
                qtd++;
            }
        }
        return qtd;
    }

    static public int pesquisar(double vInicial, double vFinal) {
        int qtd = 0;

        for (Livro l : listaLivros) {
            if (l.getPreco() >= vInicial && l.getPreco() <= vFinal) {
                qtd++;
            }
        }
        return qtd;
    }

    // remove o livro pelo titulo
    static public boolean remover(String titulo) {
        for (Livro l : listaLivros) {
            if (l.getTitulo().equalsIgnoreCase(titulo)) {
                listaLivros.remove(l);
                return true;
            }
        }
        return false;
    }

    // total acervo
    static public double calcularTotalAcervo() {
        double total = 0;

        for (Livro l : listaLivros) {
            total += l.getPreco();
        }
        return total;
    }
}
