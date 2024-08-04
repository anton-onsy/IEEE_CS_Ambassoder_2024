import java.util.ArrayList;
import java.util.Scanner;
public class problem2 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number of days :");
            int n = scanner.nextInt();
            boolean[] horizontal = new boolean[n+1];
            boolean[] vertical = new boolean[n+1];
            ArrayList<Integer> days = new ArrayList<>();

            for (int i = 1; i <= n*n; i++) {
                System.out.println("Enter the horizontal cuts "+(i)+":" );
                int h = scanner.nextInt();
                System.out.println("Enter the vertical cuts " +(i)+":");
                int v = scanner.nextInt();
                if (!horizontal[h] && !vertical[v]) {
                    horizontal[h] = true;
                    vertical[v] = true;
                    days.add(i);
                }
            }

            for (int day : days) {
                System.out.print("your days is : "+day + " ");
            }
        }
    }
