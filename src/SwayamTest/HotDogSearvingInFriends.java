package SwayamTest;

import java.util.Scanner;

public class HotDogSearvingInFriends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result;
        if (n <= 3) {
            result = n - 1;
        } else {
            result = 1;
            while (n > 4) {
                result *= 3;
                n -= 3;
            }
            result *= n;
        }

        System.out.println("Maximum friends served " + result);
        sc.close();
    }

}
