import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Titular;
        String numeroDeConta;
        double Quantidade;
        int limit = 2;

        Conta[] accounts = new Conta[limit];

        for (int i = 0; i < limit; i++) {
            System.out.println("Preencha a informação sobre a conta " + (i + 1) + ".");
            System.out.println("Nome: ");
            Titular = sc.next();
            System.out.println("Numero de Conta: ");
            numeroDeConta = sc.next();
            System.out.println("Quantia total: ");
            Quantidade = sc.nextDouble();
            accounts[i] = new Conta(Titular, numeroDeConta, Quantidade);
        }
        Conta.compararDinheiro(accounts[0], accounts[1]);
    }
}
