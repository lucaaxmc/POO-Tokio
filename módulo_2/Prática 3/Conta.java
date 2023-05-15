public class Conta {

    private String Titular;
    private String numeroDeConta;
    private double Quantidade;

    public Conta(String Titular, String numeroDeConta, double Quantidade) {
        this.Titular = Titular;
        this.numeroDeConta = numeroDeConta;
        this.Quantidade = Quantidade;
    }

    public static void compararDinheiro(Conta Um, Conta Dois) {
        if (Um.getQuantidade() > Dois.getQuantidade()) {
            System.out.println("A primeira conta tem mais dinheiro que a segunda.");
        } else if (Um.getQuantidade() < Dois.getQuantidade()) {
            System.out.println("A segunda conta tem mais dinheiro que a primeira.");
        } else {
            System.out.println("As duas contas têm a mesma quantidade de dinheiro.");
        }
    }

    public String getTitular() {
        return Titular;
    }

    public void setTitular(String Titular) {
        this.Titular = Titular;
    }

    public String getNumeroDeConta() {
        return numeroDeConta;
    }

    public void setNumeroDeConta(String numeroDeConta) {
        this.numeroDeConta = numeroDeConta;
    }

    public double getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(double Quantidade) {
        this.Quantidade = Quantidade;
    }
}
