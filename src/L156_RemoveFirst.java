public class L156_RemoveFirst {
    public static class Node{
       int data;
         Node next;
    }
    public static class LinkedList{
        static int size;
       static Node head;
       static Node tail;

       public static void addLast(int val){
            if(size==0){
                Node temp=new Node();
                temp.data=val;
                temp.next=null;
                head=tail=temp;
                size++;

            }
            else{
                Node temp=new Node();
                temp.data=val;
                tail.next=temp;
                tail=temp;
                size++; 

            }
        }
        public static void Display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();

        }

        public static void removeFisrt(){
            if(size==0){
                System.out.println("There is no element i Linked list ");
            }
            else{
                System.out.println(head.data+"  Has been removed ");
                head=head.next;
                size--;
            }

        }
        public static void main(String[] args) {
            addLast(90);
            addLast(80);
            addLast(65);
            Display();
            removeFisrt();
            Display();
            
        }
    }

}
