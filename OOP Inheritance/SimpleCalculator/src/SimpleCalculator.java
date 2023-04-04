public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionResults(){
        double sum = 0;
        sum = firstNumber + secondNumber;
        return sum;
    }
    public double getSubstractionResults(){
        double sub = 0;
        sub = firstNumber - secondNumber;
        return sub;
    }
    public double getMultiplicationResults(){
        double mul = 0;
        mul = firstNumber * secondNumber;
        return mul;
    }

    public double getDivisionResults(){
        double div = 0;
        if (secondNumber < 0) return 0;
        div = firstNumber / secondNumber;
        return div;
    }
}
