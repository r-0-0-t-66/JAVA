public class Main {
    public static void main(String[] args) {
        int num = 4;
        int finishNumber = 20;
        while (num <= finishNumber){
            num++;
            if (!isEvenNumber(num)){
                continue;
            }
            System.out.println("Even number: "+num);
        }

    }

    public static boolean isEvenNumber(int number){
        boolean result;
        if (number % 2 == 0){
            result = true;
        }else {
            result = false;
        }
        return result;
    }

}
