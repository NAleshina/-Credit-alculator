public class CreditPaymentService {
    //используется формула расчёта аннуитетного платежа
    public double calculate(double amount, double period, double percent) {
        {
            double rate = percent / 12 / 100;
            double y = 1 + rate;
            double coefficient1 = rate * Math.pow(y, period);
            double coefficient2 = Math.pow(y, period) - 1;
            double coefficient = coefficient1 / coefficient2;
            double payment = coefficient * amount;

            return payment;
        }
    }

}
