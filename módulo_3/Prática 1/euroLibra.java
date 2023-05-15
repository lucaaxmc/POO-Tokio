public class euroLibra {
    private static final String Facto1 = "A taxa de conversão está sempre a mudar.";
    private static final String Facto2 = "A Libra vale mais que o Euro.";
    protected static String Facto3 = "Atualmente, 1 Euro é igual a 0,88 Libras";
    protected static String Facto4 = "A Rainha Elizabeth II foi a primeira monarca a aparecer numa nota de Libra, em 1960.";

    private static double paraEuro(double l2) {
        return (l2 / 0.8857313);
    }

    private static double paraLibra(double e2) {
        return (e2 * 0.8857313);
    }

    public static double getParaEuro(double l1) {
        return paraEuro(l1);
    }

    public static double getParaLibra(double e1) {
        return paraLibra(e1);
    }

    public static String getFacto1() {
        return Facto1;
    }

    public static String getFacto2() {
        return Facto2;
    }

    public static String getFacto3() {
        return Facto3;
    }

    public static String getFacto4() {
        return Facto4;
    }
}
