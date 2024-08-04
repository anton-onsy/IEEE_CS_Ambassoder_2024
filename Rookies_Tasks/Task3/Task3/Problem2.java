import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of characters in the string : ");
        int n = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the string : ");
        String s = scanner.nextLine().toLowerCase();

        boolean[] alphabet = new boolean[26];
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                alphabet[c - 'a'] = true;
            }
        }

        for (boolean letterPresent : alphabet) {
            if (!letterPresent) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }
}
