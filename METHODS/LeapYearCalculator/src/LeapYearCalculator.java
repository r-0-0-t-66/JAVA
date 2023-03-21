public class LeapYearCalculator {
    public static void main(String[] args) {
        isLeapYear(-100);
    }

    public static void isLeapYear(int year){

        if(year<1 || year>9999){
            System.out.println("False input");
            return;
        }
        if (year%4==0 && year%100==0 && year%400==0){
            System.out.println("Its a leap year");
        }else {
            System.out.println("Its not a leap year");
        }


    }
}
