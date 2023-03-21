public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
    }

    public static boolean isPalindrome(int number){
        boolean palindrome;
        int reverse = 0;
        int lastDigit;
        int stored = number;


        while (stored > 0){
            lastDigit = stored % 10;
            reverse = (reverse * 10) + lastDigit;
            stored = stored / 10;


        }


        if (number == reverse){
            palindrome = true;
        }else {
            palindrome = false;
        }
        return palindrome;
    }
}
