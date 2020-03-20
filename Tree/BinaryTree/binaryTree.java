public class binaryTree{
    Node root;
     static class Node{
         Node right;
         Node left;
         int val;
         Node(int x){
             val = x;
             left = null;
             right = null;
         }
     }
     public static void main(String []args){
         binaryTree bTree = new binaryTree();
         Node a = new Node(1);
         Node b = new Node(2);
         Node c = new Node(3);
         a.left = b;
         a.right = c;
         bTree.root = a;
         System.out.println(a.val+ " a value");
         System.out.println(a.right+ " a right");
         System.out.println(a.left+ " a left");
         System.out.println(b.val+ " b value");
         System.out.println(b.right+ " b right");
         System.out.println(b.left+ " b left");
         System.out.println(c.val+ " c value");
         System.out.println(c.right+ " c right");
         System.out.println(c.left+ " c left");
     }
}