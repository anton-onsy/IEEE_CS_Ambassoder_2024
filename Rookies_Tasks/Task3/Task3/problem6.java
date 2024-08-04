import java.util.Scanner;

public class problem6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = 0, col = 0;

        // Find the position of 1 in the matrix
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.println("Enter the element in the matrix at position (" + (i-1) + ", " + (j-1)+ ") : ");
                if (scanner.nextInt() == 1) {
                    row = i;
                    col = j;
                }
            }
        }

        // Calculate the number of moves to bring 1 to the center
        int moves = Math.abs(row - 3) + Math.abs(col - 3);
        System.out.println(" the minimum number of moves is : "+moves);
    }
}
