public class Main {
    public static void main(String[] args) {
        ClasseA Pessoa;
        ClasseB Casa;
        ClasseC Contrato;

        Pessoa = new ClasseA("Joaquim", 27, 1279.73);
        Casa = new ClasseB("Lisboa", 2, 850);
        Contrato = new ClasseC(6, "Rua Azul nº3", true, "José", 53, 1985.55);

        System.out.println("\nNome: " + Pessoa.Nome);
        System.out.println("Idade: " + Pessoa.getIdade());
        System.out.println("Dineiro: " + Pessoa.getDinheiro() + "\n");
        System.out.println(Casa);
        System.out.println(Contrato);
    }
}