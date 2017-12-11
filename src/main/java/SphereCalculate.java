public class SphereCalculate {
    private double r;
    public SphereCalculate(double r) {
        this.r = r;
    }

    public double calculateArea() {
        return 4 * 3.14 * (r * r);
    }

    public double calculateVolume() {
        return  3.14 * (r * r * r) * 4 / 3;
    }
}
