import java.util.Scanner;

public class problem7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of movies : ");
        int n = scanner.nextInt();
        int[] initialRatings = new int[n];
        int[] finalRatings = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the initial "+(i+1)+":");
            initialRatings[i] = scanner.nextInt();
            System.out.println("Enter the final "+(i+1)+":");
            finalRatings[i] = scanner.nextInt();

            if (initialRatings[i] != finalRatings[i]) {
                System.out.println("rated");
                return;
            }
        }

        for (int i = 0; i < n - 1; i++) {
            if (initialRatings[i] < initialRatings[i + 1]) {
                System.out.println("unrated");
                return;
            }
        }

        System.out.println("maybe");
    }
}