import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("The sum is: " + getUserInput());

    }

    public static int getUserInput(){
        int sum = 0;
        int a = 0, b = 0, c = 0, d = 0, e = 0;
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter first number: ");
             a = scanner.nextInt();
            System.out.println("enter second number: ");
           b = scanner.nextInt();
            System.out.println("enter third number: ");
             c = scanner.nextInt();
            System.out.println("enter fourth number: ");
             d = scanner.nextInt();
            System.out.println("enter fifth number: ");
             e = scanner.nextInt();

        }catch (NumberFormatException badUserInput){
            System.out.println("Invalid input, try again!");
        }
        sum = a + b + c + d + e;

        return sum;

    }
}
