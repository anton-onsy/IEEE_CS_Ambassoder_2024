import java.util.Scanner;
public class problem4 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number of entrances at your place : ");
            int n = scanner.nextInt();
            System.out.println("the number of your entrance : ");
            int a = scanner.nextInt();
            System.out.println("the length of your walk : ");
            int b = scanner.nextInt();

            int finalEntrance = (a + b) % n;
            if (finalEntrance <= 0) {
                finalEntrance += n;
            }

            System.out.println("your final entrance is : "+ finalEntrance);
        }
    }

