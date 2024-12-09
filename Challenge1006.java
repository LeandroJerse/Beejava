
import java.util.Locale;
import java.util.Scanner;

public class Challenge1006 {

    public static double avarage(double first_number, double second_number, double third_number) {
        return (first_number * 2 + second_number * 3 + third_number * 5) / 10;
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double first, second, third, total;
        first = sc.nextDouble();
        second = sc.nextDouble();
        third = sc.nextDouble();
        total = avarage(first, second, third);
        System.out.printf("MEDIA = %.1f\n", total);

        sc.close();
    }

}
