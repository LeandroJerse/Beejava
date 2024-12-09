
import java.util.Locale;
import java.util.Scanner;

public class Challenge1002 {

    public static double area(double radius) {
        double pi = 3.14159;
        return Math.pow(radius, 2) * pi;
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double radius;
        radius = sc.nextDouble();

        System.out.printf("A=%.4f\n", area(radius));

        sc.close();
    }

}
