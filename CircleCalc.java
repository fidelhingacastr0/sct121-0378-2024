import java.util.Scanner;

public class CircleCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        double diameter = 2 * r;
        double circumference = 2 * Math.PI * r;
        double area = Math.PI * Math.pow(r, 2);

        System.out.printf("Diameter = %.2f\n", diameter);
        System.out.printf("Circumference = %.2f\n", circumference);
        System.out.printf("Area = %.2f\n", area);
    }
}