public class Exercise_01 {

    private static final double LIRE_EURO_RATE = 0.035;

    public static double convertLireEuro(int x) {

        double euro = x * LIRE_EURO_RATE;
        return euro;
    }

    public static void main(String[] args) {

        int lire = 999; 
        double euro = convertLireEuro(lire);
        System.out.println(lire + " Lire is same to " + euro + " Euro.");
    }
}
