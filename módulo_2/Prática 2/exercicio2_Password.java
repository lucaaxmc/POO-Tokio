import java.util.Scanner;

public class exercicio2_Password {
    public static void exercicio2() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha uma palavra passe nova: ");
        String palavraPasse = sc.next();

        System.out.println("Introduza a palavra passe: ");
        String password = sc.next();

        int contador = 0;

        while (!password.equals(palavraPasse) && contador <=2) {
            System.out.println("Palavra passe incorreta. Tente novamente: \n Tentativas restantes: " + (3-contador));
            contador++;
            password = sc.next();
        }

        if (password.equals(palavraPasse)) {
            System.out.println("Palavra passe correta. Acesso permitido.");
        } else {
            System.out.println("Palavra passe incorreta. Acesso bloqueado.");
        }

    }
}