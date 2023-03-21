public class hasSameLastDigit {
    public static void main(String[] args) {
System.out.println(hasSameLastDigit(41,22,71));
    }
    public static boolean isValid(int number){
        boolean validity;
        if (number >= 10 && number <= 1000){
            validity = true;
        }
        else {
            validity = false;
        }
        return validity;
    }
    public static boolean hasSameLastDigit(int a, int b, int c){

        if (isValid(a) && isValid(b) && isValid(c)){
            a %= 10;
            b %= 10;
            c %= 10;
            return (a == b) || (a == c) || (b == c);
        }

        return false;
    }
}
