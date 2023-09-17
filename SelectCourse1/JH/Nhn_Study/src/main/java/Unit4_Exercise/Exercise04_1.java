package Unit4_Exercise;

import java.math.BigDecimal;

public class Exercise04_1 {

    public static double convertLireEuro(int x) {
        BigDecimal lire = BigDecimal.valueOf(x);
        BigDecimal exchangeRate = new BigDecimal("0.035");
        BigDecimal euro = lire.multiply(exchangeRate);
        return euro.doubleValue();
    }

    public static void main(String[] args) {
        System.out.println(convertLireEuro(10));
    }
}
