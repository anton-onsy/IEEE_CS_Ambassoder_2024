import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows :");
        int r = scanner.nextInt();
        System.out.println("Enter the number of columns :");
        int c = scanner.nextInt();
        scanner.nextLine();

        char[][] cake = new char[r][c];
        boolean[][] eaten = new boolean[r][c];
        for (int i = 0; i < r; i++) {
            System.out.println("Enter the cake row like this : ...s or .s..");
            System.out.println("Enter the cake row " + (i + 1) + " :");
            cake[i] = scanner.nextLine().toCharArray();
        }

        int count = 0;
        for (int i = 0; i < r; i++) {
            boolean hasStrawberry = false;
            for (int j = 0; j < c; j++) {
                if (cake[i][j] == 's') {
                    hasStrawberry = true;
                    break;
                }
            }
            if (!hasStrawberry) {
                for (int j = 0; j < c; j++) {
                    if (!eaten[i][j]) {
                        eaten[i][j] = true;
                        count++;
                    }
                }
            }
        }

        for (int j = 0; j < c; j++) {
            boolean hasStrawberry = false;
            for (int i = 0; i < r; i++) {
                if (cake[i][j] == 's') {
                    hasStrawberry = true;
                    break;
                }
            }
            if (!hasStrawberry) {
                for (int i = 0; i < r; i++) {
                    if (!eaten[i][j]) {
                        eaten[i][j] = true;
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}