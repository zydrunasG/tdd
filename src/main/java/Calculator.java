public class Calculator {

    private double a;
    private double b;

    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double calculateSum() {
        return a+b;
    }

    public double calculateSubtract() {
        return a-b;
    }

    public double calculateMultiply() {
        return a*b;
    }

    public double calculateDivision() {
        return a/b;
    }
}
