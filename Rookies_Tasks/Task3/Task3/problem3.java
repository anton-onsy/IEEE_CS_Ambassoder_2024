import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of integers : ");
        int n = scanner.nextInt();
        long sum = 0;
        int minOdd = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the number "+(i+1)+":");
            int num = scanner.nextInt();
            sum += num;
            if (num % 2 != 0) {
                minOdd = Math.min(minOdd, num);
            }
        }

        if (sum % 2 != 0) {
            sum -= minOdd;
        }

        System.out.println(sum);
    }
}
