package SwayamTest;

import java.util.Scanner;

public class ZigzagTree {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int idx = 0, level = 0;

        while (idx < n) {
            int size = 1 << level;
            int end = Math.min(idx + size, n);

            if (level % 2 == 0) {
                for (int i = idx; i < end; i++)
                    System.out.print(arr[i] + " ");
            } else {
                for (int i = end - 1; i >= idx; i--)
                    System.out.print(arr[i] + " ");
            }
            idx = end;
            level++;
        }
    }

}
