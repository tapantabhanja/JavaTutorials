public class AreaCalculator {

    public static void main(String[] args) {
        System.out.println("Area:" + area(5.0));
        System.out.println("Area:" + area(-1));
        System.out.println("Area:" + area(5.0, 4.0));
        System.out.println("Area:" + area(-1.0, 4.0));
    }

    public static double area(double radius) {

        // Validation
        if (radius < 0) {
            return -1.0;
        }

        else {
            return radius*radius*Math.PI;
        }
    }

    public static double area(double x, double y) {

        // Validation
        if ((x < 0) || (y < 0)) {
            return -1.0;
        }

        else
        {
            return x*y;
        }
    }
}
