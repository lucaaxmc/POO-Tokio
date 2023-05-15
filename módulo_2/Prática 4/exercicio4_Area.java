import java.util.Scanner;
public class exercicio4_Area {
        public static void exercicio4() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Insira a medida do lado do quadrado: ");
            double ladoQuadrado = sc.nextDouble();
            System.out.println("A área do quadrado é: " + (ladoQuadrado * ladoQuadrado));
        }
}