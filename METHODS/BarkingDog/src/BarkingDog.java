public class BarkingDog {
    public static void main(String[] args) {
        shouldWakeUp(true,-1);
    }

    public static void shouldWakeUp(boolean barking, int hourOfDay){


        if(barking==true && hourOfDay<8 && hourOfDay>0 || hourOfDay>22 && hourOfDay<23){
            barking=true;
        }else{
            barking=false;
        }
        System.out.println(barking);
    }
}
