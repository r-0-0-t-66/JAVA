public class Main {
    public static void main(String[] args) {

        /* int value = 1;
        if (value == 1){
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        }else {
            System.out.println("Value was neither 1 nor 2");
        }*/


        int switchValue = 1;
        int eSwitch = 2;

        //TRADITIONAL SWITCH
        switch (switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            default: System.out.println("Value was neither 1 nor 2");
            break;
        }

        //ADVANCED SWITCH
        switch (eSwitch){
            case 1 -> System.out.println("Value is 1");
            case 2 -> System.out.println("Value is 2");
            default -> System.out.println("Its neither 1 nor 2");
        }

        //SWITCH METHOD IMPLEMENTATION
        String month = "XYZ";
        System.out.println(month +" belongs to "+getQuarter(month)+" quarter.");

    }
        //SWITCH METHOD
    public static String getQuarter(String month){
        //ADVANCED SWITCH OPTION
        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> {
                String badResponse = month + " is bad.";
                yield badResponse;
            }
        };
            //TRADITIONAL SWITCH OPTION
        /* switch (month){
            case "JANUARY":
            case "FEBRUARY":
            case "MARCH":
                return "1st";

            case "APRIL":
            case "MAY":
            case "JUNE":
                return "2nd";

            case "JULY":
            case "AUGUST":
            case "SEPTEMBER":
                return "3rd";

            case "OCTOBER":
            case "NOVEMBER":
            case "DECEMBER":
                return "4th";
        }
        return "bad"; */
    }
}
