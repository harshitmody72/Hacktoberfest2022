package queue;

import java.util.Stack;

//add -- O(n)
// remove-- O(1)
//peek -- O(1)
public class QueueUsingStackPush {
    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();
    public static boolean isEmpty(){
        return s1.isEmpty();
    }
    public static void add(int data){
        while (!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(data);

        while (!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }

    public static int remove(){
        if(isEmpty()){
            System.out.println("Empty");
            return -1;
        }
         return s1.pop();
    }

    public static int peek(){
        if (isEmpty()){
            System.out.println("Empty");
            return -1;
        }
        return s1.peek();
    }

    @Override
    public String toString() {
        return s1.toString();
    }

    public static void main(String[] args) {
        QueueUsingStackPush queue = new QueueUsingStackPush();
        queue.add(10);
        queue.add(40);
        queue.add(20);
        queue.add(70);
        queue.add(30);
        queue.add(110);
        System.out.println(queue.remove());
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue);
        add(111);
        System.out.println(queue);


    }

}
