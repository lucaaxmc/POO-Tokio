import java.util.Scanner;
public class exercicio1_Media {
    public static void exercicio1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o primeiro número: ");
        double numberUm = sc.nextDouble();

        System.out.println("Insira o segundo número: ");
        double numberDois = sc.nextDouble();

        System.out.println("Insira o terceiro número: ");
        double numberTres = sc.nextDouble();

        System.out.println("Insira o quarto número: ");
        double numberQuatro = sc.nextDouble();

        System.out.println("Insira o quinto número: ");
        double numberCinco = sc.nextDouble();

        System.out.println("Insira o sexto número: ");
        double numberSeis = sc.nextDouble();

        System.out.println("A média aritmética dos seis números é: " + ((numberUm + numberDois + numberTres + numberQuatro + numberCinco + numberSeis) / 6));
    }
}
