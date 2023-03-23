public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        float creditSum = 1_000_000F;
        float interesRate = 9.99F;
        int creditTerm = 1;
        double payment = service.calculate(creditSum, interesRate, creditTerm);
        System.out.println("Сумма кредита: " + (int) creditSum + " руб.  Срок кредита: " + creditTerm + " год(а). Процентная ставка: " + interesRate + " %");
        System.out.println("Ежемесячный платеж: " + (int) payment + " руб.");

        System.out.println();
        creditTerm = 2;
        payment = service.calculate(creditSum, interesRate, creditTerm);
        System.out.println("Сумма кредита: " + (int) creditSum + " руб.  Срок кредита: " + creditTerm + " год(а). Процентная ставка: " + interesRate + " %");
        System.out.println("Ежемесячный платеж: " + (int) payment + " руб.");

        System.out.println();
        creditTerm = 3;
        payment = service.calculate(creditSum, interesRate, creditTerm);
        System.out.println("Сумма кредита: " + (int) creditSum + " руб.  Срок кредита: " + creditTerm + " год(а). Процентная ставка: " + interesRate + " %");
        System.out.println("Ежемесячный платеж: " + (int) payment + " руб.");
    }
}
