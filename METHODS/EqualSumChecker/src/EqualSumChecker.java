public class EqualSumChecker {
    public static void main(String[] args) {
        System.out.println(hasEqualSum(1,-1,0));

    }

    public static boolean hasEqualSum(int a, int b, int c){
        boolean result;
        if(a+b==c || a+c==b || b+c==a){
           result = true;
        }else {
            result=false;
        }
        return result;
    }
}
