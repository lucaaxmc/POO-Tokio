import java.util.Scanner;
public class exercicio7_Notas {
    public static void exercicio7() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a nota do aluno, de 1 a 10: ");
        int nota = sc.nextInt();

        switch (nota){
            case 0,1,2,3,4:
                System.out.println("Insuficiente.");
                break;
            case 5:
                System.out.println("Suficiente");
                break;
            case 6,7:
                System.out.println("Bom");
                break;
            case 8:
                System.out.println("Notável.");
                break;
            case 9,10:
                System.out.println("Muito Bom.");
                break;
            default:
                System.out.println("Valor Inválido");
                break;
        }
    }
}

