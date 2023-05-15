import java.util.Scanner;
public class exercicio8_Primo {
    public static void exercicio8() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduza um número maior que 0 e menor que 100: ");
            int numero = sc.nextInt();

            while(numero < 1) {
                System.out.println("O número não é válido. Introduza outro número: ");
                numero = sc.nextInt();
            }
            while(numero > 100){
                System.out.println("O número não é válido. Introduza outro número: ");
                numero = sc.nextInt();
            }

            boolean primo = true;
            for (int i = 2; i < numero; i++) {
                if( numero % i == 0) {
                    primo = false;
                }
            }
            if(primo){
                System.out.println("O número é primo.");
            } else {
                System.out.println("O número não é primo.");
            }
        }
    }
