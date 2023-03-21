public class Main {
    public static void main(String[] args) {
        for(double rate = 2; rate <= 5; rate++){
            double interestAmount = calculateInterest(10000.0, rate);
            System.out.println("10 000 at "+ rate + "% is "+interestAmount);
        }

        for (double rate = 7.5; rate <= 10; rate+=0.25){
            double interestAmountC = calculateInterest(100, rate);
            System.out.println("10 000 at "+ rate + "% is "+interestAmountC);
        }
    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount *(interestRate/100));
    }
}
