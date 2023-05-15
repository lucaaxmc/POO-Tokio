public class ClasseB {
    private final double Preço;
    public String Região ;
    protected int Quartos;

    public ClasseB(String Região, int Quartos, double Preço) {
        this.Região = Região;
        this.Quartos = Quartos;
        this.Preço = Preço;
    }

    @Override
    public String toString() {
        return "ClasseB { " +
                "Preço em Euros = " + Preço +
                ", Região = " + Região +
                ", Quartos = " + Quartos +
                " }";
    }
}
