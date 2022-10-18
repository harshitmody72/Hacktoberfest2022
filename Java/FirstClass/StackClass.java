import java.util.Arrays;

public class StackClass {

    public static void main(String[] args) {
        StackImplementation s1 = new StackImplementation(5);
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(2);
        s1.push(5);
        System.out.println(s1);
        s1.peek();
        s1.pop();
        s1.peek();
        s1.pop();


    }



}
class StackImplementation<E>{
    Object[] arr ;
    int top;
    int capacity;

    StackImplementation(int size){
        arr = new Object[size];
        top = -1;
        capacity = size;
    }

    public void push(Object element){
        if(top == capacity -1){
            System.out.println("Stack OverFlow");
            return;
        }
        top ++ ;
        arr[top] = element;
    }

    public Object pop(){
        if(top == -1){
            System.out.println("Stack UnderFlow");
            return null ;
        }
        Object res = arr[top];
        arr[top] = null;
        top --;
        System.out.println("Popped: " + res.toString());
        return res;
    }
    public Object peek(){
        if(top == -1){
            System.out.println("Empty Stack");
            return null;
        }
        Object res = arr[top];
        System.out.println("Peek: " + res);
        return res;
    }

    @Override
    public String toString() {
        return "StackImplementation{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
}