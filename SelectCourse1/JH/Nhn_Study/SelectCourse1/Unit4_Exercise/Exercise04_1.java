package Unit4_Exercise;

import java.math.BigDecimal;

public class Exercise04_1 {

    private static final double exchangeRage = 0.035;

    public static double convertLireEuro(double x) {
        BigDecimal lire = BigDecimal.valueOf(x);
        BigDecimal exchangeRate = BigDecimal.valueOf(exchangeRage);
        BigDecimal euro = lire.multiply(exchangeRate);
        return euro.doubleValue();
    }

    public static void main(String[] args) {
        System.out.println(convertLireEuro(10.679));
    }
}
