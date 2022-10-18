package queue;
class CircularQueueImplementation{
    static int front = -1, rear = -1  , size , arr[];

    CircularQueueImplementation(int n){
        arr = new int[n];
        size = n;
    }

    boolean isEmpty(){
        return rear == -1 && front ==-1;
    }
    boolean full(){
        return front == rear +1;
    }
    //ADD
     void enque(int data){
        if(full()){
            System.out.println("Full");
            return;
        }
        if(front == -1){
            front = 0;
        }
        rear = (rear+1)%size;
        arr[rear] = data;
    }

    //Remove
    int dequeue(){
        if(isEmpty()){
            System.out.println("Empty");
            return -1;
        }
        int result = arr[front];
        //First Element
        if(rear == front){
            rear= front =-1;
        }else {
            front = (front+1)%size;
        }
        return result;
    }

    //Front
    int peek(){
        if(isEmpty()){
            System.out.println("Empty");
            return -1;
        }
        return arr[front];
    }
}

public class CircularQueue {

    public static void main(String[] args) {
        CircularQueueImplementation queue = new CircularQueueImplementation(5);
        queue.enque(10);
        queue.enque(20);
        queue.enque(30);
        queue.enque(40);
        queue.enque(50);
        System.out.println(queue.dequeue());
        queue.enque(20);
        while (!queue.isEmpty()){
            System.out.println(queue.dequeue());
        }




    }
}
