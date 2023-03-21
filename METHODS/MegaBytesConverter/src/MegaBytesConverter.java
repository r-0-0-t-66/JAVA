public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        int megaBytes;
        int ostatak;
        if (kiloBytes<0){
            System.out.println("Invalid Value");
        }
        megaBytes=kiloBytes/1024;
        ostatak=kiloBytes%1024;
        System.out.println(kiloBytes+"KB= "+megaBytes+"MB and "+ ostatak+" KB");

    }
}
