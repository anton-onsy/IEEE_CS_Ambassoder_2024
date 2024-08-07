import java.util.Scanner;

public class problem10 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number of minutes of the first task : ");
            int n = scanner.nextInt();
            System.out.println("Enter the number of minutes of the second task : ");
            int m = scanner.nextInt();
            System.out.println("Enter the number of minutes of the third task : ");
            int z = scanner.nextInt();

            int lcm_nm = Least_Common_Multiple(n, m);

            int result = z / lcm_nm;

            System.out.println(result);

        }

    public static int Greatest_Common_Divisor(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int Least_Common_Multiple(int a, int b) {
        return a * (b / Greatest_Common_Divisor(a, b));
    }
}
