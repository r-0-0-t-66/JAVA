public class TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println(hasTeen(22,23,13));

        System.out.println(isTeen(15));
    }

    public static boolean hasTeen(int a, int b, int c){
        boolean result = false;

        if (a>=13 && a<=19 || b>=13 && b<=19 || c>=13 && c<=19){
            result=true;
        }else{
            result=false;
        }

        return result;
    }

    public static boolean isTeen(int z){
        boolean resultT=false;

        if (z>=13 && z<=19){
            resultT=true;
        }else {
            resultT=false;
        }

        return resultT;
    }
}
