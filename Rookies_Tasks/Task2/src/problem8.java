import java.util.Scanner;

public class problem8 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number of entrances at your place : ");
            int n = scanner.nextInt();
            System.out.println("the number of your entrance : ");
            int m = scanner.nextInt();
            System.out.println("the length of your walk : ");
            int a = scanner.nextInt();
            System.out.println("the cost of a ticket : ");
            int b = scanner.nextInt();

            int cost = Math.min(n * a, (n / m) * b + (n % m) * a);
            cost = Math.min(cost, ((n / m) + 1) * b);
            cost = Math.min(cost, (n / m) * b + (n % m > 0 ? b : 0));

            System.out.println(cost);
        }
    }

