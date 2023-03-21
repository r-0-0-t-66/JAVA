public class DecimalComparator {
    public static void main(String[] args) {

System.out.println(areEqualByThreeDecimalPlaces(2.121,2.123));
    }

    public static boolean areEqualByThreeDecimalPlaces(double prvi,double drugi){
        boolean value;
        if(Math.round(prvi*1000.000)/1000.000==Math.round(drugi*1000.000)/1000.000){
            value= true;
        }else {
            value= false;
        }
        return value;
    }
}
