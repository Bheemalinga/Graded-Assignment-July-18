// package Graded_assignment;

import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();
        int maxUnique = 0;
        int uniqueCount = 0;
        int[] frequency = new int[10000001];

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.addLast(num);

            if (frequency[num] == 0) {
                uniqueCount++;
            }
            frequency[num]++;

            if (deque.size() == m + 1) {
                int removedNum = deque.removeFirst();
                frequency[removedNum]--;
                if (frequency[removedNum] == 0) {
                    uniqueCount--;
                }
            }

            maxUnique = Math.max(maxUnique, uniqueCount);

            // If we already found the maximum possible unique elements (M),
            // we can break the loop as we cannot have more unique elements
            if (maxUnique == m)
                break;
        }

        in.close();

        System.out.println(maxUnique);
    }
}
