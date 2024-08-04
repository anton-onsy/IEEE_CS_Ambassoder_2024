import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of participants : ");
        int n = scanner.nextInt();
        System.out.println("Enter the position of the participant : ");
        int k = scanner.nextInt();
        int[] scores = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the score of participant "+(i+1)+":");
            scores[i] = scanner.nextInt();
        }

        int kthScore = scores[k - 1];
        int count = 0;

        for (int score : scores) {
            if (score >= kthScore && score > 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}
