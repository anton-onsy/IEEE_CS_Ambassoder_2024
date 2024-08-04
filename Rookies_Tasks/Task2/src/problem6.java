import java.util.Scanner;
public class problem6 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number of records :");
            int n = scanner.nextInt();
            int[] records = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.println("Enter the records of the record "+(i+1)+":");
                records[i] = scanner.nextInt();
            }

            if (records[n - 1] == 0) {
                System.out.println("UP");
            } else if (records[n - 1] == 15) {
                System.out.println("DOWN");
            } else if (n == 1) {
                System.out.println(-1);
            } else {
                System.out.println(records[n - 1] > records[n - 2] ? "UP" : "DOWN");
            }
        }
    }

