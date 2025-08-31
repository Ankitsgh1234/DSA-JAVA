public class L153_AddElementAtLast {
     public static class Node{
        int data;
        Node next;
    }
    public static class LinkedList{
        int size;
        Node head;
        Node tail;

        void addLast(in val){
            if(size==0){
                Node temp=new Node();
                temp.data=val;
                temp.next=null;
                head=tail=temp;
                size++;
                
            }
        }




    }
    public static void main(String[] args) {
        
    }

}
