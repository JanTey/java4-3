public class CreditPaymentService {
    public double calculate(float creditSum, float interesRate, int creditTerm) {
        float i = (interesRate / 100) / 12;
        double payment = (creditSum * i) / (1 - Math.pow(1 + i, -creditTerm * 12));
        return payment;
    }
}