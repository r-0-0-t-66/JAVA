public class Main {
    public static void main(String[] args) {
       int primeCounter = 0;
        /*for (int i = 2; i <= 20; i++){
            System.out.println("Number: "+i+" is a prime number: "+primeNum(i));
        }*/

        for (int i = 10; i<50; i++){
            if (primeNum(i)) {
                primeCounter++;
                if (primeCounter == 3){
                    break;
                }
            }
        }
        System.out.println("There are: "+primeCounter+" prime numbers.");
    }
    public static boolean primeNum(int wholeNumber){
        if (wholeNumber <=2){
            return (wholeNumber==2);
        }
        for(int divisor=2;divisor<=wholeNumber/2;divisor++){
            if (wholeNumber%divisor==0){
                return false;
            }
        }
        return true;
    }
}
