public class Funcionário extends Pessoa implements Cumprimento {

    protected String Identificação;

    public Funcionário(String Nome, String Apelidos, int Idade, String Identificação) {
        super(Nome, Apelidos, Idade);
        this.Identificação = Identificação;
    }

    @Override
    public String toString() {
        return super.toString() + "Número de funcionário = " + Identificação ;
    }

    @Override
    public String bemVindo() {
        return "Bem vindo funcionário número " + this.Identificação;
    }

}

