public class TraditionalSwitchChallenge {
    public static void main(String[] args) {
        char letter = 'c';
        System.out.println("Letter "+letter+" : "+getChar(letter));
        printDayOfWeek(0);
        printDayOfWeek(1);
        printDayOfWeek(2);
        printDayOfWeek(3);
        printDayOfWeek(4);
        printDayOfWeek(5);
        printDayOfWeek(6);
        printDayOfWeek(7);

    }
//TRADITIONAL SWITCH METHOD
    public static String getChar(char letter){
        switch (letter){
            case 'A': case 'a':
                return "Able";
            case 'B': case 'b':
                return "Baker";
            case 'C': case 'c':
                return "Charlie";
            case 'D': case 'd':
                return "Dog";
            case 'E': case 'e':
                return "Easy";

        }
        return "Letter not found";
    }

//ADVANCED SWITCH METHOD
    public static void printDayOfWeek(int day){
        String dayOfWeek = switch (day){
          case 0 -> {yield "Sunday";}
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid day";
        };
        System.out.println(day+" stands for: "+dayOfWeek);
    }
}
