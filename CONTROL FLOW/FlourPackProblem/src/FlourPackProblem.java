public class FlourPackProblem {
    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 5));
    }
    public static boolean canPack(int bigCount, int smallCount, int goal){
        boolean checkPack = false;
       int bC = 5 * bigCount;
       int sC = 1 * smallCount;
        int sum = 0;
        sum = bC + sC;

        if (sum < goal){
            checkPack = false;
        } else if (sum == goal) {
            checkPack = true;
        } else if (sum > goal) {
            if (bC / 2 == 0 || sC  / 2 == 0){
                checkPack = false;
            }else {
                checkPack = true;
            }
        }
        return  checkPack;
    }
}
