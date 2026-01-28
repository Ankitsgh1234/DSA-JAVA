package SwayamTest;

import java.util.Scanner;

public class FenwickTree {
        static void update(int[] bit, int n, int i, int val) {
        while (i <= n) {
            bit[i] += val;
            i += i & (-i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int[] bit = new int[n + 1];
        for (int i = 0; i < n; i++) {
            update(bit, n, i + 1, arr[i]);
        }

        System.out.print(0);
        for (int i = 1; i < n; i++) {
            System.out.print(" " + bit[i]);
        }
    }


}
