public class Main {
    public static void main(String[] args) {
        sum();
    }

    public static void sum (){
        int s=0;
        int counter=0;
        for (int i=1;i<1000;i++){
            if(i%3==0 && i%5==0){
                counter++;
                s+=i;

            }
            if (counter==5){
                break;
            }
        }
        System.out.println("Sum of all numbers devisable by 3 and 5 is: "+s);
    }
}
