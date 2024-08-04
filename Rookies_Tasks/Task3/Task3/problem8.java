import java.util.Scanner;

public class problem8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year : ");
        int year = scanner.nextInt();

        while (true) {
            year++;
            if (areDigitsDistinct(year)) {
                System.out.println(year);
                break;
            }
        }
    }

    private static boolean areDigitsDistinct(int year) {
        boolean[] isPresent = new boolean[10];

        while (year > 0) {
            if (isPresent[year % 10]) {
                return false;
            }
            isPresent[year % 10] = true;
            year = year / 10;
        }

        return true;
    }
}