public class PlayingCat {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(false,35));
    }

    public static boolean isCatPlaying(boolean summer, int temperature){
        boolean catPlaying;
        if (summer==false && (temperature>=25 && temperature<=35)){
            catPlaying=true;
        }
        else if (summer==true && (temperature>=25 && temperature<=45)) {
            catPlaying=true;
        }else {
            catPlaying=false;
        }
        return catPlaying;
    }
}
