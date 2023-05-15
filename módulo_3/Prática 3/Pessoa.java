public class Pessoa {

    private String Nome;
    private String Apelidos;
    private int Idade;

    public Pessoa(String Nome, String Apelidos, int Idade) {
        super();
        this.Nome = Nome;
        this.Apelidos = Apelidos;
        this.Idade = Idade;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getApelidos() {
        return Apelidos;
    }

    public void setApelidos(String Apelidos) {
        this.Apelidos = Apelidos;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    @Override
    public String toString() {
        return "Pessoa: Nome = " + Nome + ", Apelidos = " + Apelidos + ", Idade = " + Idade ;
    }

}