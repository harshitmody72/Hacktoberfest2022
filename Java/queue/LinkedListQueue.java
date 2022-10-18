package queue;
class Node{
    Node next;
    int value;
    Node(int data){
        value  = data;
        next = null;
    }
}

public class LinkedListQueue {
    Node head;
    Node tail;

    boolean isEmpty(){
        return head == null && tail == null;
    }

    void add(int data){
        Node current = new Node(data);
        if(tail == null){
            head = tail = current;
            return;
        }
        tail.next = current;
        tail = tail.next;

    }

    int remove(){
        if(isEmpty()){
            System.out.println("Empty");
            return -1;
        }
        int front = head.value;
        if(head ==tail)
            tail = null;

        head = head.next;

        return front;
    }

    int peek(){
        if(isEmpty()){
            System.out.println("EMpty");
            return -1;
        }

        int front = head.value;
        return front;
    }
    public static void main(String[] args) {
        LinkedListQueue queue = new LinkedListQueue();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        System.out.println("Remove: " + queue.remove());
        queue.add(20);
        while (!queue.isEmpty()){

            System.out.println(queue.peek());
            queue.remove();
        }

    }
}
