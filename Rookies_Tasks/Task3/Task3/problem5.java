import java.util.Scanner;

public class problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the price of one shovel : ");
        int k = scanner.nextInt();
        System.out.println("Enter the denomination of the coin in Polycarp's pocket : ");
        int r = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            if ((k * i) % 10 == r || (k * i) % 10 == 0) {
                System.out.println(" the required minimum number of shovels is " + i);
                break;
            }
        }
    }
}
