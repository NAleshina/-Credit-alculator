import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double paymentFor1Year = service.calculate(1000000, 12, 9.99);
        DecimalFormat df = new DecimalFormat ( "#");
        System.out.println(df.format(paymentFor1Year) + " Р");

        double paymentFor2Years = service.calculate(1000000, 24, 9.99);
        System.out.println(df.format(paymentFor2Years) + " Р");

        double paymentFor3Years = service.calculate(1000000, 36, 9.99);
        System.out.println(df.format(paymentFor3Years) + " Р");
    }
}
