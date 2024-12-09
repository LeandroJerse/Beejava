
import java.util.Locale;
import java.util.Scanner;

public class Challenge1001 {

    public static int sum(int first_number, int second_number) {
        return first_number + second_number;
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int first, second, total;
        first = sc.nextInt();
        second = sc.nextInt();
        total = sum(first, second);
        System.out.println("X = " + total);

        sc.close();
    }

}
