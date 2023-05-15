import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Pessoa p1 = new Cliente("Sara", "Mendes Costa", 27, 9);
        Pessoa p2 = new Funcionário("Filomena", "Gomes Pereira", 23, "123CL");

        Cliente c1 = new Cliente("Paulo", "Sousa Sá", 32, 7);
        Funcionário f1 = new Funcionário("José", "Marcos Mendes", 45, "321AS");

        System.out.println("Dados:");
        System.out.println();
        System.out.println(p1.toString() + "\n" + c1.toString() + "\n" + p2.toString() + "\n" + f1.toString());

        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduza o seu número de cliente/funcionário: ");
        String número = sc.next();
        switch (número){
            case "9":
                System.out.println(((Cliente) p1).bemVindo());
                break;

            case "123CL":
                System.out.println(((Funcionário) p2).bemVindo());
                break;

            case "7":
                System.out.println(((Cliente) c1).bemVindo());
                break;

            case "321AS":
                System.out.println(((Funcionário) f1).bemVindo());
                break;

            default:
                System.err.println("Erro ao processar a informação.");
        }
    }

}