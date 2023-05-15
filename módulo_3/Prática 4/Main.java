import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
        private static final String MENU;
        static {
            MENU =  "Sistema de PC:\n\t 1. Novo PC.\n\t 2. Modificar PC.\n\t 3. Apagar.\n\t 4. Mostrar mapa.\nIndique uma opção (0 ou \"Sair\" para sair): ";
        }

    public static void main(String[] args) {
        Map<Integer, PC> mPC = new HashMap<Integer, PC>();
        Scanner sc = new Scanner(System.in);
        String option = "";

        do {
            System.out.print(MENU);
            option = sc.nextLine();
            System.out.println("--------------------------");
            switch (option) {
                case "0":
                case "Sair":
                    System.out.println("Adeus!");
                    break;
                case "1":
                    System.out.println("Novo PC.");
                    addPC(mPC);
                    break;
                case "2":
                    System.out.println("Modificar PC.");
                    updatePC(mPC);
                    break;
                case "3":
                    System.out.println("Apagar PC.");
                    deletePC(mPC);
                    break;
                case "4":
                    System.out.println("Mostrar mapa PC.");
                    showMapPC(mPC);
                    break;
                default:
                    System.err.println("Opção não disponivél no sistema.");
            }
        }while(!(option.equals("0")||option.toLowerCase().equals("Sair")));
    }

    public static void showMapPC(Map mData) {
        if(!mData.isEmpty())
            mData.forEach((k,v)->System.out.println( mData.get(k) ));
        else
            System.err.println("Não há dados no sistema.");

    }

    public static void addPC(Map mData) {
        PC pc1 = new PC("HP", "DY2501TU", 1050, 250);
        mData.put(pc1.getId(),pc1);
        System.out.println("\tPC adicionado.");
    }

    public static void updatePC(Map mData) {
        Scanner sc = new Scanner(System.in);
        Integer elem;
        if(!mData.isEmpty()) {
            do {
                System.out.println("PC no sistema:");
                showMapPC(mData);
                System.out.print("Indique o ID do PC a modificar:");
                try {
                    elem = sc.nextInt();
                }catch(NoSuchElementException ex) {
                    System.err.println("Não é um valor numérico!");
                    sc.next();
                    elem = 0;
                }

                if(elem<=0||elem>PC.showLastID()||mData.get(elem)==null)
                    System.err.println("Opção inválida!");
                else {

                    PC pc = new PC("ASUS", "ZenBook Pro", 1060, 500,elem);
                    mData.put(elem,pc);
                    System.out.println("PC modificado.");
                }

            }while(elem<=0||elem>PC.showLastID());
        }
        else
            System.err.println("Não há dados no sistema!");

    }

    public static void deletePC(Map mData) {
        Scanner sc = new Scanner(System.in);
        Integer elem;
        if(!mData.isEmpty()) {
            do {
                System.out.println("PC no sistema:");
                showMapPC(mData);
                System.out.print("Indique o ID do PC a apagar:");
                try {
                    elem = sc.nextInt();
                }catch(NoSuchElementException ex) {
                    System.err.println("Não é um valor numérico!");
                    sc.next();
                    elem = 0;
                }

                if(elem<=0||elem>PC.showLastID()||mData.get(elem)==null)
                    System.err.println("Opção inválida!");
                else {
                    mData.remove(elem);
                    System.out.println("PC apagado.");
                }

            }while(elem<=0||elem>PC.showLastID());
        }
        else
            System.err.println("Não há dados no sistema!");
    }
}