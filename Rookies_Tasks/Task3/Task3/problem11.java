import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class problem11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of test cases : ");
        int t = scanner.nextInt();
        int[] divisors = {1, 2, 3, 4, 6, 12};

        for (int i = 0; i < t; i++) {
            System.out.println("Enter the string : ");
            String s = scanner.next();
            List<String> solutions = new ArrayList<>();

            for (int a : divisors) {
                int b = 12 / a;
                for (int j = 0; j < b; j++) {
                    boolean win = true;
                    for (int k = 0; k < a; k++) {
                        if (s.charAt(k*b + j) != 'X') {
                            win = false;
                            break;
                        }
                    }
                    if (win) {
                        solutions.add(a + "x" + b);
                        break;
                    }
                }
            }

            System.out.println(solutions.size() + " " + String.join(" ", solutions));
        }
    }
}