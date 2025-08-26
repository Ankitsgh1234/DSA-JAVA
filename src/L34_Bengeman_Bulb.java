import java.util.Scanner;

public class L34_Bengeman_Bulb {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter thee number of ulb please ");
        int c=sc.nextInt();
        for(int i=1;i*i<=c;i++){
            System.out.println(i*i);
        }
    }

}
