package queue;

class Queue{
    static int[] arr;
    static int size , rear = -1;
    Queue(int size){
        arr = new int[size];
        Queue.size = size;
    }

    //Array Empty
    static boolean isEmpty(){
        return rear == -1;
    }

    // ADD
    public void enque(int data){
        if(rear == size-1){
            System.out.println("Size Full");
            return;
        }
        rear ++;
        arr[rear] = data;
    }

    // Delete
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Empty Array");
            return -1;
        }

        int front = arr[0];
        for(int i = 0 ; i < rear;i++){
            arr[i] = arr[i+1];
        }
        rear--;
        return front;
    }

    //peek
    int front(){
        if(isEmpty()){
            System.out.println("Empty array");
            return -1;
        }
        return arr[0];
    }

}


public class ArrayQueue {
    public static void main(String[] args) {
        Queue queue = new Queue(4);
        queue.enque(10);
        queue.enque(20);
        queue.enque(30);
        queue.enque(10);
        System.out.println("Peek "+queue.front());
        for(int i = 0 ; i < 5; i ++){
            System.out.println(queue.dequeue());
        }


    }
}
