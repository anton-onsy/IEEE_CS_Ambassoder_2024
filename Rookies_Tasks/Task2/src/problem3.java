import java.util.Arrays;
import java.util.Scanner;
public class problem3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number of shops :");
            int n = scanner.nextInt();
            int[] prices = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.println("Enter the prices of the shop "+(i+1)+":");
                prices[i] = scanner.nextInt();
            }
            Arrays.sort(prices);

                System.out.println("Enter the money you have :");
                int m = scanner.nextInt();
                int shops = binarySearch(prices, m);
                System.out.println(shops);
            }

        private static int binarySearch(int[] prices, int m) {
            int left = 0;
            int right = prices.length;
            while (left < right) {
                int mid = (left + right) / 2;
                if (prices[mid] <= m) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
            return left;
        }
    }
