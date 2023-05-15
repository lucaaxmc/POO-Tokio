public class Main {
    public static void main(String[] args) {
        Livro livro_um = new Livro();

        livro_um.getTitulo();
        livro_um.getISBN();
        livro_um.getAutor();
        livro_um.getNumeroPaginas();

        livro_um.setTitulo("A Terra Mágica");
        livro_um.setISBN(123456789);
        livro_um.setAutor("Jon Doe");
        livro_um.setNumeroPaginas(213);

        Livro livro_dois = new Livro();

        livro_dois.getTitulo();
        livro_dois.getISBN();
        livro_dois.getAutor();
        livro_dois.getNumeroPaginas();

        livro_dois.setTitulo("O Planeta Azul");
        livro_dois.setISBN(987654321);
        livro_dois.setAutor("Jane Doe");
        livro_dois.setNumeroPaginas(279);

        System.out.println(livro_um);
        System.out.println(livro_dois);

        if(livro_um.getNumeroPaginas() < livro_dois.getNumeroPaginas()){
            System.out.println("O livro " + livro_dois.getTitulo() + " tem o maior número de páginas.");
        }
        else{
            System.out.println("O livro " + livro_um.getTitulo() + " tem o maior número de páginas.");
        }
    }
}