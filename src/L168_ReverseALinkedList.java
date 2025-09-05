public class L168_ReverseALinkedList {
    public static class Node{
        int data;
        Node next;    
    }

    public static class LinkedList{
        static int size;
       static Node head;
      static  Node tail;

        public static void addLast(int data){
            if(size==0){
                Node temp=new Node();
                temp.data=data;
                temp.next=null;
                head=tail=temp;
                size++;

            }
            else{
                Node temp=new Node();
                temp.data=data;
                tail.next=temp;
                tail=temp;
                size++; 

            }
        }
        public static int getFirst(){
            return head.data;
        }
        public static int getlast(){
            return tail.data;
        }

        public static int getind(int ind){
            if(ind<0||ind>size){
                return -1;
            }
            int i=1;
            Node temp=head;
            while(i!=ind){
                temp=temp.next;
                i++;
            }
            return temp.data;
        }
        public static void addFirst(int data){
            Node temp=new Node();
            temp.data=data;
            temp.next=head;
            head=temp;
            // return temp;
             
        }
        public static void Display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();

            size++;

        }
        public static void adIndex(int data,int ind){
            Node temp =head;
            Node ntemp=head;
            Node newNode=new Node();
            newNode.data=data;

            int i =0;
            while(i<ind-1){
                temp=temp.next;
                ntemp=temp.next;
                i++;
            }
            temp.next=newNode;
            newNode.next=ntemp;
            size++;


        }



        public static Node getNode(int ind) {
              if (ind < 0 || ind >= size) {
                  throw new IndexOutOfBoundsException("Invalid index: " + ind);
              }
             Node temp = head;
             for (int i = 0; i < ind; i++) {
             temp = temp.next;
    }
          return temp;
}


public static void reverse() {
    if (head == null || head.next == null) return; // empty or 1 node

    int li = 0;
    int ri = size - 1;
    while (li < ri) {
        Node left = getNode(li);
        Node right = getNode(ri);

        // swap data
        int temp = left.data;
        left.data = right.data;
        right.data = temp;

        li++;
        ri--;
    }
}



        public static void main(String[] args) {
            addLast(25);
            addLast(35);
            addLast(21);
            addLast(45);
            addLast(29);
            Display();
            addFirst(22);
            Display();
            adIndex(77, 2);
            Display();
            reverse();
            Display();
        }
    
    }    

}
