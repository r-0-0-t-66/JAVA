public class Main {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(-10));
    }
    public static int sumFirstAndLastDigit(int number){
        int sum = 0;
        int lastDigit;
        if (number < 0){
            return -1;
        }
        lastDigit = number % 10; //zadnja znamenka
        while (number > 9){
            number = number / 10; //za prvu znamenku
        }
        sum = number + lastDigit;
        return sum;
    }
}
