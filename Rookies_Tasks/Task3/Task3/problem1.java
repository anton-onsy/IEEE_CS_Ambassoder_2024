import java.util.Scanner;
public class problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of characters in the string : ");
        int n = scanner.nextInt();
        StringBuilder feeling = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                feeling.append("I hate");
            } else {
                feeling.append("I love");
            }

            if (i != n) {
                feeling.append(" that ");
            } else {
                feeling.append(" it");
            }
        }

        System.out.println(feeling.toString());
    }
    }
