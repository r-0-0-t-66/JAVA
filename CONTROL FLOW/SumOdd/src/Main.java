public class Main {
    public static void main(String[] args) {
        System.out.println("Zbroj neparnih: "+sumOdd(100, 1000));
    }
    public static boolean isOdd(int number){
        boolean num;
        if (number > 0 && number % 2 == 1){
            num = true;
        }else {
            num = false;
        }
        return num;
    }
    public static int sumOdd(int start, int end){
        int sum = 0;
        if (end >= start && start > 0 && end > 0){
            for (int i = start; i <= end; i++){
                if (isOdd(i)){
                    sum+=i;
                }
            }
        }else {
            sum = -1;
        }

       return sum;
    }
}
