class circularSinglyLinkedList{
    Node head;
    static class Node{
        int val;
        Node next;
        Node(int x){
            val = x;
        }
    }
    
    static void printList(Node head){
        Node n = head;
        while(n!=null){
            System.out.println(n.val);
            n = n.next;
        }
    }
    public static void main(String[] args){
        circularSinglyLinkedList lList= new circularSinglyLinkedList();
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        lList.head = a;
        a.next = b;
        b.next = c;
        c.next = a;
        printList(lList.head);
    }
}