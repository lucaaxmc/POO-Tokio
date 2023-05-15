public class Livro {

    private String Titulo;
    private int ISBN;
    private String Autor;
    private int numeroPaginas;

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String toString() {
        return "O livro com o título " + getTitulo() + " e ISBN " + getISBN() + " e autor " + getAutor() + " tem " + getNumeroPaginas() + " páginas.";
    }
}
