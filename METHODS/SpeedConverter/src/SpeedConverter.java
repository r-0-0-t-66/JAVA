public class SpeedConverter {
    public static void main (String[] args) {
        System.out.println(Math.round(toMilesPerHour(-5.6)));

        printConversion(10.25);
    }



    public static double toMilesPerHour(double kilometersPerHour){
        double miles;
        if(kilometersPerHour<0){
            return -1;
        }else{
            miles=kilometersPerHour*0.621;
        }
        return miles;
    }

    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour<0){
            System.out.println("Invalid Value");
        }
        double milesPerHour=kilometersPerHour*0.621;
        System.out.println(kilometersPerHour+" km/h= "+ Math.round(milesPerHour)+" mi/h");

    }
}
