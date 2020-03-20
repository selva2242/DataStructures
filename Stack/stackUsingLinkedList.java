public class stackUsingLinkedList{
    Node root;
    static class Node{
        int val;
        Node next;
        Node(int x){
           val=x;
        }
    }
    boolean isStackEmpty(){
            return root==null;
        }
        
       
   void push(int num){
       Node a = new Node(num);
       if(isStackEmpty())
       root = a;
       else{
           Node temp = root;
           root = a;
           root.next = temp;
           }
           System.out.println("pushed "+ num);
       }
        
   void pop(){
       if(!isStackEmpty()){
           System.out.println("poped"+root.val);
           root = root.next;
       }
       else{
           System.out.println("stack Empty");
           }
       }
        
   void peek(){
       if(!isStackEmpty()){
           System.out.println("peek "+ root.val);
       }
       else{
           System.out.println("stack Empty");
           }
   }
   
    public static void main(String []args){
        stackUsingLinkedList s = new stackUsingLinkedList();
        s.pop();
        s.push(1);
        s.push(2);
        s.push(3);
        s.pop();
        s.peek();
        s.push(4);
        s.push(5);
        s.pop();
        s.peek();
    }
}