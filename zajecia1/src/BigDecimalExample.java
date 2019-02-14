import java.math.BigDecimal;

public class BigDecimalExample {
    public static void main(String[] args) {
        double x = 0.02;
        double y = 0.03;
        double z = x - y;
        System.out.println(z);
        System.out.printf("%.2f\n", z); //%2f pokazuje nam 2 liczby po przecinku, gdyby było %3f byłyby 3 liczby po ,

        BigDecimal a = new BigDecimal ("0.02");
        BigDecimal b = new BigDecimal ("0.03");
        System.out.println(a.subtract(b));

    }
}
