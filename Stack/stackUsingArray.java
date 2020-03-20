public class stackUsingArray{
    static class Stack{
        int top;
        int MAX;
        int[] stackArray;
        Stack(){
            top=-1;
            MAX = 1000;
            stackArray = new int[MAX];
        }
        
        boolean isStackEmpty(){
            return top==-1;
        }
        
        boolean isStackFull(){
            return top==MAX-1;
        }
        
        void push(int num){
            if(!isStackFull()){
                stackArray[++top] = num;
                System.out.println("pushed "+num);
            }
            else{
                System.out.println("stackOverFlow");
            }
        }
        
        void pop(){
            if(!isStackEmpty()){
                System.out.println("popped " + stackArray[top--]);
            }
            else{
                System.out.println("stack Empty");
            }
        }
        
        void peek(){
            if(!isStackEmpty()){
                System.out.println("peek " + stackArray[top]);
            }
            else{
                System.out.println("stack Empty");
            }
        }
    }
    public static void main(String []args){
        Stack s = new Stack();
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