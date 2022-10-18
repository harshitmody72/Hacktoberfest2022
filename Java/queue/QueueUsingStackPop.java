package queue;

import java.util.Stack;
//add -- O(1)
// remove-- O(n)
//peek -- O(n)
public class QueueUsingStackPop {
    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();

    public static boolean isEmpty(){
        return s1.isEmpty();
    }
    public static void add(int data){
        s1.push(data);
    }

    public static int remove(){
        if(isEmpty()){
            System.out.println("Empty");
            return -1;
        }
        while (!s1.isEmpty()){
            s2.push(s1.pop());
        }
        int a = s2.pop();

        while (!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return a;
    }

    public static int peek(){
        if(isEmpty()){
            System.out.println("Empty");
            return -1;
        }
        while (!s1.isEmpty()){
            s2.push(s1.pop());
        }
        int a = s2.peek();
        while (!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return a;
    }
    @Override
    public String toString() {
        return s1.toString();
    }

    public static void main(String[] args) {
        QueueUsingStackPop queue = new QueueUsingStackPop();
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
