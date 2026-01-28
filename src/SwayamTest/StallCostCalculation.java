package SwayamTest;

import java.util.Scanner;

public class StallCostCalculation {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.next(); sc.next(); sc.next(); // skip strings
        int cost = sc.nextInt();

        if (n == 1) {
            System.out.println(cost);
        } else if (n == 2) {
            int tv = sc.nextInt();
            System.out.println(cost + tv * 100);
        } else if (n == 3) {
            int tv = sc.nextInt();
            int pro = sc.nextInt();
            System.out.println(cost + tv * 100 + pro * 500);
        } else {
            System.out.println("Invalid Input");
        }
    }

}
