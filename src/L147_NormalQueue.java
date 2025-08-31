import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

public class L147_NormalQueue {
   static int[] qu;
   static int size=0;
   static int n;
   static int f=0;
   static int e=0;


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
          n=sc.nextInt();
          qu = new int[n];
         add(5);
         add(12);
         display();
         remove();
         display();
        

 
        
    }
    public static void add(int val){
        if(size==n){
            System.out.println("Queue is full");
        }
        else{
            qu[e]=val;
            System.out.println(val+ " is added");
            e=(e+1)%n;
            size++;
        }
    }
    public static void remove(){
        if(size==0){
            System.out.println("Queue is emptu");
        }
        else{
            
            System.out.println(qu[f]+ " is removed");
            f=(f+1)%n;
            size--;
        }
    }
    public static void display( ){
        if(size==0){
            System.out.println("Queue is Empty");
        }
        else{
             for(int i=0;i<size;i++){
                System.out.print(qu[(f+i)%n]+ " ");

             }
             System.out.println();
        }
    }

}
