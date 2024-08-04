import java.util.Scanner;
public class problem7 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number of sticks :");
            int n = scanner.nextInt();

            if (n % 2 == 0) {
                System.out.println(n / 2);
                for (int i = 0; i < n / 2; i++) {
                    System.out.print(2 + " ");
                }
            } else {
                System.out.println((n - 3) / 2 + 1);
                for (int i = 0; i < (n - 3) / 2; i++) {
                    System.out.print(2 + " ");
                }
                System.out.print(3);
            }
        }
    }

