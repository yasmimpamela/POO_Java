package bibliotecaapp;
public class Livro {

	private String titulo;
	private String autor;
	private String genero;
	private float preco;

	public Livro(){}
	
	public Livro(String titulo, String autor, String genero, float preco){
		this.titulo = titulo;
		this.autor = autor;
		this.preco = preco; 
}

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }		
    public String imprimir(){
	return "Titulo: " + titulo + "\nAutor: " + autor + "\nGenero: "
            + genero + String.format("\nPreco R$ %.2f \n", preco);
	}
}
