import java.util .Scanner ;

public class L032_Pythagorian_triplet {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.println("Enet the irst number");
        a=sc.nextInt();
        int b;
        System.out.println("Enet the irst number");
        b=sc.nextInt();
        int c;
        System.out.println("Enet the irst number");
        c=sc.nextInt();
        if((a*a==(b*b+c*c))||(b*b==(c*c+a*a))||(c*c==(a*a+b*b))){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
