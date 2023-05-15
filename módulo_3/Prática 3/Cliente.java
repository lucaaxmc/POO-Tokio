public class Cliente extends Pessoa implements Cumprimento {
    private int Número;

    public Cliente(String Nome, String Apelidos, int Idade, int Número) {
        super(Nome, Apelidos, Idade);
        this.Número = Número;
    }

    public Cliente(String Nome, String Apelidos, int Idade) {
        super(Nome, Apelidos, Idade);
        this.Número = 0;
    }

    public int getNúmero() {
        return Número;
    }

    public void setNúmero(int Número) {
        this.Número = Número;
    }

    @Override
    public String toString() {
        return super.toString() + " Número de cliente = " + Número ;
    }

    @Override
    public String bemVindo() {
        if(this.Número!=0) {
            return "Bem vindo cliente número " + this.Número;
        }
        return "Bem vindo! Por favor, registe-se na lista.";
    }
}