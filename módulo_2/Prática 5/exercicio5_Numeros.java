import java.util.Scanner;
public class exercicio5_Numeros {
    public static void exercicio5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduza um número: ");
        double numero = sc.nextDouble();

        if(numero>=0){
            System.out.println("O número introduzido é positivo.");
        } else {
            System.out.println("O número introduzido é negativo.");
        }

    }
}
