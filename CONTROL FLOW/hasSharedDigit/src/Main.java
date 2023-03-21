public class Main {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,23));
    }

    public static boolean hasSharedDigit(int number1, int number2){
        boolean result = false;
        if ((number1 >= 10 && number1 <= 99)&&(number2 >= 10 && number2 <= 99)){
            int lastDigitNum1 = number1 % 10;
           int firstDigitNum1= number1 / 10;
            int lastDigitNum2 = number2 % 10;
            int firstDigitNum2= number2 / 10;

            if (firstDigitNum1 == firstDigitNum2 || firstDigitNum1 == lastDigitNum2 || lastDigitNum1 == lastDigitNum2 || lastDigitNum1 == firstDigitNum2){
                result = true;
            }else {
                result = false;
            }


        }
        return result;

    }
}
