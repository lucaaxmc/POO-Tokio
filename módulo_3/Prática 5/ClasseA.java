public class ClasseA {

    public String Nome;
    protected int Idade;
    private double Dinheiro;

    public ClasseA(String Nome, int Idade, double Dinheiro) {
        this.Idade = Idade;
        this.Nome = Nome;
        this.Dinheiro = Dinheiro;
    }

    public double getDinheiro() {
        return Dinheiro;
    }

    public void setDinheiro(double Dinheiro) {
        this.Dinheiro = Dinheiro;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }
}
