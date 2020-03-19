public class doublyLinkedList{
    Node Head;
     static class Node{
         int val;
         Node next;
         Node prev;
         Node(int x){
             val = x;
         }
     }
        
     static void printDLinkedList(Node head){
         Node n = head;
         while(n!=null){
            if(n.prev!=null)
            System.out.println("prev  " + n.prev.val);
            else
            System.out.println("prev  null");
            if(n.next!=null)
            System.out.println("next  " + n.next.val);
            else
            System.out.println("next  null");
            n = n.next;
         }
     }
     public static void main(String []args){
        doublyLinkedList dlinkedList = new doublyLinkedList();
         Node a = new Node(1);
         Node b = new Node(2);
         Node c = new Node(3);
         dlinkedList.Head = a;
         a.next = b;
         a.prev = null;
         b.next = c;
         b.prev = a;
         c.next = null;
         c.prev = b;
         printDLinkedList(dlinkedList.Head);
     }
}