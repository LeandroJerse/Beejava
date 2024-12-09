
import java.util.Locale;
import java.util.Scanner;

public class Challenge1004 {

    public static int prod(int first_number, int second_number) {
        return first_number * second_number;
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int first, second, total;
        first = sc.nextInt();
        second = sc.nextInt();
        total = prod(first, second);
        System.out.println("PROD = " + total);

        sc.close();
    }

}
