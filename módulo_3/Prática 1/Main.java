import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int option = 0;
        boolean valid = false;
        double dinheiro;
        System.out.println("Este programa faz a conversão de dinheiro.");
        System.out.println("Escolha uma opção: ");
        System.out.println("1: Converter Libras em Euros.");
        System.out.println("2: Converter Euros em Libras.");
        while (!valid) {
            try {
                option = Integer.parseInt(sc.nextLine());
                if (option >= 1 && option <= 2) {
                    valid = true;
                } else {
                    System.out.println("Opção inválida! Por favor tente outra vez.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Opção inválida! Por favor tente outra vez.");
            }
        }
        valid = false;
        if (option == 1) {
            System.out.println("Por favor insira o valor que pretende converter em Euros: ");
            while (!valid) {
                try {
                    dinheiro = Double.parseDouble(sc.nextLine());
                    System.out.println("\n" + dinheiro + " Libras convertidas em Euros são: "
                            + String.format("%.2f", euroLibra.getParaEuro(dinheiro)) + " Euros.");
                    valid = true;
                } catch (NumberFormatException e) {
                    System.out.println("Valor inválido! Por favor tente outra vez: ");
                }
            }
        } else {
            System.out.println("Por favor insira o valor que pretende converter em Libras: ");
            while (!valid) {
                try {
                    dinheiro = Double.parseDouble(sc.nextLine());
                    System.out.println("\n" + dinheiro + " Euros convertidos em Libras são: "
                            + String.format("%.2f", euroLibra.getParaLibra(dinheiro)) + " Libras.");
                    valid = true;
                } catch (NumberFormatException e) {
                    System.out.println("Valor inválido! Por favor tente outra vez: ");
                }
            }
        }
        String[] factos = {euroLibra.getFacto1(), euroLibra.getFacto2(), euroLibra.getFacto3(), euroLibra.getFacto4()};
        java.util.Random random = new java.util.Random();
        int random_facto = random.nextInt(factos.length);
        System.out.println("Um facto interessante sobre uma das moedas: " + factos[random_facto]);
    }
}