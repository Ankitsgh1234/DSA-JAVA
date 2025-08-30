import java.util.ArrayDeque;
import java.util.Queue;

public class L145_Queue {
    public static void main(String[] args) {
        Queue<Integer> qu=new ArrayDeque<>();
        qu.add(5);
        qu.add(8);
        System.out.println(qu);
        qu.add(6);
        System.out.println(qu);
        qu.add(15);
        System.out.println(qu);
        qu.remove();
        System.out.println(qu);
    }

}
