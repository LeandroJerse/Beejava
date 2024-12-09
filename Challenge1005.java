
import java.util.Locale;
import java.util.Scanner;

public class Challenge1005 {

    public static double avarage(double first_number, double second_number) {
        return (first_number * 3.5 + second_number * 7.5) / 11;
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double first, second, total;
        first = sc.nextDouble();
        second = sc.nextDouble();
        total = avarage(first, second);
        System.out.printf("MEDIA = %.5f\n", total);

        sc.close();
    }

}
