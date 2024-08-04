import java.util.Scanner;

public class problem9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of values of the banknotes : ");
        int n = scanner.nextInt();
        boolean hasOne = false;
        int [] banknotes = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter  the value of the banknote " + (i + 1) + ":");
            banknotes[i] = scanner.nextInt();
        }
            for (int i = 0; i < n; i++) {
            if (banknotes[i] == 1) {
                hasOne = true;
            }
        }

        if (hasOne) {
            System.out.println(-1);
        } else {
            System.out.println(1);
        }
    }
}