import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class problem12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of socks : ");
        int n = scanner.nextInt();
        Set<Integer> table = new HashSet<>();
        int maxSocks = 0;

        for (int i = 0; i < 2 * n; i++) {
            System.out.println("Enter the sock number " + (i + 1) + ":");
            int sock = scanner.nextInt();
            if (table.contains(sock)) {
                table.remove(sock);
            } else {
                table.add(sock);
            }
            maxSocks = Math.max(maxSocks, table.size());
        }

        System.out.println(maxSocks);
    }
}
