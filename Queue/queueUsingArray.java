public class queueUsingArray{
    static  int rear;
    static int capacity;
    static int[] queueArray;
    static int front = 0;
    queueUsingArray(int val){
        rear = -1;
        capacity = val;
        queueArray = new int[val];
    }
     
    static  boolean isQueueEmpty(){
        return rear == -1;
    }
    
    static boolean isQueueFull(){
        return rear == capacity-1;
    }
    static void enqueue(int val){
        if(!isQueueFull()){
            rear = rear +1;
            queueArray[rear] = val;
        }
        else{
            System.out.println("Queue Full");
        }
    }
    
    static void dequeue(){
        if(!isQueueEmpty()){
            for(int i=0;i<rear;i++)
            queueArray[i] = queueArray[i+1];
            queueArray[rear] = 0;
            rear = rear -1;
        }
        else{
            System.out.println("Queue Empty");
        }
    }
    
    static void getFront(){
        if(!isQueueEmpty()){
           System.out.println(queueArray[front]);
        }
        else{
            System.out.println("Queue Empty");
        }
    }
    
    static void getRear(){
        if(!isQueueEmpty()){
           System.out.println(queueArray[rear]);
        }
        else{
            System.out.println("Queue Empty");
        }
    }
    
    public static void main(String []args){
        queueUsingArray queue = new queueUsingArray(100);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.dequeue();
        queue.getFront();
        queue.getRear();
        queue.enqueue(7);
        queue.dequeue();
        queue.getFront();
        queue.getRear();


    }
}