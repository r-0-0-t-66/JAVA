public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println("Circle: "+ area(5));
        System.out.println("Rectangle: "+ area(-1,4));
    }

    public static double area(double radius){
        if (radius<0){
            return -1.0;
        }else
        return radius*radius*Math.PI;

    }

    public static double area(double x, double y){
        if (x<0 || y<0){
            return -1.0;
        }else
        return x*y;
    }
}
