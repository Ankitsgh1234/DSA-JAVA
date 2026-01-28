package SwayamTest;

import java.util.Scanner;

public class SegmentTree {
     static int[] seg, arr;
    static int n;

    static void build(int idx, int start, int end) {
        if (start == end) {
            seg[idx] = arr[start];
            return;
        }
        int mid = (start + end) / 2;
        build(2 * idx + 1, start, mid);
        build(2 * idx + 2, mid + 1, end);
        seg[idx] = seg[2 * idx + 1] + seg[2 * idx + 2];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int l = sc.nextInt(), r = sc.nextInt();

        seg = new int[4 * n];
        build(0, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(seg[i]);
            if (i < n - 1) System.out.print(" ");
        }
        System.out.println();

        int min = Integer.MAX_VALUE;
        for (int i = l - 1; i <= r - 1; i++) {
            min = Math.min(min, arr[i]);
        }
        System.out.println(min);
    }

}
