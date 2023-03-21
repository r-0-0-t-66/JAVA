public class Main {
    public static void main(String[] args) {
        System.out.println(sumDigits(125));
    }
    public static int sumDigits(int number){
        int digitSum = 0;
        int counter = 0;
        if (number < 0){
            return -1;
        }
        while(number > 9){
            digitSum += (number % 10);
            number = number / 10;
        }
            digitSum += number;
        return digitSum;
    }
}
