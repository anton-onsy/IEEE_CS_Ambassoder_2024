import java.util.*;
public class problem5 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number of test cases: ");
            int T = scanner.nextInt();
            while (T-- > 0) {
                System.out.println("Enter the number of ingredients needed: ");
                int n = scanner.nextInt();
                System.out.println("Enter the maximum allowed number of ingredients: ");
                int k = scanner.nextInt();
                int[] a = new int[n];
                for (int i = 0; i < n; i++) {
                    System.out.println("Enter the ingredient number " + (i + 1) + " :");
                    a[i] = scanner.nextInt();
                }

                int[] last = new int[n + 1];
                Arrays.fill(last, -1);
                for (int i = 0; i < n; i++) {
                    last[a[i]] = i;
                }

                PriorityQueue<Integer> outside = new PriorityQueue<>(Comparator.comparingInt(i -> last[i]));
                boolean[] used = new boolean[n + 1];
                int opens = 0;

                for (int i = 0; i < n; i++) {
                    if (used[a[i]]) continue;
                    if (outside.size() == k) {
                        used[outside.poll()] = false;
                    }
                    outside.add(a[i]);
                    used[a[i]] = true;
                    opens++;
                }

                System.out.println("the minimum number of times: "+opens);
            }
        }
    }

